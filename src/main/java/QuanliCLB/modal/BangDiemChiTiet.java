package QuanliCLB.modal;

public class BangDiemChiTiet {
	private int idBangDiemChiTiet;
	private int idBangDiem;
	private float diemHe1;
	private float diemHe2;
	private float diemHe3;
	
	public BangDiemChiTiet() {
		// TODO Auto-generated constructor stub
	}

	public BangDiemChiTiet(int idBangDiemChiTiet, int idBangDiem, float diemHe1, float diemHe2, float diemHe3) {
		this.idBangDiemChiTiet = idBangDiemChiTiet;
		this.idBangDiem = idBangDiem;
		this.diemHe1 = diemHe1;
		this.diemHe2 = diemHe2;
		this.diemHe3 = diemHe3;
	}

	public int getIdBangDiemChiTiet() {
		return idBangDiemChiTiet;
	}

	public void setIdBangDiemChiTiet(int idBangDiemChiTiet) {
		this.idBangDiemChiTiet = idBangDiemChiTiet;
	}

	public int getIdBangDiem() {
		return idBangDiem;
	}

	public void setIdBangDiem(int idBangDiem) {
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
	
}
