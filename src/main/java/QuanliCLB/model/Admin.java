package QuanliCLB.model;

public class Admin {
	private String idAdmin;
	private String hoVaTen;
	private String email;
	private String idTaiKhoan;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(String idAdmin, String hoVaTen, String email, String idTaiKhoan) {
		this.idAdmin = idAdmin;
		this.hoVaTen = hoVaTen;
		this.email = email;
		this.idTaiKhoan = idTaiKhoan;
	}

	public String getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(String idAdmin) {
		this.idAdmin = idAdmin;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdTaiKhoan() {
		return idTaiKhoan;
	}

	public void setIdTaiKhoan(String idTaiKhoan) {
		this.idTaiKhoan = idTaiKhoan;
	}
	
	
}
