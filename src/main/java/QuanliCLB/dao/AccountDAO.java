package QuanliCLB.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import QuanliCLB.dbconnection.dbConnection;
import QuanliCLB.model.TaiKhoan;

public class AccountDAO {
	 Connection conn = null;
	 ResultSet rs = null;
	 PreparedStatement stm = null;
	 
	 public List<TaiKhoan> getTaiKhoan(){
			List<TaiKhoan> listtk = new ArrayList<>();
			String query = "Select * from TaiKhoan";		
			try {
				conn = dbConnection.getConnection();
				stm = conn.prepareStatement(query);		
				rs = stm.executeQuery();
				while(rs.next()) {
					String idTaiKhoan = rs.getString("idTaiKhoan");
					String tenDangNhap = rs.getString("tenDangNhap");
					String matKhau = rs.getString("matKhau");
					int phanQuyen = rs.getInt("phanQuyen");
					TaiKhoan tk = new TaiKhoan(idTaiKhoan, tenDangNhap, matKhau, phanQuyen);
					System.out.println(tenDangNhap);
					listtk.add(tk);			
				}			
				
			} catch (Exception e) {
				
			}
				
			return listtk;
			
			
		}
	 public void Insert(String idTaiKhoan, String tenDangNhap, String matKhau, int phanQuyen) {
		 Connection connection = null;
		 PreparedStatement stm = null;
		 ResultSet rs = null;
		 try {
			connection = dbConnection.getConnection();
			String query = "INSERT INTO TaiKhoan (idTaiKhoan,tenDangNhap,matKhau, phanQuyen)"
					+ "VALUES (?, ?, ?, ?)";
			stm = connection.prepareStatement(query);
			stm.setString(1, idTaiKhoan);
			stm.setString(2, tenDangNhap);
			stm.setString(3, matKhau);
			stm.setInt(4, phanQuyen);
			stm.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	 }
}
