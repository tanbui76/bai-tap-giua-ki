package QuanliCLB.model;

import java.util.Date;

public class TuanHoc {
	private String tuanId;
	private String tuanName;
	private String idHocKi;
	private Date tuanTuNgay;
	private Date tuanDenNgay;
	public TuanHoc() {
	}
	public TuanHoc(String tuanId, String tuanName, String idHocKi, Date tuanTuNgay, Date tuanDenNgay) {
		this.tuanId = tuanId;
		this.tuanName = tuanName;
		this.idHocKi = idHocKi;
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
	public String getIdHocKi() {
		return idHocKi;
	}
	public void setIdHocKi(String idHocKi) {
		this.idHocKi = idHocKi;
	}
	public Date getTuanTuNgay() {
		return tuanTuNgay;
	}
	public void setTuanTuNgay(Date tuanTuNgay) {
		this.tuanTuNgay = tuanTuNgay;
	}
	public Date getTuanDenNgay() {
		return tuanDenNgay;
	}
	public void setTuanDenNgay(Date tuanDenNgay) {
		this.tuanDenNgay = tuanDenNgay;
	}
	
	
	
	


}
