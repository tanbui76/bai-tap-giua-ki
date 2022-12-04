package QuanliCLB.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import QuanliCLB.dbconnection.dbConnection;
import QuanliCLB.model.Admin;
import QuanliCLB.model.GiaoVien;
import QuanliCLB.model.SinhVien;
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
	public SinhVien getSinhVien(TaiKhoan tk) {
		SinhVien sinhVien = null;
		String query = "select * from SinhVien where idTaiKhoan = ?";
		try {
			connection = dbConnection.getConnection();
			stm = connection.prepareStatement(query);
			stm.setString(1,tk.getIdTaiKhoan());
			rs = stm.executeQuery();
			if(rs.next()) {
				String idSinhVien = rs.getString("idSinhVien");
				String hoTenSinhVien = rs.getNString("hoTenSinhVien");
				String anhDaiDienSinhVien = rs.getString("anhDaiDienSinhVien");
				String email = rs.getString("emailSinhVien");
				String github = rs.getString("github");
				String diaChiSinhVien = rs.getNString("diaChiSinhVien");
				String idTaiKhoan = rs.getString("idTaiKhoan");
				sinhVien = new SinhVien(idSinhVien, hoTenSinhVien, anhDaiDienSinhVien, email, github, diaChiSinhVien,idTaiKhoan );
				return sinhVien;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return sinhVien;
	}
	public GiaoVien getGiaoVien(TaiKhoan tk) {
		GiaoVien giaoVien = null;
		String query = "select * from SinhVien where idTaiKhoan = ?";
		try {
			connection = dbConnection.getConnection();
			stm = connection.prepareStatement(query);
			stm.setString(1,tk.getIdTaiKhoan());
			rs = stm.executeQuery();
			if(rs.next()) {
				String idGiaoVien = rs.getString("idGiaoVien");
				String hoTenGiaoVien = rs.getNString("hoTenGiaoVien");
				String anhDaiDienGiaoVien = rs.getString("anhDaiDienGiaoVien");
				String github = rs.getString("github");
				String diaChiGiaoVien = rs.getNString("diachiGiaoVien");
				String emailGiaoVien = rs.getString("emailGiaoVien");
				String idTaiKhoan = rs.getString("idTaiKhoan");
				giaoVien = new GiaoVien(idGiaoVien, hoTenGiaoVien, anhDaiDienGiaoVien, github, diaChiGiaoVien, emailGiaoVien, idTaiKhoan);
				return giaoVien;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return giaoVien;
	}
}
