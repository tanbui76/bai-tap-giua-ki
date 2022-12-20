package QuanliCLB.model;

import java.util.Date;

public class PhanCongGiangDay {
	private String idPhanCongGiangDay;
	private String idGiaoVien;
	private String idLop;
	private String idMonHoc;
	private Date ngayGiangDay;
	private String soTietDay;
	public PhanCongGiangDay() {
		
	}

	public PhanCongGiangDay(String idPhanCongGiangDay, String idGiaoVien, String idLop, String idMonHoc,
			Date ngayGiangDay, String soTietDay) {
		super();
		this.idPhanCongGiangDay = idPhanCongGiangDay;
		this.idGiaoVien = idGiaoVien;
		this.idLop = idLop;
		this.idMonHoc = idMonHoc;
		this.ngayGiangDay = ngayGiangDay;
		this.soTietDay = soTietDay;
	}

	public String getIdPhanCongGiangDay() {
		return idPhanCongGiangDay;
	}
	public void setIdPhanCongGiangDay(String idPhanCongGiangDay) {
		this.idPhanCongGiangDay = idPhanCongGiangDay;
	}
	public String getIdGiaoVien() {
		return idGiaoVien;
	}
	public void setIdGiaoVien(String idGiaoVien) {
		this.idGiaoVien = idGiaoVien;
	}
	public String getIdLop() {
		return idLop;
	}
	public void setIdLop(String idLop) {
		this.idLop = idLop;
	}
	public String getIdMonHoc() {
		return idMonHoc;
	}
	public void setIdMonHoc(String idMonHoc) {
		this.idMonHoc = idMonHoc;
	}
	public String getSoTietDay() {
		return soTietDay;
	}
	public void setSoTietDay(String soTietDay) {
		this.soTietDay = soTietDay;
	}
	public Date getNgayGiangDay() {
		return ngayGiangDay;
	}
	public void setNgayGiangDay(Date ngayGiangDay) {
		this.ngayGiangDay = ngayGiangDay;
	}
	
	
	
	
	
	
	
	

	
	
}
