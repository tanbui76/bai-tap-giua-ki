package QuanliCLB.model;

public class BangDiem {
	private String idBangDiem;
	private String idHocKi;
	private String idSinhVien;
	private String idGiaoVien;
	public BangDiem() {
		// TODO Auto-generated constructor stub
	}
	public BangDiem(String idBangDiem, String idHocKi, String idSinhVien, String idGiaoVien) {
		super();
		this.idBangDiem = idBangDiem;
		this.idHocKi = idHocKi;
		this.idSinhVien = idSinhVien;
		this.idGiaoVien = idGiaoVien;
	}
	public String getIdBangDiem() {
		return idBangDiem;
	}
	public void setIdBangDiem(String idBangDiem) {
		this.idBangDiem = idBangDiem;
	}
	public String getIdHocKi() {
		return idHocKi;
	}
	public void setIdHocKi(String idHocKi) {
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
