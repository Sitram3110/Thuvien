package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
//password máy Trâm: duckg0946945409

public class KetNoiSQL {
    public static String databaseName = "QuanLyThuVien";

    public static Connection getConnection() {
        String url = "net.sourceforge.jtds.jdbc.Driver";
        try {
            Class.forName(url);
            String dbUrl = "jdbc:jtds:sqlserver://localhost:1433/" + databaseName;
            return DriverManager.getConnection(dbUrl, "sa", "duckg0946945409");

            // return DriverManager.getConnection(dbUrl,user, pass);

        } catch (Exception ex) {
            Logger.getLogger(KetNoiSQL.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Connected to SQL server in catch");
            return null;

        }
    }

    public static void main(String[] args) {
        KetNoiSQL.getConnection();
        System.out.println("Connected to SQL server");
    }
}