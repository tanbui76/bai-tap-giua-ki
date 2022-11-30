package QuanliCLB.model;

public class HocKi {
	private int idHocKi;
	private int idNienKhoa;
	private String tenHocKi;
	
	public HocKi() {
		// TODO Auto-generated constructor stub
	}
	public HocKi(int idHocKi, int idNienKhoa, String tenHocKi) {
		this.idHocKi = idHocKi;
		this.idNienKhoa = idNienKhoa;
		this.tenHocKi = tenHocKi;
	}
	public int getIdHocKi() {
		return idHocKi;
	}
	public void setIdHocKi(int idHocKi) {
		this.idHocKi = idHocKi;
	}
	public int getIdNienKhoa() {
		return idNienKhoa;
	}
	public void setIdNienKhoa(int idNienKhoa) {
		this.idNienKhoa = idNienKhoa;
	}
	public String getTenHocKi() {
		return tenHocKi;
	}
	public void setTenHocKi(String tenHocKi) {
		this.tenHocKi = tenHocKi;
	}
	
	
}
