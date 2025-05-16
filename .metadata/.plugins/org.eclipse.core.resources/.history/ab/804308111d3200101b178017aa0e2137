package Dao;

import java.sql.*;
import java.util.*;
import java.util.Date;

import Util.ConnectionManager;
import domain.GheNgoiDTO;

public class GheNgoiDao {
 private	Connection con;
 public GheNgoiDao() {
	 try {
		con=ConnectionManager.getInstance().getConnection();
	} catch (Exception e) {
		// TODO: handle exception
	}
 }
	 public List<GheNgoiDTO> getGheNgoiTheoHanhTrinh(String diemdi, String diemden, Date ngaydi) {
	        List<GheNgoiDTO> dsGhe = new ArrayList();
	        try  {
	    		con=ConnectionManager.getInstance().getConnection();

	    		String sql = "SELECT g.maghe,g.tenghe, g.trangthaighe\r\n"
	    				+ "FROM ghengoi g\r\n"
	    				+ "JOIN loaixe lx ON lx.maxe = g.maxe\r\n"
	    				+ "JOIN chuyenxe c ON lx.maxe = c.maxe\r\n"
	    				+ "JOIN hanhtrinh h ON c.maht = h.maht\r\n"
	    				+ "WHERE h.diemkhoihanh = ? AND h.diemden = ? AND DATE(c.giokhoihanh) = ?";
	            PreparedStatement stmt = con.prepareStatement(sql);
	            stmt.setString(1, diemdi);
	            stmt.setString(2, diemden);
	            stmt.setDate(3, new java.sql.Date(ngaydi.getTime()));

	            ResultSet rs = stmt.executeQuery();
	            while (rs.next()) {
	                GheNgoiDTO ghe = new GheNgoiDTO();
	                ghe.setMaghe(rs.getString("maghe"));
	                ghe.setTenghe(rs.getString("tenghe"));
	                ghe.setTrangthai(rs.getString("trangthaighe"));
	                dsGhe.add(ghe);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return dsGhe;
	    }
}
