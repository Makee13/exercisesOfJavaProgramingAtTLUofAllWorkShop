package GGV;

import java.sql.*;
import java.util.*;


public class XLGV {

    Connection con = getCon();

    public Connection getCon() {
        Connection cn;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/dlgv", "root", "tranvanvu2001");
        } catch (Exception e) {
            return null;
        }
        return cn;
    }
    
    public ArrayList<Giangvien> getGV(String Donvi, int Soct) {
        ArrayList<Giangvien> lsgiangvien = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from tbgiangvien where Donvi = '" + Donvi + "' and Soct = " + Soct );
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Giangvien gv = new Giangvien();
                gv.setMaDD(rs.getString("MaDD"));                
                gv.setHoten(rs.getString("Hoten"));
                gv.setGT(rs.getBoolean("GT"));
                gv.setDonvi(rs.getString("Donvi"));
                gv.setSoct(rs.getInt("Soct"));
                lsgiangvien.add(gv);
            }
        } catch (Exception e) {
            return null;
        }
        return lsgiangvien;
    }
}
