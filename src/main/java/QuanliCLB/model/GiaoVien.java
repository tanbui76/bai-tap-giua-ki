package QuanliCLB.model;

public class GiaoVien {
	private String idGiaoVien;
	private String hoTenGiaoVien;
	private String anhDaiDienGiaoVien;
	private String github;
	private String diaChiGiaoVien;
	private String emailGiaoVien;
	private int idTaiKhoan;
	
	public GiaoVien() {
		// TODO Auto-generated constructor stub
	}

	public GiaoVien(String idGiaoVien, String hoTenGiaoVien, String anhDaiDienGiaoVien, String github,
			String diaChiGiaoVien, String emailGiaoVien, int idTaiKhoan) {
		this.idGiaoVien = idGiaoVien;
		this.hoTenGiaoVien = hoTenGiaoVien;
		this.anhDaiDienGiaoVien = anhDaiDienGiaoVien;
		this.github = github;
		this.diaChiGiaoVien = diaChiGiaoVien;
		this.emailGiaoVien = emailGiaoVien;
		this.idTaiKhoan = idTaiKhoan;
	}

	public String getIdGiaoVien() {
		return idGiaoVien;
	}

	public void setIdGiaoVien(String idGiaoVien) {
		this.idGiaoVien = idGiaoVien;
	}

	public String getHoTenGiaoVien() {
		return hoTenGiaoVien;
	}

	public void setHoTenGiaoVien(String hoTenGiaoVien) {
		this.hoTenGiaoVien = hoTenGiaoVien;
	}

	public String getAnhDaiDienGiaoVien() {
		return anhDaiDienGiaoVien;
	}

	public void setAnhDaiDienGiaoVien(String anhDaiDienGiaoVien) {
		this.anhDaiDienGiaoVien = anhDaiDienGiaoVien;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public String getDiaChiGiaoVien() {
		return diaChiGiaoVien;
	}

	public void setDiaChiGiaoVien(String diaChiGiaoVien) {
		this.diaChiGiaoVien = diaChiGiaoVien;
	}

	public String getEmailGiaoVien() {
		return emailGiaoVien;
	}

	public void setEmailGiaoVien(String emailGiaoVien) {
		this.emailGiaoVien = emailGiaoVien;
	}

	public int getIdTaiKhoan() {
		return idTaiKhoan;
	}

	public void setIdTaiKhoan(int idTaiKhoan) {
		this.idTaiKhoan = idTaiKhoan;
	}
	
	
}
