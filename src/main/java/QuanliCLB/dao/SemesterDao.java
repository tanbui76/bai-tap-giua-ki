package QuanliCLB.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import QuanliCLB.dbconnection.dbConnection;
import QuanliCLB.model.HocKi;


public class SemesterDao {
	 Connection conn = null;
	 ResultSet rs = null;
	 PreparedStatement stm = null;
	public List<HocKi> getHocKi(){
		List<HocKi> listHocKi = new ArrayList<>();
		String query ="select *from HocKi";
		try {
			conn = dbConnection.getConnection();
			stm = conn.prepareStatement(query);		
			rs = stm.executeQuery();
			while (rs.next()) {
				String idHocKy = rs.getString("idHocKi");
				String idNienKhoa = rs.getString("idNienKhoa");
				String tenHocky = rs.getString("tenHocKi");
				HocKi hocKi = new HocKi(idHocKy,idNienKhoa,tenHocky);
				listHocKi.add(hocKi);
	
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return listHocKi;
		
	}
	
//	public static void main(String[] args) {
//		SemesterDao dao = new SemesterDao();
//		List<HocKi> list = dao.getHocKi();
//		for (HocKi hocKi : list) {
//			System.out.println(hocKi.getIdHocKi());
//			System.out.println(hocKi.getTenHocKi());
//		}
//	}
	

}
