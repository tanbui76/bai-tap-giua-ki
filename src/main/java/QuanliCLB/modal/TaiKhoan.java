package QuanliCLB.modal;

public class TaiKhoan {
	private int idTaiKhoan;
	private String tenDangNhap;
	private String matKhau;
	private int phanQuyen;
	
	public TaiKhoan() {
		// TODO Auto-generated constructor stub
	}

	public TaiKhoan(int idTaiKhoan, String tenDangNhap, String matKhau, int phanQuyen) {
		super();
		this.idTaiKhoan = idTaiKhoan;
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.phanQuyen = phanQuyen;
	}

	public int getIdTaiKhoan() {
		return idTaiKhoan;
	}

	public void setIdTaiKhoan(int idTaiKhoan) {
		this.idTaiKhoan = idTaiKhoan;
	}

	public String getTenDangNhap() {
		return tenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public int getPhanQuyen() {
		return phanQuyen;
	}

	public void setPhanQuyen(int phanQuyen) {
		this.phanQuyen = phanQuyen;
	}
	
	
}
