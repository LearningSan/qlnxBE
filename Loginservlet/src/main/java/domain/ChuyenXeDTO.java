package domain;

public class ChuyenXeDTO {
	  private int maChuyenXe;
	 private String tenNhaXe;
	    private String gioKhoiHanh;
	    private double giaVe;


	    public ChuyenXeDTO() {
			super();
		}

		public ChuyenXeDTO(int maChuyenXe, String tenNhaXe, String gioKhoiHanh, double giaVe) {
			super();
			this.maChuyenXe = maChuyenXe;
			this.tenNhaXe = tenNhaXe;
			this.gioKhoiHanh = gioKhoiHanh;
			this.giaVe = giaVe;
		}

		public int getMaChuyenXe() {
			return maChuyenXe;
		}

		public void setMaChuyenXe(int maChuyenXe) {
			this.maChuyenXe = maChuyenXe;
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
