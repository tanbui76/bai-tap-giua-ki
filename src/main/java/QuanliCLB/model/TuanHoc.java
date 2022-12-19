package QuanliCLB.model;

public class TuanHoc {
	private String tuanId;
	private String tuanName;
	private String idNienKhoa;
	private String tuanTuNgay;
	private String tuanDenNgay;
	public TuanHoc() {
	}
	public TuanHoc(String tuanId, String tuanName, String idNienKhoa, String tuanTuNgay, String tuanDenNgay) {
		this.tuanId = tuanId;
		this.tuanName = tuanName;
		this.idNienKhoa = idNienKhoa;
		this.tuanTuNgay = tuanTuNgay;
		this.tuanDenNgay = tuanDenNgay;
	}
	public String getTuanId() {
		return tuanId;
	}
	public void setTuanId(String tuanId) {
		this.tuanId = tuanId;
	}
	public String getTuanName() {
		return tuanName;
	}
	public void setTuanName(String tuanName) {
		this.tuanName = tuanName;
	}
	public String getIdNienKhoa() {
		return idNienKhoa;
	}
	public void setIdNienKhoa(String idNienKhoa) {
		this.idNienKhoa = idNienKhoa;
	}
	public String getTuanTuNgay() {
		return tuanTuNgay;
	}
	public void setTuanTuNgay(String tuanTuNgay) {
		this.tuanTuNgay = tuanTuNgay;
	}
	public String getTuanDenNgay() {
		return tuanDenNgay;
	}
	public void setTuanDenNgay(String tuanDenNgay) {
		this.tuanDenNgay = tuanDenNgay;
	}
	
	


}
