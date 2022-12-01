package QuanliCLB.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import QuanliCLB.dbconnection.dbConnection;
import QuanliCLB.model.GiaoVien;

public class TeacherListDAO {
	Connection con = null;
	PreparedStatement stm = null;
	ResultSet rs = null;
	
	public TeacherListDAO() {
		// TODO Auto-generated constructor stub
	}
	public List<GiaoVien> getTeacherList() throws SQLException{
		List<GiaoVien> list = new ArrayList<GiaoVien>();
		String query = "SELECT * FROM sql6085911.GiaoVien ";
		
		try {
			con = dbConnection.getConnection();
			stm = con.prepareStatement(query);
			rs = stm.executeQuery();
			while(rs.next()) {
				
				String idGiaoVien = rs.getString("idGiaoVien");
				String hoTenGiaoVien = rs.getNString("hoTenGiaoVien");
				String anhDaiDienGiaoVien = rs.getString("anhDaiDienGiaoVien");
				String github = rs.getString("github");
				String diaChiGiaoVien = rs.getString("diachiGiaoVien");
				String emailGiaoVien = rs.getString("emailGiaoVien");
				int idTaiKhoan = rs.getInt("idTaiKhoan");
				GiaoVien gv = new GiaoVien(idGiaoVien, hoTenGiaoVien, anhDaiDienGiaoVien, github, diaChiGiaoVien, emailGiaoVien, idTaiKhoan);
				list.add(gv);
				return list;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
}
