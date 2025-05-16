package domain;

import java.util.*;

public class ChuyenXe {
    private int macx;
    private LoaiXe xe;
    private HanhTrinh hanhTrinh;
    private NhaXe nhaXe;
    private NhanVien nhanVien;
    private Date gioKhoiHanh;
    private Date gioDen;
    private String trangThaiChuyenXe;
    private int soGheTrong;
    private int tongSoGhe;
    private double giaVe;
    private List<VeXe> danhSachVe;
    private List<PhanCong> danhSachPhanCong;
	public int getMacx() {
		return macx;
	}
	public void setMacx(int macx) {
		this.macx = macx;
	}
	public LoaiXe getXe() {
		return xe;
	}
	public void setXe(LoaiXe xe) {
		this.xe = xe;
	}
	public HanhTrinh getHanhTrinh() {
		return hanhTrinh;
	}
	public void setHanhTrinh(HanhTrinh hanhTrinh) {
		this.hanhTrinh = hanhTrinh;
	}
	public NhaXe getNhaXe() {
		return nhaXe;
	}
	public void setNhaXe(NhaXe nhaXe) {
		this.nhaXe = nhaXe;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public Date getGioKhoiHanh() {
		return gioKhoiHanh;
	}
	public void setGioKhoiHanh(Date gioKhoiHanh) {
		this.gioKhoiHanh = gioKhoiHanh;
	}
	public Date getGioDen() {
		return gioDen;
	}
	public void setGioDen(Date gioDen) {
		this.gioDen = gioDen;
	}
	public String getTrangThaiChuyenXe() {
		return trangThaiChuyenXe;
	}
	public void setTrangThaiChuyenXe(String trangThaiChuyenXe) {
		this.trangThaiChuyenXe = trangThaiChuyenXe;
	}
	public int getSoGheTrong() {
		return soGheTrong;
	}
	public void setSoGheTrong(int soGheTrong) {
		this.soGheTrong = soGheTrong;
	}
	public int getTongSoGhe() {
		return tongSoGhe;
	}
	public void setTongSoGhe(int tongSoGhe) {
		this.tongSoGhe = tongSoGhe;
	}
	public double getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}
	public List<VeXe> getDanhSachVe() {
		return danhSachVe;
	}
	public void setDanhSachVe(List<VeXe> danhSachVe) {
		this.danhSachVe = danhSachVe;
	}
	public List<PhanCong> getDanhSachPhanCong() {
		return danhSachPhanCong;
	}
	public void setDanhSachPhanCong(List<PhanCong> danhSachPhanCong) {
		this.danhSachPhanCong = danhSachPhanCong;
	}
	public ChuyenXe(int macx, LoaiXe xe, HanhTrinh hanhTrinh, NhaXe nhaXe, NhanVien nhanVien, Date gioKhoiHanh,
			Date gioDen, String trangThaiChuyenXe, int soGheTrong, int tongSoGhe, double giaVe, List<VeXe> danhSachVe,
			List<PhanCong> danhSachPhanCong) {
		super();
		this.macx = macx;
		this.xe = xe;
		this.hanhTrinh = hanhTrinh;
		this.nhaXe = nhaXe;
		this.nhanVien = nhanVien;
		this.gioKhoiHanh = gioKhoiHanh;
		this.gioDen = gioDen;
		this.trangThaiChuyenXe = trangThaiChuyenXe;
		this.soGheTrong = soGheTrong;
		this.tongSoGhe = tongSoGhe;
		this.giaVe = giaVe;
		this.danhSachVe = danhSachVe;
		this.danhSachPhanCong = danhSachPhanCong;
	}
	public ChuyenXe(LoaiXe xe, HanhTrinh hanhTrinh, NhaXe nhaXe, NhanVien nhanVien, Date gioKhoiHanh, Date gioDen,
			String trangThaiChuyenXe, int soGheTrong, int tongSoGhe, double giaVe, List<VeXe> danhSachVe,
			List<PhanCong> danhSachPhanCong) {
		super();
		this.xe = xe;
		this.hanhTrinh = hanhTrinh;
		this.nhaXe = nhaXe;
		this.nhanVien = nhanVien;
		this.gioKhoiHanh = gioKhoiHanh;
		this.gioDen = gioDen;
		this.trangThaiChuyenXe = trangThaiChuyenXe;
		this.soGheTrong = soGheTrong;
		this.tongSoGhe = tongSoGhe;
		this.giaVe = giaVe;
		this.danhSachVe = danhSachVe;
		this.danhSachPhanCong = danhSachPhanCong;
	}
	public ChuyenXe() {
		super();
	}
    
}
