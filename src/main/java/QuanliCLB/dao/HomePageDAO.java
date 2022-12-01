package QuanliCLB.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import QuanliCLB.dbconnection.dbConnection;
import QuanliCLB.model.Admin;
import QuanliCLB.model.TaiKhoan;

public class HomePageDAO {
	Connection connection = null;
	PreparedStatement stm = null;
	ResultSet rs = null;
	
	public HomePageDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public Admin getAdmin(TaiKhoan tk) {
		Admin admin = null;
		String query = "select * from Admin where idTaiKhoan = ?";
		try {
			connection = dbConnection.getConnection();
			stm = connection.prepareStatement(query);
			stm.setString(1,tk.getIdTaiKhoan());
			rs = stm.executeQuery();
			if(rs.next()) {
				String idAdmin = rs.getString("idAdmin");
				String hoVaTen = rs.getString("hoVaTen");
				String email=rs.getString("email");
				String idTaiKhoan = rs.getString("idTaiKhoan");
				admin = new Admin(idAdmin, hoVaTen, email, idTaiKhoan);
				return admin;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return admin;
	}
}
