package QuanliCLB.model;

public class MonHoc {
	private String idMonHoc;
	private String tenMonhoc;
	private int tongSoTiet;
	
	public MonHoc() {
	}
	public MonHoc(String idMonHoc, String tenMonhoc, int tongSoTiet) {
		this.idMonHoc = idMonHoc;
		this.tenMonhoc = tenMonhoc;
		this.tongSoTiet = tongSoTiet;
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
	public int getTongSoTiet() {
		return tongSoTiet;
	}
	public void setTongSoTiet(int tongSoTiet) {
		this.tongSoTiet = tongSoTiet;
	}
	
	
	
}
