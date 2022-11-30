package QuanliCLB.model;

public class MonHoc {
	private int idMonHoc;
	private String tenMonhoc;
	private int tongSoTiet;
	
	public MonHoc() {
		// TODO Auto-generated constructor stub
	}

	public MonHoc(int idMonHoc, String tenMonhoc, int tongSoTiet) {
		this.idMonHoc = idMonHoc;
		this.tenMonhoc = tenMonhoc;
		this.tongSoTiet = tongSoTiet;
	}

	public int getIdMonHoc() {
		return idMonHoc;
	}

	public void setIdMonHoc(int idMonHoc) {
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
