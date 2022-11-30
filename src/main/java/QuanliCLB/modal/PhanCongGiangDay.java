package QuanliCLB.modal;

import java.sql.Date;

public class PhanCongGiangDay {
	private String idGiaoVien;
	private int idLop;
	private int idMonHoc;
	private Date ngayGiangDay;
	
	public PhanCongGiangDay() {
		// TODO Auto-generated constructor stub
	}

	public PhanCongGiangDay(String idGiaoVien, int idLop, int idMonHoc, Date ngayGiangDay) {
		this.idGiaoVien = idGiaoVien;
		this.idLop = idLop;
		this.idMonHoc = idMonHoc;
		this.ngayGiangDay = ngayGiangDay;
	}

	public String getIdGiaoVien() {
		return idGiaoVien;
	}

	public void setIdGiaoVien(String idGiaoVien) {
		this.idGiaoVien = idGiaoVien;
	}

	public int getIdLop() {
		return idLop;
	}

	public void setIdLop(int idLop) {
		this.idLop = idLop;
	}

	public int getIdMonHoc() {
		return idMonHoc;
	}

	public void setIdMonHoc(int idMonHoc) {
		this.idMonHoc = idMonHoc;
	}

	public Date getNgayGiangDay() {
		return ngayGiangDay;
	}

	public void setNgayGiangDay(Date ngayGiangDay) {
		this.ngayGiangDay = ngayGiangDay;
	}
	
	
}
