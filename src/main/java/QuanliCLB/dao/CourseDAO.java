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
		List<MonHoc> listMon = new ArrayList<>();
		String query = "SELECT * FROM sql6580911.MonHoc";		
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
	public void InsertMonHoc(String idMonHoc, String tenMonHoc) {
		String query ="insert into MonHoc (idMonHoc, tenMonHoc)"
				+ "values (?,?)";
		try {
			conn = dbConnection.getConnection();
			stm = conn.prepareStatement(query);		
			stm.setString(1, idMonHoc);
			stm.setNString(2, tenMonHoc);
			stm.executeUpdate();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			
	}
	
	public void DeleteMonHoc(String idMonHoc) {
		String query ="delete from MonHoc where idMonHoc=?";
		try {
			conn = dbConnection.getConnection();
			stm = conn.prepareStatement(query);	
			stm.setString(1, idMonHoc);
			stm.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
