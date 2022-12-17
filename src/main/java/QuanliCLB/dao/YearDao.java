package QuanliCLB.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import QuanliCLB.dbconnection.dbConnection;
import QuanliCLB.model.NienKhoa;


public class YearDao {
	 Connection conn = null;
	 ResultSet rs = null;
	 PreparedStatement stm = null;
	 
	 
	// getData Nien Khoa
	public List<NienKhoa> getListNienKhoa(){
		List<NienKhoa> listnk = new ArrayList<>();
		String query ="select *from NienKhoa";
		try {
			conn = dbConnection.getConnection();
			stm = conn.prepareStatement(query);		
			rs = stm.executeQuery();
			while (rs.next()) {
				String idNienKhoa = rs.getString("idNienKhoa");
				String namNienKhoa = rs.getString("namNienKhoa");
				NienKhoa nienKhoa = new NienKhoa(idNienKhoa,namNienKhoa);
				listnk.add(nienKhoa);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listnk;
		
	}
	public static void main(String[] args) {
		YearDao dao = new YearDao();
		List<NienKhoa> list = dao.getListNienKhoa();
		for (NienKhoa nienKhoa : list) {
			System.out.println(nienKhoa.getNamNienKhoa());
		}
	}
	

}
