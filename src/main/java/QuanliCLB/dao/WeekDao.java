package QuanliCLB.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import QuanliCLB.dbconnection.dbConnection;
import QuanliCLB.model.TuanHoc;

public class WeekDao {
	
	Connection conn = null;
	 ResultSet rs = null;
	 PreparedStatement stm = null;
	
	public List<TuanHoc> getTuanHoc(){
		List<TuanHoc> listTuanHoc = new ArrayList<>();
		String query ="select *from TuanHoc";
		try {
			conn = dbConnection.getConnection();
			stm = conn.prepareStatement(query);		
			rs = stm.executeQuery();
			while (rs.next()) {
				String tuanId = rs.getString("tuanId");
				String tuanName = rs.getString("tuanName");
				String idNienKhoa = rs.getString("idNienKhoa");
				String tuanTuNgay = rs.getString("tuanTuNgay");
				String tuanDenNgay = rs.getString("tuanDenNgay");
				TuanHoc tuanHoc = new TuanHoc(tuanId,tuanName,idNienKhoa,tuanTuNgay,tuanDenNgay);
				listTuanHoc.add(tuanHoc);
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listTuanHoc;
	}
	
	public static void main(String[] args) {
		WeekDao weekDao = new WeekDao();
		List<TuanHoc> list = weekDao.getTuanHoc();
		for (TuanHoc tuanHoc : list) {
			System.out.println(tuanHoc.getTuanId());
			System.out.println(tuanHoc.getTuanName());
		}
	}

}
