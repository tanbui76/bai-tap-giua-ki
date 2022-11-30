package QuanliCLB.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import QuanliCLB.dbconnection.dbConnection;
import QuanliCLB.model.MonHoc;

public class CourseDAO {
	 Connection conn = null;
	 ResultSet rs = null;
	 PreparedStatement stm = null;
	
	public List<MonHoc> getMonHoc(){
		String query = "select * from sql6580911.MonHoc";
		List<MonHoc> listMon = new ArrayList<>();
		try {
			conn = dbConnection.getConnection();
			stm = conn.prepareStatement(query);		
			rs = stm.executeQuery();
			while(rs.next()) {
				String idMonHoc = rs.getString("idMonHoc");
				String tenMonHoc = rs.getString("tenMonHoc");
				int tongSoTiet = rs.getInt("tongSoTiet");
				MonHoc monhoc = new MonHoc(idMonHoc, tenMonHoc, tongSoTiet);
				listMon.add(monhoc);			
			}
			
			
		} catch (Exception e) {
			
		}
			
		return listMon;
		
		
	}
}
