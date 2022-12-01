package QuanliCLB.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import QuanliCLB.dbconnection.dbConnection;
import QuanliCLB.model.TaiKhoan;

public class LoginDAO {
	Connection connection = null;
	PreparedStatement stm = null;
	ResultSet rs = null;
	
	public LoginDAO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public TaiKhoan isLogin(String username,String password) {
		TaiKhoan tk = null;
		String query = "Select * from  sql6580911.TaiKhoan where tenDangNhap = ? and matKhau = ?";
		try {
			connection = dbConnection.getConnection();
			stm = connection.prepareStatement(query);
			stm.setString(1,username);
			stm.setString(2,password);
			rs = stm.executeQuery();
			if(rs.next()) {
				 String idTaiKhoan =rs.getString("idTaiKhoan");
				 String tenDangNhap =rs.getString("tenDangNhap");
				 String matKhau=rs.getString("matKhau") ;
				 int phanQuyen = rs.getInt("phanQuyen");
				 tk = new TaiKhoan(idTaiKhoan, tenDangNhap, matKhau, phanQuyen);
				 return tk;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return tk;
	}
	
}
