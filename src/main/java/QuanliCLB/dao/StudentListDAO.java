package QuanliCLB.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import QuanliCLB.dbconnection.dbConnection;
import QuanliCLB.model.SinhVien;


public class StudentListDAO {
	Connection connection = null;
	PreparedStatement stm = null;
	ResultSet rs = null;
	
	public StudentListDAO() {
		// TODO Auto-generated constructor stub
	}
	public List<SinhVien> getStudenList(){
		List<SinhVien> list = new ArrayList<SinhVien>();
		String query = "SELECT * FROM sql6580911.SinhVien";
		try {
			connection = dbConnection.getConnection();
			stm = connection.prepareStatement(query);
			rs = stm.executeQuery();
			System.out.println("hi");
			while (rs.next()) {
				System.out.println("hi1");
				String idSinhVien = rs.getString("idSinhVien");
				String hoTenSinhVien = rs.getNString("hoTenSinhVien");
				String anhDaiDienSinhVien = rs.getString("anhDaiDienSinhVien");
				String email = rs.getString("emailSinhVien");
				String github = rs.getString("github");
				String diaChiSinhVien = rs.getNString("diaChiSinhVien");
				String idTaiKhoan = rs.getString("idTaiKhoan");
				SinhVien sv = new SinhVien(idSinhVien, hoTenSinhVien, anhDaiDienSinhVien, email, github, diaChiSinhVien,idTaiKhoan );
				list.add(sv);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

}
