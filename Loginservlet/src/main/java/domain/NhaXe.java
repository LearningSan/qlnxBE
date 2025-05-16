package domain;

import java.util.*;

public class NhaXe {
    private int manhaxe;
    private String tennhaxe;
    private String hotline;
    private String email;
    private String website;
    private double danhgia;
    private List<LoaiXe> danhSachLoaiXe;
    private List<ChuyenXe> danhSachChuyenXe;
    private List<ThongTinNhaXe> danhSachThongTin;
    public NhaXe() {
		super();
	}
	
	public NhaXe(String tennhaxe, String hotline, String email, String website, double danhgia,
			List<LoaiXe> danhSachLoaiXe, List<ChuyenXe> danhSachChuyenXe, List<ThongTinNhaXe> danhSachThongTin) {
		super();
		this.tennhaxe = tennhaxe;
		this.hotline = hotline;
		this.email = email;
		this.website = website;
		this.danhgia = danhgia;
		this.danhSachLoaiXe = danhSachLoaiXe;
		this.danhSachChuyenXe = danhSachChuyenXe;
		this.danhSachThongTin = danhSachThongTin;
	}

	public NhaXe(int manhaxe, String tennhaxe, String hotline, String email, String website, double danhgia,
			List<LoaiXe> danhSachLoaiXe, List<ChuyenXe> danhSachChuyenXe, List<ThongTinNhaXe> danhSachThongTin) {
		super();
		this.manhaxe = manhaxe;
		this.tennhaxe = tennhaxe;
		this.hotline = hotline;
		this.email = email;
		this.website = website;
		this.danhgia = danhgia;
		this.danhSachLoaiXe = danhSachLoaiXe;
		this.danhSachChuyenXe = danhSachChuyenXe;
		this.danhSachThongTin = danhSachThongTin;
	}
	public int getManhaxe() {
		return manhaxe;
	}
	public void setManhaxe(int manhaxe) {
		this.manhaxe = manhaxe;
	}
	public String getTennhaxe() {
		return tennhaxe;
	}
	public void setTennhaxe(String tennhaxe) {
		this.tennhaxe = tennhaxe;
	}
	public String getHotline() {
		return hotline;
	}
	public void setHotline(String hotline) {
		this.hotline = hotline;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public double getDanhgia() {
		return danhgia;
	}
	public void setDanhgia(double danhgia) {
		this.danhgia = danhgia;
	}
	public List<LoaiXe> getDanhSachLoaiXe() {
		return danhSachLoaiXe;
	}
	public void setDanhSachLoaiXe(List<LoaiXe> danhSachLoaiXe) {
		this.danhSachLoaiXe = danhSachLoaiXe;
	}
	public List<ChuyenXe> getDanhSachChuyenXe() {
		return danhSachChuyenXe;
	}
	public void setDanhSachChuyenXe(List<ChuyenXe> danhSachChuyenXe) {
		this.danhSachChuyenXe = danhSachChuyenXe;
	}
	public List<ThongTinNhaXe> getDanhSachThongTin() {
		return danhSachThongTin;
	}
	public void setDanhSachThongTin(List<ThongTinNhaXe> danhSachThongTin) {
		this.danhSachThongTin = danhSachThongTin;
	}
	
}
