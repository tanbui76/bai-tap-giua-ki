package QuanliCLB.model;

import java.sql.Date;

public class PhanCongGiangDay {
	private String idPhanCongday;
	private String idGiaoVien;
	private String idLop;
	private String idMonHoc;
	private Date ngayGiangDay;
	private String soTiet;
	public PhanCongGiangDay() {
		super();
	}
	public PhanCongGiangDay(String idPhanCongday, String idGiaoVien, String idLop, String idMonHoc, Date ngayGiangDay,
			String soTiet) {
		super();
		this.idPhanCongday = idPhanCongday;
		this.idGiaoVien = idGiaoVien;
		this.idLop = idLop;
		this.idMonHoc = idMonHoc;
		this.ngayGiangDay = ngayGiangDay;
		this.soTiet = soTiet;
	}
	public String getIdPhanCongday() {
		return idPhanCongday;
	}
	public void setIdPhanCongday(String idPhanCongday) {
		this.idPhanCongday = idPhanCongday;
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
	public Date getNgayGiangDay() {
		return ngayGiangDay;
	}
	public void setNgayGiangDay(Date ngayGiangDay) {
		this.ngayGiangDay = ngayGiangDay;
	}
	public String getSoTiet() {
		return soTiet;
	}
	public void setSoTiet(String soTiet) {
		this.soTiet = soTiet;
	}
	
	
	
	

	
	
}
