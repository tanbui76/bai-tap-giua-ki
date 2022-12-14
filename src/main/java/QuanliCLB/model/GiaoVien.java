package QuanliCLB.model;

public class GiaoVien {
	private String idGiaoVien;
	private String hoTenGiaoVien;
	private String anhDaiDienGiaoVien;
	private String github;
	private String diachiGiaoVien;
	private String emailGiaoVien;
	private String idTaiKhoan;
	
	public GiaoVien() {
		// TODO Auto-generated constructor stub
	}

	public GiaoVien(String idGiaoVien, String hoTenGiaoVien, String anhDaiDienGiaoVien, String github,
			String diachiGiaoVien, String emailGiaoVien, String idTaiKhoan) {
		this.idGiaoVien = idGiaoVien;
		this.hoTenGiaoVien = hoTenGiaoVien;
		this.anhDaiDienGiaoVien = anhDaiDienGiaoVien;
		this.github = github;
		this.diachiGiaoVien = diachiGiaoVien;
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
		return diachiGiaoVien;
	}

	public void setDiaChiGiaoVien(String diaChiGiaoVien) {
		this.diachiGiaoVien = diaChiGiaoVien;
	}

	public String getEmailGiaoVien() {
		return emailGiaoVien;
	}

	public void setEmailGiaoVien(String emailGiaoVien) {
		this.emailGiaoVien = emailGiaoVien;
	}

	public String getIdTaiKhoan() {
		return idTaiKhoan;
	}

	public void setIdTaiKhoan(String idTaiKhoan) {
		this.idTaiKhoan = idTaiKhoan;
	}
	
	
}
