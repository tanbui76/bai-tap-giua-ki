package QuanliCLB.model;

public class SinhVien {
	private String idSinhVien;
	private String hoTenSinhVien;
	private String anhDaiDienSinhVien;
	private String email;
	private String github;
	private String diaChiSinhVien;
	private String idTaiKhoan;
	
	public SinhVien() {
		// TODO Auto-generated constructor stub
	}

	public SinhVien(String idSinhVien, String hoTenSinhVien, String anhDaiDienSinhVien, String email, String github,
			String diaChiSinhVien, String idTaiKhoan) {
		this.idSinhVien = idSinhVien;
		this.hoTenSinhVien = hoTenSinhVien;
		this.anhDaiDienSinhVien = anhDaiDienSinhVien;
		this.email = email;
		this.github = github;
		this.diaChiSinhVien = diaChiSinhVien;
		this.idTaiKhoan = idTaiKhoan;
	}

	public String getIdSinhVien() {
		return idSinhVien;
	}

	public void setIdSinhVien(String idSinhVien) {
		this.idSinhVien = idSinhVien;
	}

	public String getHoTenSinhVien() {
		return hoTenSinhVien;
	}

	public void setHoTenSinhVien(String hoTenSinhVien) {
		this.hoTenSinhVien = hoTenSinhVien;
	}

	public String getAnhDaiDienSinhVien() {
		return anhDaiDienSinhVien;
	}

	public void setAnhDaiDienSinhVien(String anhDaiDienSinhVien) {
		this.anhDaiDienSinhVien = anhDaiDienSinhVien;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public String getDiaChiSinhVien() {
		return diaChiSinhVien;
	}

	public void setDiaChiSinhVien(String diaChiSinhVien) {
		this.diaChiSinhVien = diaChiSinhVien;
	}

	public String getIdTaiKhoan() {
		return idTaiKhoan;
	}

	public void setIdTaiKhoan(String idTaiKhoan) {
		this.idTaiKhoan = idTaiKhoan;
	}

	
	
	
}
