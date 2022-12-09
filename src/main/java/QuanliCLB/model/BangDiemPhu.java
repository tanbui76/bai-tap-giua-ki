package QuanliCLB.model;

public class BangDiemPhu {
	private String namNienKhoa;
	private String tenHocKi;
	private String idMonHoc;
	private String tenMonhoc;
	
	public BangDiemPhu() {
		// TODO Auto-generated constructor stub
	}
	public BangDiemPhu(String namNienKhoa, String tenHocKi,String idMonHoc,String tenMonhoc) {
		this.namNienKhoa = namNienKhoa;
		this.tenHocKi = tenHocKi;
		this.tenMonhoc = tenMonhoc;
		this.idMonHoc = idMonHoc;
	}
	public String getNamNienKhoa() {
		return namNienKhoa;
	}

	public void setNamNienKhoa(String namNienKhoa) {
		this.namNienKhoa = namNienKhoa;
	}
	public String getTenHocKi() {
		return tenHocKi;
	}
	public void setTenHocKi(String tenHocKi) {
		this.tenHocKi = tenHocKi;
	}
	public String getIdMonHoc() {
		return idMonHoc;
	}
	public void setIdMonHoc(String idMonHoc) {
		this.idMonHoc = idMonHoc;
	}
	public String getTenMonhoc() {
		return tenMonhoc;
	}
	public void setTenMonhoc(String tenMonhoc) {
		this.tenMonhoc = tenMonhoc;
	}
	
}
