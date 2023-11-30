package TEST;

import DAO.ChiTietPhieuNhap_DAO;
import DAO.PhieuMuon_DAO;
import DAO.PhieuNhapSach_DAO;
import DTO.ChiTietPhieuNhapSach;
import DTO.PhieuMuon;
import DTO.PhieuNhapSach;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class test {
    public static void main(String[] args) {
        // System.out.println(KiemTraNhap.getInstance().checkSpecialCharacters("DDFDfdss435"+"fsdfsdf"));
        PhieuMuon_DAO.getInstance().selectByUserId("3121410516");
    }
}
