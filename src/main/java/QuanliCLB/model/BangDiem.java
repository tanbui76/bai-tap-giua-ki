package QuanliCLB.model;

public class BangDiem {
	private int idBangDiem;
	private int idHocKi;
	private String idSinhVien;
	private String idGiaoVien;
	public BangDiem() {
		// TODO Auto-generated constructor stub
	}
	public BangDiem(int idBangDiem, int idHocKi, String idSinhVien, String idGiaoVien) {
		this.idBangDiem = idBangDiem;
		this.idHocKi = idHocKi;
		this.idSinhVien = idSinhVien;
		this.idGiaoVien = idGiaoVien;
	}
	public int getIdBangDiem() {
		return idBangDiem;
	}
	public void setIdBangDiem(int idBangDiem) {
		this.idBangDiem = idBangDiem;
	}
	public int getIdHocKi() {
		return idHocKi;
	}
	public void setIdHocKi(int idHocKi) {
		this.idHocKi = idHocKi;
	}
	public String getIdSinhVien() {
		return idSinhVien;
	}
	public void setIdSinhVien(String idSinhVien) {
		this.idSinhVien = idSinhVien;
	}
	public String getIdGiaoVien() {
		return idGiaoVien;
	}
	public void setIdGiaoVien(String idGiaoVien) {
		this.idGiaoVien = idGiaoVien;
	}
	
}
