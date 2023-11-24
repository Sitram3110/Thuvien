/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Sach;
import DTO.ThanhLySach;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tiena
 */
public class ThanhLy_DALL {
    
    public List<ThanhLySach> selectAll() {
        List<ThanhLySach> thanhLySachs = new ArrayList<>();
        Connection connection = KetNoiSQL.getConnection();
        try {
            Statement statement = connection.createStatement();
            String query = "select * from ThanhLySach";
            System.out.println(query);
			
            ResultSet rs =  statement.executeQuery(query);
			
            while(rs.next()) {
                String maThanhLySach = rs.getString("maThanhLySach");
                String maQuanLy = rs.getString("maQuanLy");
                String maSach = rs.getString("maSach");
                int soLuongSachHong = rs.getInt("soLuongSachHong");
                String lyDoThanhLy = rs.getString("lyDoThanhLy");
                LocalDate ngayThanhLy = rs.getDate("ngayThanhLy").toLocalDate();
                String ghiChu = rs.getString("ghiChu");
                double tongTienThanhLy = rs.getDouble("tongTienThanhLy");
                ThanhLySach thanhLySach = new ThanhLySach(maThanhLySach, maQuanLy, maSach, soLuongSachHong, lyDoThanhLy, ngayThanhLy, ghiChu, tongTienThanhLy);
                thanhLySachs.add(thanhLySach);
            }
            rs.close();
            statement.close();
            connection.close();
            return thanhLySachs;
			
        } catch (SQLException e) {
		System.out.println(e);
        }
        return thanhLySachs;
    }
    
    public List<Sach> selectidBook(){
        List<Sach>  maSachToTenSachMap = new ArrayList<>();
        Connection connection = KetNoiSQL.getConnection();
        try {
            Statement statement = connection.createStatement();
            String query = "select * from ThongtinSach";
            System.out.println(query);
			
            ResultSet rss =  statement.executeQuery(query);
			
            while(rss.next()) {
                String masach = rss.getString("maSach");
                String tensach = rss.getString("tenSach");
                Sach book = new Sach();
                book.setMaSach(masach);
                book.setTenSach(tensach);
                maSachToTenSachMap.add(book);
            }
            rss.close();
            statement.close();
            connection.close();
            return maSachToTenSachMap;
			
        } catch (SQLException e) {
		System.out.println(e);
        }
        return maSachToTenSachMap;
    }
    
    public boolean add(ThanhLySach thanhly) {
        Connection connection = KetNoiSQL.getConnection();

        try {
            // The SQL query with placeholders (?)
            String query = "INSERT INTO ThanhLySach (maQuanLy, maSach, soLuongSachHong, lyDoThanhLy, ngayThanhLy, ghiChu, tongTienThanhLy) VALUES (?, ?, ?, ?, ?, ?, ?)";

            // Create a PreparedStatement with RETURN_GENERATED_KEYS option
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            // Set values for the placeholders
            preparedStatement.setString(1, thanhly.getMaQuanLy());
            preparedStatement.setString(2, thanhly.getMaSach()); // Assuming maSach is the first column
            preparedStatement.setInt(3, thanhly.getSoLuongSachHong());
            preparedStatement.setString(4, thanhly.getLyDoThanhLy());
            preparedStatement.setDate(5, java.sql.Date.valueOf(thanhly.getNgayThanhLy()));
            preparedStatement.setString(6, thanhly.getGhiChu());
            preparedStatement.setDouble(7, thanhly.getTongTienThanhLy());

            // Execute the query
            preparedStatement.executeUpdate();

            // Retrieve the generated keys (maThanhLySach)
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                int maThanhLySach = generatedKeys.getInt(1);
                thanhly.setMaThanhLySach(String.valueOf(maThanhLySach));
            }

            // Close the ResultSet and PreparedStatement
            generatedKeys.close();
            preparedStatement.close();
            connection.close();
            return true;

        } catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions appropriately in your application
        }
        return false;
    }

    
    public boolean Update(ThanhLySach thanhly){
        Connection connection = KetNoiSQL.getConnection();

        try {
            // The SQL query with placeholders (?)
            String query = "UPDATE ThanhLySach "+
			    "SET maSach=?, soLuongSachHong=?, lyDoThanhLy=?, ghiChu= ?, tongTienThanhLy = ?"+
			    " WHERE maThanhLySach= ?";
            System.out.println(query);
            // Create a PreparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            // Set values for the placeholders
            preparedStatement.setString(1, thanhly.getMaSach());
            preparedStatement.setInt(2, thanhly.getSoLuongSachHong());
            preparedStatement.setString(3, thanhly.getLyDoThanhLy());
            preparedStatement.setString(4, thanhly.getGhiChu()); // Assuming ngayThanhLy is of LocalDate type
            preparedStatement.setDouble(5, thanhly.getTongTienThanhLy());
            preparedStatement.setString(6, thanhly.getMaThanhLySach());

            // Execute the query
            preparedStatement.executeUpdate();
            
            // Close the PreparedStatement
            preparedStatement.close();
            connection.close();
            return true;

        } catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions appropriately in your application
        }
        return false;
    }
    
    public boolean delete (String id){
        Connection connection = KetNoiSQL.getConnection();

        try {
            // The SQL query with placeholders (?)
            String query = "DElete ThanhLySach "+
			    " WHERE maThanhLySach= ?";
            System.out.println(query);
            // Create a PreparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            // Set values for the placeholders
            preparedStatement.setString(1, id);
            

            // Execute the query
            preparedStatement.executeUpdate();
            
            // Close the PreparedStatement
            preparedStatement.close();
            connection.close();
            return true;

        } catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions appropriately in your application
        }
        return false;
    }
    
    public int GetSoLuongSachHongByIdBook(ThanhLySach thanhly){
        int Soluong = 0;
        Connection connection = KetNoiSQL.getConnection();
        try {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM khoSach WHERE maSach = '" + thanhly.getMaSach() + "'";
            System.out.println(query);
			
            ResultSet rss =  statement.executeQuery(query);
			
            while(rss.next()) {
                Soluong= rss.getInt("soLuongSachHong");
            }
            rss.close();
            statement.close();
            connection.close();
            return Soluong;
			
        } catch (SQLException e) {
		System.out.println(e);
        }
        return Soluong;
    }
    
    public int GetSoLuongSachHongByIdThanhLy(ThanhLySach thanhly){
        int Soluong = 0;
        Connection connection = KetNoiSQL.getConnection();
        try {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM ThanhLySach WHERE maThanhLySach = '" + thanhly.getMaThanhLySach() + "'";
            System.out.println(query);
			
            ResultSet rss =  statement.executeQuery(query);
			
            while(rss.next()) {
                Soluong= rss.getInt("soLuongSachHong");
            }
            rss.close();
            statement.close();
            connection.close();
            return Soluong;
			
        } catch (SQLException e) {
		System.out.println(e);
        }
        return Soluong;
    }
    
        public void UpdateKhoAfterAdd(ThanhLySach thanhly){
            Connection connection = KetNoiSQL.getConnection();
            try {
                // The SQL query with placeholders (?)
                String query = "UPDATE khoSach "+
                                "SET soLuongSachHong = soLuongSachHong - ?, tongSoLuong = tongSoLuong - ? "+
                                "WHERE maSach = ?";
                System.out.println(query);
                // Create a PreparedStatement
                PreparedStatement preparedStatement = connection.prepareStatement(query);

                // Set values for the placeholders
                preparedStatement.setInt(1, thanhly.getSoLuongSachHong());
                preparedStatement.setInt(2, thanhly.getSoLuongSachHong());
                preparedStatement.setString(3, thanhly.getMaSach());


                // Execute the query
                preparedStatement.executeUpdate();

                // Close the PreparedStatement
                preparedStatement.close();
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace(); // Handle exceptions appropriately in your application
            }
        
    }
    
    public void UpdateKhoAfterUpdateSlg(ThanhLySach thanhly, int soluong){
            Connection connection = KetNoiSQL.getConnection();
            try {
                // The SQL query with placeholders (?)
                String query = "UPDATE khoSach "+
                                "SET soLuongSachHong = soLuongSachHong + ?, tongSoLuong = tongSoLuong + ? "+
                                "WHERE maSach = ?";
                System.out.println(query);
                // Create a PreparedStatement
                PreparedStatement preparedStatement = connection.prepareStatement(query);

                // Set values for the placeholders
                preparedStatement.setInt(1, soluong);
                preparedStatement.setInt(2, soluong);
                preparedStatement.setString(3, thanhly.getMaSach());


                // Execute the query
                preparedStatement.executeUpdate();

                // Close the PreparedStatement
                preparedStatement.close();
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace(); // Handle exceptions appropriately in your application
            }
        
    }
    
    public void UpdateKhoAfterUpdateIdBook(String idthanhlycu, int soluongcu, String idthanhlymoi, int soluongmoi){
            Connection connection = KetNoiSQL.getConnection();
            try {
                // The SQL query with placeholders (?)
                String query = "UPDATE khoSach "+
                                "SET soLuongSachHong = soLuongSachHong + ?, tongSoLuong = tongSoLuong + ? "+
                                "WHERE maSach = ?";
                System.out.println(query);
                // Create a PreparedStatement
                PreparedStatement preparedStatement = connection.prepareStatement(query);

                // Set values for the placeholders
                preparedStatement.setInt(1, soluongcu);
                preparedStatement.setInt(2, soluongcu);
                preparedStatement.setString(3, idthanhlycu);

                soluongmoi = -soluongmoi;
                // Execute the query
                preparedStatement.executeUpdate();
                
                preparedStatement.setInt(1, soluongmoi);
                preparedStatement.setInt(2, soluongmoi);
                preparedStatement.setString(3, idthanhlymoi);


                // Execute the query
                preparedStatement.executeUpdate();
                
                

                // Close the PreparedStatement
                preparedStatement.close();
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace(); // Handle exceptions appropriately in your application
            }
        
    }
    
    public void UpdateKhoAfterDelete(ThanhLySach thanhLy){
            Connection connection = KetNoiSQL.getConnection();
            try {
                // The SQL query with placeholders (?)
                String query = "UPDATE khoSach "+
                                "SET soLuongSachHong = soLuongSachHong + ?, tongSoLuong = tongSoLuong + ? "+
                                "WHERE maSach = ?";
                System.out.println(query);
                // Create a PreparedStatement
                PreparedStatement preparedStatement = connection.prepareStatement(query);

                // Set values for the placeholders
                preparedStatement.setInt(1, thanhLy.getSoLuongSachHong());
                preparedStatement.setInt(2, thanhLy.getSoLuongSachHong());
                preparedStatement.setString(3, thanhLy.getMaSach());

                
                


                // Execute the query
                preparedStatement.executeUpdate();
                
                

                // Close the PreparedStatement
                preparedStatement.close();
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace(); // Handle exceptions appropriately in your application
            }
        
    }
    
    
        
    public double getprincebook(String idbook){
        double prince = 0;
        Connection connection = KetNoiSQL.getConnection();
        try {
            Statement statement = connection.createStatement();
            String query = "select giaTienSach from ThongTinSach";
            System.out.println(query);
			
            ResultSet rs =  statement.executeQuery(query);
			
            while(rs.next()) {
                prince = rs.getDouble("giaTienSach");              
            }
            rs.close();
            statement.close();
            connection.close();
            System.out.println(prince);
            return prince;
			
        } catch (SQLException e) {
		System.out.println(e);
        }
        return prince;
    }
    
    public List<String> getIdQuanLy(){
        List<String> IDQLys = new ArrayList<>();
        Connection connection = KetNoiSQL.getConnection();
        try {
            Statement statement = connection.createStatement();
            String query = "select maQuanLy from QuanLy ";
            System.out.println(query);
			
            ResultSet rs =  statement.executeQuery(query);
			
            while(rs.next()) {
                String maQuanLy = rs.getString("maQuanLy");
                
                IDQLys.add(maQuanLy);
            }
            rs.close();
            statement.close();
            connection.close();
            return IDQLys;
			
        } catch (SQLException e) {
		System.out.println(e);
        }
        return IDQLys;
    }
    
    
    public List<ThanhLySach> loaddatatoExport(String id) {
        List<ThanhLySach> thanhLySachs = new ArrayList<>();
        Connection connection = KetNoiSQL.getConnection();
        try {
            Statement statement = connection.createStatement();
            String query = "select * from ThanhLySach where maThanhLySach = '" +id + "'";
            System.out.println(query);
			
            ResultSet rs =  statement.executeQuery(query);
			
            while(rs.next()) {
                String maThanhLySach = rs.getString("maThanhLySach");
                String maQuanLy = rs.getString("maQuanLy");
                String maSach = rs.getString("maSach");
                int soLuongSachHong = rs.getInt("soLuongSachHong");
                String lyDoThanhLy = rs.getString("lyDoThanhLy");
                LocalDate ngayThanhLy = rs.getDate("ngayThanhLy").toLocalDate();
                String ghiChu = rs.getString("ghiChu");
                double tongTienThanhLy = rs.getDouble("tongTienThanhLy");
                ThanhLySach thanhLySach = new ThanhLySach(maThanhLySach, maQuanLy, maSach, soLuongSachHong, lyDoThanhLy, ngayThanhLy, ghiChu, tongTienThanhLy);
                thanhLySachs.add(thanhLySach);
            }
            rs.close();
            statement.close();
            connection.close();
            return thanhLySachs;
			
        } catch (SQLException e) {
		System.out.println(e);
        }
        return thanhLySachs;
    }
    
    public List<ThanhLySach> search(String searchTerm){
        List<ThanhLySach> thanhLySachs = new ArrayList<>();
        Connection connection = KetNoiSQL.getConnection();
        try {
            try (Statement statement = connection.createStatement()) {
                String query = "SELECT * FROM thanhLySach " +
                           " WHERE maThanhLySach LIKE '%" + searchTerm + "%' " +
                           " OR maSach  LIKE '%" + searchTerm + "%'";
                System.out.println(query);
                
                ResultSet rs =  statement.executeQuery(query);
			
                while(rs.next()) {
                    String maThanhLySach = rs.getString("maThanhLySach");
                    String maQuanLy = rs.getString("maQuanLy");
                    String maSach = rs.getString("maSach");
                    int soLuongSachHong = rs.getInt("soLuongSachHong");
                    String lyDoThanhLy = rs.getString("lyDoThanhLy");
                    LocalDate ngayThanhLy = rs.getDate("ngayThanhLy").toLocalDate();
                    String ghiChu = rs.getString("ghiChu");
                    double tongTienThanhLy = rs.getDouble("tongTienThanhLy");
                    ThanhLySach thanhLySach = new ThanhLySach(maThanhLySach, maQuanLy, maSach, soLuongSachHong, lyDoThanhLy, ngayThanhLy, ghiChu, tongTienThanhLy);
                    thanhLySachs.add(thanhLySach);
                }
            }
            connection.close();
            return thanhLySachs;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return thanhLySachs;
    }
    
}
