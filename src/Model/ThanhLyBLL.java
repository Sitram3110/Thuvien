/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DAO.ThanhLySach_DAO;
import DAO.ThanhLy_DALL;
import DAO.khosach_DAL;
import DTO.KhoSach;
import DTO.Sach;
import DTO.ThanhLySach;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

/**
 *
 * @author tiena
 */
public class ThanhLyBLL {
    ThanhLy_DALL thanhLy_DALL = new ThanhLy_DALL();
    ThanhLySach_DAO thanhLySach_DAO = new ThanhLySach_DAO();
    khosach_DAL khoDAL = new khosach_DAL();
    public AbstractMap.SimpleEntry<List<Sach>, List<ThanhLySach>> loaddata() {
        List<Sach> books = thanhLy_DALL.selectidBook();
        List<ThanhLySach> thanhLySachs = thanhLySach_DAO.selectAll();
        return processLists(books, thanhLySachs);
    }

    public static AbstractMap.SimpleEntry<List<Sach>, List<ThanhLySach>> processLists(List<Sach> bookList, List<ThanhLySach> thanhLySachList) {
        List<Sach> processedBooks = new ArrayList<>();
        List<ThanhLySach> processedExports = new ArrayList<>();

        // Duyệt qua danh sách thanh lý sách
        for (ThanhLySach thanhLySach : thanhLySachList) {
            // Duyệt qua danh sách sách
            for (Sach book : bookList) {
                // Nếu mã sách khớp, thêm vào danh sách kết quả
                if (thanhLySach.getMaSach().equals(book.getMaSach())) {
                    processedBooks.add(book);
                    processedExports.add(thanhLySach);
                    break;  // Dừng vòng lặp khi tìm thấy sự khớp
                }
            }
        }

        // Trả về cả hai danh sách sử dụng SimpleEntry
        return new AbstractMap.SimpleEntry<>(processedBooks, processedExports);
    }
    
    public boolean Add(ThanhLySach thanhly){
        if(thanhly.getSoLuongSachHong() <= 0){
            return false;
        }else if(thanhLy_DALL.GetSoLuongSachHongByIdBook(thanhly)< thanhly.getSoLuongSachHong()){
            return false;
        }
        List<Sach> books = thanhLy_DALL.selectidBook();
        for(Sach sach : books){
            if(thanhly.getMaSach().equals(sach.getMaSach())){
                thanhLy_DALL.add(thanhly);
                thanhLy_DALL.UpdateKhoAfterAdd(thanhly);
                return true;
            }
        }
        return false;
    }
    
    public boolean Update(ThanhLySach thanhly){
        int total = thanhLy_DALL.GetSoLuongSachHongByIdBook(thanhly)+ thanhLy_DALL.GetSoLuongSachHongByIdThanhLy(thanhly);
        
        List<ThanhLySach> thanhlynow = thanhLy_DALL.loaddatatoExport(thanhly.getMaThanhLySach());
        List<KhoSach> kho = khoDAL.getKhoSachIntoId(thanhly.getMaSach());
        ThanhLySach thanhly1 = thanhlynow.get(0);
        KhoSach kho1 = kho.get(0);
        System.out.println(total);
        if(thanhly.getSoLuongSachHong() <= 0){
            return false;
        }else if(thanhly.getMaSach().equals(thanhly1.getMaSach()) 
                && thanhly1.getSoLuongSachHong() == thanhly.getSoLuongSachHong() 
                && thanhly1.getLyDoThanhLy().equals(thanhly.getLyDoThanhLy()) 
                && thanhly1.getGhiChu().equals(thanhly.getGhiChu())){
            return false;
        }else if(thanhly.getSoLuongSachHong()> total){
            return false;
        }else if(thanhly1.getMaSach().equals(thanhly.getMaSach()) && kho1.getSoLuongSachHong()> thanhly1.getSoLuongSachHong()){
            int i = thanhly1.getSoLuongSachHong() - thanhly.getSoLuongSachHong();           
            thanhLy_DALL.Update(thanhly);
            thanhLy_DALL.UpdateKhoAfterUpdateSlg(thanhly, i);
            return true;
        }
        List<Sach> books = thanhLy_DALL.selectidBook();
        for(Sach sach : books){
            if(thanhly.getMaSach().equals(sach.getMaSach())){
                thanhLy_DALL.Update(thanhly);
                thanhLy_DALL.UpdateKhoAfterUpdateIdBook(thanhly1.getMaSach(), thanhly1.getSoLuongSachHong(),
                        thanhly.getMaSach(), thanhly.getSoLuongSachHong());
                return true;
            }
        }
        return false;
    }
    
    
    
    public boolean delete (String id){
        List<ThanhLySach> thanhlynow = thanhLy_DALL.loaddatatoExport(id);
        ThanhLySach thanhly1 = thanhlynow.get(0);
        if(thanhLy_DALL.delete(id)){      
            thanhLy_DALL.UpdateKhoAfterDelete(thanhly1);
            return true;
        }
        return false;
    }
    
    public boolean exportToExcel(AbstractMap.SimpleEntry<List<Sach>, List<ThanhLySach>> danhSachThanhLy, String filePath) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Phiếu xuất ");
            
             Font titleFont = workbook.createFont();
            titleFont.setBold(true);
            titleFont.setFontHeightInPoints((short) 16);

            CellStyle titleStyle = workbook.createCellStyle();
            titleStyle.setAlignment(HorizontalAlignment.CENTER);
            titleStyle.setFont(titleFont);
            sheet.addMergedRegion(new CellRangeAddress(0, 0, 2, 4));
            
            
            
            // Tạo Font và CellStyle cho nội dung
            Font contentFont = workbook.createFont();
            contentFont.setFontHeightInPoints((short) 8);

            CellStyle contentStyle = workbook.createCellStyle();
            contentStyle.setFont(contentFont);

            // Tạo tiêu đề
            Row titleRow = sheet.createRow(0);
            Cell titleCell = titleRow.createCell(2);
            titleCell.setCellValue("PHIẾU XUẤT");
            titleCell.setCellStyle(titleStyle);

            // Tạo các ô chứa thông tin
            for (int i = 1; i <= 4; i++) {
                Row row = sheet.createRow(i);
                Cell cell = row.createCell(0);
                cell.setCellStyle(contentStyle);
                switch (i) {
                    case 1:
                        
                        cell.setCellValue("TRUNG TÂM HỌC LIỆU TRƯỜNG ĐẠI HỌC SÀI GÒN");
                        sheet.addMergedRegion(new CellRangeAddress(1, 1, 0, 1));
                        break;
                    case 2:
                        
                        cell.setCellValue("Địa chỉ: 273 An Dương Vương, Phường 3, Quận 5,Thành phố Hồ Chí Minh");
                        sheet.addMergedRegion(new CellRangeAddress(2, 2, 0, 3));
            
                        break;
                    case 3:
                        
                        cell.setCellValue("Điện thoại: (028)38354004");
                        sheet.addMergedRegion(new CellRangeAddress(3, 3, 0, 1));
            
                        break;
                    case 4:
                        
                        cell.setCellValue("Email: tt_hoclieu@sgu.edu.vn");
                        sheet.addMergedRegion(new CellRangeAddress(4, 4, 0, 1));
                        break;
                }
            }

            // Tạo hàng đầu tiên (tiêu đề)
            Row headerRow = sheet.createRow(6);
            headerRow.createCell(0).setCellValue("Mã Thanh Lý Sách");
            headerRow.createCell(1).setCellValue("Mã Quản Lý");
            headerRow.createCell(2).setCellValue("Mã Sách");
            headerRow.createCell(3).setCellValue("Tên Sách");
            headerRow.createCell(4).setCellValue("Số lượng");
            headerRow.createCell(5).setCellValue("Lý do");
            headerRow.createCell(6).setCellValue("Ngày thanh lý");
            headerRow.createCell(7).setCellValue("Ghi chú");
            headerRow.createCell(8).setCellValue("Tổng tiền");

            // Duyệt danh sách và thêm dữ liệu vào bảng Excel
            int rowNum = 7;
            List<Sach> sachList = danhSachThanhLy.getKey();
            List<ThanhLySach> thanhLyList = danhSachThanhLy.getValue();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            double total = 0;

            for (ThanhLySach thanhLy : thanhLyList) {
                total = total + thanhLy.getTongTienThanhLy();
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(thanhLy.getMaThanhLySach());
                row.createCell(1).setCellValue(thanhLy.getMaQuanLy());
                row.createCell(2).setCellValue(thanhLy.getMaSach());

                // Find the corresponding Sach
                Sach correspondingSach = findCorrespondingSach(thanhLy.getMaSach(), sachList);
                if (correspondingSach != null) {
                    row.createCell(3).setCellValue(correspondingSach.getTenSach());
                    // Add more data for Sach if needed
                }

                row.createCell(4).setCellValue(thanhLy.getSoLuongSachHong());
                row.createCell(5).setCellValue(thanhLy.getLyDoThanhLy());
                String ngayThanhLyString = thanhLy.getNgayThanhLy().format(formatter);
                row.createCell(6).setCellValue(ngayThanhLyString);
                row.createCell(7).setCellValue(thanhLy.getGhiChu());
                row.createCell(8).setCellValue(thanhLy.getTongTienThanhLy());
                // Add more data for ThanhLySach

                // Continue with other columns...
            }
            Row row = sheet.createRow(rowNum);
            row.createCell(7).setCellValue("Tổng tiền phạt");
            row.createCell(8).setCellValue(total);
             // Tự động điều chỉnh chiều rộng của các cột
            autoSizeColumns(sheet);

            // Ghi workbook vào một file
            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
                workbook.write(fileOut);
            }

            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public AbstractMap.SimpleEntry<List<Sach>, List<ThanhLySach>> loaddatatoExport(String id) {
        List<Sach> books = thanhLy_DALL.selectidBook();
        List<ThanhLySach> thanhLySachs = thanhLy_DALL.loaddatatoExport(id);
        return processLists(books, thanhLySachs);
    }
    
    public boolean exportToWord(AbstractMap.SimpleEntry<List<Sach>, List<ThanhLySach>> danhSachThanhLy, String filePath) {
        try (XWPFDocument document = new XWPFDocument()) {
            
            XWPFParagraph logo = document.createParagraph();
            XWPFRun logoRun = logo.createRun();
            logoRun.setFontSize(8);
            logoRun.setText("TRUNG TÂM HỌC LIỆU TRƯỜNG ĐẠI HỌC SÀI GÒN");
            logoRun.addBreak();
            logoRun.setText("Địa chỉ: 273 An Dương Vương, Phường 3, Quận 5,Thành phố Hồ Chí Minh");
            logoRun.addBreak();
            logoRun.setText("Điện thoại: (028)38354004");
            logoRun.addBreak();
            logoRun.setText("Email: tt_hoclieu@sgu.edu.vn");
            logoRun.addBreak();

            //title
            XWPFParagraph title = document.createParagraph();
            title.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun titleRun = title.createRun();
            titleRun.setBold(true);
            titleRun.setFontSize(16);
            titleRun.setText("PHIẾU XUẤT");
            

            List<Sach> sachList = danhSachThanhLy.getKey();
            List<ThanhLySach> thanhLyList = danhSachThanhLy.getValue();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            XWPFTable table = document.createTable();
            XWPFTableRow row;

            for (int i = 0; i < thanhLyList.size(); i++) {
                ThanhLySach thanhLy = thanhLyList.get(i);
       
                
                row = table.createRow();
                row.createCell().setText("Mã Thanh Lý Sách");
                row.createCell().setText(thanhLy.getMaThanhLySach());

                // Set values for the second row
                row = table.createRow();
                row.createCell().setText("Mã Quản Lý");
                row.createCell().setText(thanhLy.getMaQuanLy());

                
                row = table.createRow();
                row.createCell().setText("Mã Sách");
                row.createCell().setText(thanhLy.getMaSach());
                    
                
                Sach correspondingSach = findCorrespondingSach(thanhLy.getMaSach(), sachList);
                row = table.createRow();
                row.createCell().setText("Tên Sách");
                if (correspondingSach != null) {
                    row.createCell().setText(correspondingSach.getTenSach());
                    // Add more data for Sach if needed
                }

                row = table.createRow();
                row.createCell().setText("Số lượng");
                row.createCell().setText(String.valueOf(thanhLy.getSoLuongSachHong()));

                row = table.createRow();
                row.createCell().setText("Lý do");
                row.createCell().setText(thanhLy.getLyDoThanhLy());

                row = table.createRow();
                row.createCell().setText("Ngày thanh lý");
                String ngayThanhLyString = thanhLy.getNgayThanhLy().format(formatter);
                row.createCell().setText(ngayThanhLyString);

                row = table.createRow();
                row.createCell().setText("Ghi chú");
                row.createCell().setText(thanhLy.getGhiChu());

                row = table.createRow();
                row.createCell().setText("Tổng tiền");
                row.createCell().setText(String.valueOf(thanhLy.getTongTienThanhLy()));
            }
            
            // Tự động điều chỉnh chiều rộng của các cột
            

            // Ghi document vào một file Word
            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
                document.write(fileOut);
            }

            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    

    private Sach findCorrespondingSach(String maSach, List<Sach> sachList) {
        for (Sach sach : sachList) {
            if (maSach.equals(sach.getMaSach())) {
                return sach;
            }
        }
        return null; // If no corresponding Sach is found
    }
    
    private static void autoSizeColumns(Sheet sheet) {
        int numberOfColumns7 = sheet.getRow(6).getPhysicalNumberOfCells();
        for (int i = 0; i < numberOfColumns7; i++) {
            sheet.autoSizeColumn(i);
        }
        int numberOfColumns8 = sheet.getRow(7).getPhysicalNumberOfCells();
        for (int i = 0; i < numberOfColumns8; i++) {
            sheet.autoSizeColumn(i);
        }
    }
    
    
    public double tinhtienthanhly(ThanhLySach thanhLySach){
        double prince = 0;
        double princebook = thanhLy_DALL.getprincebook(thanhLySach.getMaSach());  
        float phantramthanhtoan = 0;
            switch (thanhLySach.getLyDoThanhLy()) {
                case "Hư hỏng mức ít":
                    phantramthanhtoan = 0.95f;
                    break;
                case "Hư hỏng mức vừa":
                    phantramthanhtoan = 0.85f;
                    break;
                case "Hư hỏng mức nhiều":
                    phantramthanhtoan = 0.65f;
                    break;
                default:
                    phantramthanhtoan = 0.15f;
                    break;
            }
        
        prince = princebook*phantramthanhtoan*thanhLySach.getSoLuongSachHong();
        System.out.println(phantramthanhtoan);
        System.out.println(prince);
        return prince;
    }
    
    public List<String> getIdQuanLy(){
        return thanhLy_DALL.getIdQuanLy();
    }
    
    public AbstractMap.SimpleEntry<List<Sach>, List<ThanhLySach>> search(String id) {
        List<Sach> books = thanhLy_DALL.selectidBook();
        List<ThanhLySach> thanhLySachs = thanhLy_DALL.search(id);
        return processLists(books, thanhLySachs);
    }
}
