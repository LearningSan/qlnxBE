	package Dao;
	
	import java.net.URLEncoder;
	import java.nio.charset.StandardCharsets;
	import java.sql.*;
	import java.util.*;
	
	import Util.ConnectionManager;
	import domain.KhachHang;
	
	public class KhachHangDao {
		private Connection con;
	
		
		public boolean findbyPhone(String sdt) {
		
			List<KhachHang> ds = getDs();  // getDs() is assumed to fetch all KhachHang from DB
	
		    for (KhachHang kh : ds) {
		        if (kh.getTaikhoan().equals(sdt) ) {
		            return true; // Found a matching user
		        }
		    }
	
		    return false; // Not found
		}
		public boolean findbyPassword(String sdt, String password) {
			
			List<KhachHang> ds = getDs();  // getDs() is assumed to fetch all KhachHang from DB
	
		    for (KhachHang kh : ds) {
		        if (kh.getTaikhoan().equals(sdt) && kh.getMatkhau().equals(password)) {
		            return true; // Found a matching user
		        }
		    }
	
		    return false; // Not found
		}
	
		public List<KhachHang> getDs() {
			try {
				con = ConnectionManager.getInstance().getConnection();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			List<KhachHang> ds = new ArrayList<KhachHang>();
	
			try {
				Statement stmt;
				stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from khachhang");
				while (rs.next()) {
					KhachHang cus = new KhachHang(rs.getInt("makh"), rs.getString("hoten"), rs.getString("email"),
							rs.getDate("ngaysinh"), rs.getString("diachi"), rs.getString("tentaikhoan"),
							rs.getString("matkhau"));
					ds.add(cus);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			return ds;
		}
	   
		public  String validateSign_in(String phone,String password) {
			try {
				con = ConnectionManager.getInstance().getConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 String error = "";
	
			    // Kiểm tra số điện thoại
			    error = checkPhone(phone);
			    if (!error.isEmpty()) return error;
	
			    // Kiểm tra mật khẩu
			    error = checkPassword(password);
			    if (!error.isEmpty()) return error;
	
			    // Kiểm tra đăng nhập
			    error = checkLogin(phone, password);
			    return error;
		}
		public String ValidateSign_up(String phone, String password, String confirmPassword) {
			try {
				con = ConnectionManager.getInstance().getConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			String error = "";
			 // Kiểm tra số điện thoại
		    error = checkPhone(phone);
		    if (!error.isEmpty()) return error;
	
		    // Kiểm tra mật khẩu
		    error = checkPassword(password);
		    if (!error.isEmpty()) return error;
	
		    // Kiểm tra mật khẩu xác nhận
		    error = checkConfirmPassword(password, confirmPassword);
		    if (!error.isEmpty()) return error;
	
		    // Kiểm tra số điện thoại đã tồn tại
		    error = checkPhoneExist(phone);
		    
		    // Cập nhật vào database nếu không có lỗi
		    if(error.isEmpty()) {
		    	updateNameandPassWordtoDB(phone, confirmPassword);
		    }
		    return error; 
		}
		public void updateNameandPassWordtoDB(String phone,String password) {
			try {
				String query="insert into khachhang(tentaikhoan,matkhau) values(?,?)";

				PreparedStatement pstmt=con.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
				pstmt.setString(1,phone);
				pstmt.setString(2, password);
				int affectRows=pstmt.executeUpdate();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		public String checkPhone(String phone) {
		    if (phone == null || phone.trim().isEmpty()) {
		        return "phoneError=" + URLEncoder.encode("Vui lòng nhập số điện thoại", StandardCharsets.UTF_8);
		    }
		    if (!phone.matches("\\d+")) {
		        return "phoneError=" + URLEncoder.encode("Số điện thoại phải là số", StandardCharsets.UTF_8);
		    }
		    return "";
		}
	
		public String checkPassword(String password) {
		    if (password == null || password.trim().isEmpty()) {
		        return "passwordError=" + URLEncoder.encode("Vui lòng nhập mật khẩu", StandardCharsets.UTF_8);
		    }
		    if (password.length() < 3) {
		        return "passwordError=" + URLEncoder.encode("Mật khẩu phải có ít nhất 3 ký tự", StandardCharsets.UTF_8);
		    }
		    return "";
		}
	
		public String checkLogin(String phone, String password) {
		    if (!findbyPhone(phone)) {
		        return "phoneError=" + URLEncoder.encode("Tài khoản không tồn tại", StandardCharsets.UTF_8);
		    }
		    if (!findbyPassword(phone, password)) {
		        return "passwordError=" + URLEncoder.encode("Mật khẩu không đúng", StandardCharsets.UTF_8);
		    }
		    return "";
		}
		
		private String checkConfirmPassword(String password, String confirmPassword) {
		    if (!password.equals(confirmPassword)) {
		        return "passwordError=" + URLEncoder.encode("Mật khẩu và xác nhận mật khẩu không khớp", StandardCharsets.UTF_8);
		    }
		    return "";
		}
	
		private String checkPhoneExist(String phone) {
		    if (findbyPhone(phone)) {
		        return "phoneError=" + URLEncoder.encode("Số điện thoại đã tồn tại", StandardCharsets.UTF_8);
		    }
		    return "";
		}
		
	}
