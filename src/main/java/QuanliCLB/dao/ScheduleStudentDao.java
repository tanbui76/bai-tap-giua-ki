package QuanliCLB.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import QuanliCLB.dbconnection.dbConnection;
import QuanliCLB.model.PhanCongGiangDay;
import QuanliCLB.model.TuanHoc;

public class ScheduleStudentDao {
	Connection conn = null;
	 ResultSet rs = null;
	 PreparedStatement stm = null;
	 
	 public List<PhanCongGiangDay> getListPhanCong(){
		 List<PhanCongGiangDay> listPhanCongGiangDay = new ArrayList<>();
		String query ="select *from PhanCongGiangDay";
		try {
			conn = dbConnection.getConnection();
			stm = conn.prepareStatement(query);		
			rs = stm.executeQuery();
			while (rs.next()) {
				String idPhanCong = rs.get
				
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listPhanCongGiangDay;
	 }
	

}
