package QuanliCLB.model;

public class BangDiemChiTiet {
	private String idBangDiemChiTiet;
	private String idBangDiem;
	private float diemHe1;
	private float diemHe2;
	private float diemHe3;
	private String idMonHoc; 
	
	public BangDiemChiTiet() {
		// TODO Auto-generated constructor stub
	}

	public BangDiemChiTiet(String idBangDiemChiTiet, String idBangDiem, float diemHe1, float diemHe2, float diemHe3, String idMonHoc) {
		this.idBangDiemChiTiet = idBangDiemChiTiet;
		this.idBangDiem = idBangDiem;
		this.diemHe1 = diemHe1;
		this.diemHe2 = diemHe2;
		this.diemHe3 = diemHe3;
		this.idMonHoc = idMonHoc;
		
	}

	public String getIdBangDiemChiTiet() {
		return idBangDiemChiTiet;
	}

	public void setIdBangDiemChiTiet(String idBangDiemChiTiet) {
		this.idBangDiemChiTiet = idBangDiemChiTiet;
	}

	public String getIdBangDiem() {
		return idBangDiem;
	}

	public void setIdBangDiem(String idBangDiem) {
		this.idBangDiem = idBangDiem;
	}

	public float getDiemHe1() {
		return diemHe1;
	}

	public void setDiemHe1(float diemHe1) {
		this.diemHe1 = diemHe1;
	}

	public float getDiemHe2() {
		return diemHe2;
	}

	public void setDiemHe2(float diemHe2) {
		this.diemHe2 = diemHe2;
	}

	public float getDiemHe3() {
		return diemHe3;
	}

	public void setDiemHe3(float diemHe3) {
		this.diemHe3 = diemHe3;
	}
	public String getIdMonHoc() {
		return idMonHoc;
	}
	public void setIdMonHoc(String idMonHoc) {
		this.idMonHoc = idMonHoc;
	}
	
}
