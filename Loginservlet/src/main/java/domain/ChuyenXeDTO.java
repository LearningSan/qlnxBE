package domain;

public class ChuyenXeDTO {
	 private String tenNhaXe;
	    private String gioKhoiHanh;
	    private double giaVe;

	    public ChuyenXeDTO(String tenNhaXe, String gioKhoiHanh, double giaVe) {
	        this.tenNhaXe = tenNhaXe;
	        this.gioKhoiHanh = gioKhoiHanh;
	        this.giaVe = giaVe;
	    }

	    public String getTenNhaXe() {
	        return tenNhaXe;
	    }

	    public void setTenNhaXe(String tenNhaXe) {
	        this.tenNhaXe = tenNhaXe;
	    }

	    public String getGioKhoiHanh() {
	        return gioKhoiHanh;
	    }

	    public void setGioKhoiHanh(String gioKhoiHanh) {
	        this.gioKhoiHanh = gioKhoiHanh;
	    }

	    public double getGiaVe() {
	        return giaVe;
	    }

	    public void setGiaVe(double giaVe) {
	        this.giaVe = giaVe;
	    }
}
