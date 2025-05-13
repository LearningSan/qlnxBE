package Gui;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.KhachHangDao;
import Util.ConnectionManager;
import domain.KhachHang;

public class Test {
 public static void main(String[] args) {
	try {
		KhachHangDao dao= new KhachHangDao();
		List<KhachHang> ds=new ArrayList<KhachHang>();
		ds=dao.getDs();
		for (KhachHang khachHang : ds) {
			System.out.println(khachHang);
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
