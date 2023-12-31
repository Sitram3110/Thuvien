package DAO;

import DTO.PhanLoaiSach;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhanLoaiSach_DAO implements DAO_Interface<PhanLoaiSach> {
    public static PhanLoaiSach_DAO getInstance() {
        return new PhanLoaiSach_DAO();
    }

    @Override
    public int add(PhanLoaiSach phanLoaiSach) {
        int rowsAffected = 0;
        String sql = "INSERT INTO dbo.[PhanLoaiSach] (maTheLoai, tenTheLoai) VALUES (?, ?)";
        try (Connection conn = KetNoiSQL.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, phanLoaiSach.getMaTheLoai());
            pst.setString(2, phanLoaiSach.getTenTheLoai());
            rowsAffected = pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rowsAffected;
    }

    @Override
    public int update(PhanLoaiSach phanLoaiSach) {
        int rowsAffected = 0;
        String sql = "UPDATE dbo.[PhanLoaiSach] SET tenTheLoai = ? WHERE maTheLoai = ?";
        try (Connection conn = KetNoiSQL.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, phanLoaiSach.getTenTheLoai());
            pst.setString(2, phanLoaiSach.getMaTheLoai());
            rowsAffected = pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rowsAffected;
    }

    @Override
    public int delete(String maTheLoai) {
        int rowsAffected = 0;
        String sql = "DELETE FROM dbo.[PhanLoaiSach] WHERE maTheLoai = ?";
        try (Connection conn = KetNoiSQL.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, maTheLoai);
            rowsAffected = pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rowsAffected;
    }

    @Override
    public List<PhanLoaiSach> selectAll() {
        List<PhanLoaiSach> rowSelected = new ArrayList<PhanLoaiSach>();
        try (Connection conn = KetNoiSQL.getConnection();
             PreparedStatement pst = conn.prepareStatement("SELECT * FROM dbo.[PhanLoaiSach]");
             ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                String maTheLoai = rs.getString("maTheLoai");
                String tenTheLoai = rs.getString("tenTheLoai");
                PhanLoaiSach phanLoaiSach = new PhanLoaiSach(maTheLoai, tenTheLoai);
                rowSelected.add(phanLoaiSach);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowSelected;
    }

//    public List<PhanLoaiSach> selectTheLoaiAll() {
//        List<PhanLoaiSach> rowSelected = new ArrayList<PhanLoaiSach>();
//        try (Connection conn = KetNoiSQL.getConnection();
//             PreparedStatement pst = conn.prepareStatement("SELECT DISTINCT maTheLoai, tenTheLoai FROM dbo.[PhanLoaiSach];");
//             ResultSet rs = pst.executeQuery()) {
//            while (rs.next()) {
//                String maTheLoai = rs.getString("maTheLoai");
//                String tenTheLoai = rs.getString("tenTheLoai");
//                PhanLoaiSach phanLoaiSach = new PhanLoaiSach(maTheLoai, "", "", "", tenTheLoai);
//                rowSelected.add(phanLoaiSach);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return rowSelected;
//        //SELECT DISTINCT maTheLoai, tenTheLoai FROM dbo.[PhanLoaiSach];
//    }

    @Override
    public PhanLoaiSach selectById(String maTheLoai) {
        PhanLoaiSach result = new PhanLoaiSach();
        String sql = "SELECT * FROM dbo.[PhanLoaiSach] WHERE maTheLoai = ?";
        try (Connection conn = KetNoiSQL.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, maTheLoai);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                result.setMaTheLoai(rs.getString("maTheLoai"));
                result.setTenTheLoai(rs.getString("tenTheLoai"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
