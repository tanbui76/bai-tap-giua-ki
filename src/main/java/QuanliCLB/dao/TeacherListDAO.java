package QuanliCLB.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.Query;

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
		String query = "SELECT * FROM sql6580911.GiaoVien ";
		try {
			con = dbConnection.getConnection();
			stm = con.prepareStatement(query);
			rs = stm.executeQuery();
			while(rs.next()) {
				String idGiaoVien = rs.getString("idGiaoVien");
				String hoTenGiaoVien = rs.getNString("hoTenGiaoVien");
				String anhDaiDienGiaoVien = rs.getString("anhDaiDienGiaoVien");
				String github = rs.getString("github");
				String diaChiGiaoVien = rs.getNString("diachiGiaoVien");
				String emailGiaoVien = rs.getString("emailGiaoVien");
				String idTaiKhoan = rs.getString("idTaiKhoan");
				GiaoVien gv = new GiaoVien(idGiaoVien, hoTenGiaoVien, anhDaiDienGiaoVien, github, diaChiGiaoVien, emailGiaoVien, idTaiKhoan);
				System.out.println(hoTenGiaoVien);
				list.add(gv);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public void Insert(String idGiaoVien, String hoTenGiaoVien, String emailGiaoVien, String diachiGiaoVien, String idTaiKhoan) {
		Connection connection = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			connection = dbConnection.getConnection();
			String  query = "INSERT INTO GiaoVien (idGiaoVien,hoTenGiaoVien,emailGiaoVien, diachiGiaoVien,idTaiKhoan) "
					+ "VALUES (?, ?, ?, ?, ?)";
			stm = connection.prepareStatement(query);
			stm.setString(1, idGiaoVien);
			stm.setString(2, hoTenGiaoVien);
			stm.setString(3, emailGiaoVien);
			stm.setString(4, diachiGiaoVien);
			stm.setString(5, idTaiKhoan);
			stm.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
