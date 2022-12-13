package QuanliCLB.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import QuanliCLB.dbconnection.dbConnection;
import QuanliCLB.model.GiaoVien;
import QuanliCLB.model.SinhVien;

public class StudentListDAO {
	Connection connection = null;
	PreparedStatement stm = null;
	ResultSet rs = null;

	public StudentListDAO() {
		// TODO Auto-generated constructor stub
	}

	public List<SinhVien> getStudenList() {
		List<SinhVien> list = new ArrayList<SinhVien>();
		String query = "SELECT * FROM SinhVien where hidden is null";
		try {
			connection = dbConnection.getConnection();
			stm = connection.prepareStatement(query);
			rs = stm.executeQuery();
			while (rs.next()) {
				String idSinhVien = rs.getString("idSinhVien");
				String hoTenSinhVien = rs.getNString("hoTenSinhVien");
				String anhDaiDienSinhVien = rs.getString("anhDaiDienSinhVien");
				String email = rs.getString("emailSinhVien");
				String github = rs.getString("github");
				String diaChiSinhVien = rs.getNString("diaChiSinhVien");
				String idTaiKhoan = rs.getString("idTaiKhoan");
				SinhVien sv = new SinhVien(idSinhVien, hoTenSinhVien, anhDaiDienSinhVien, email, github, diaChiSinhVien,
						idTaiKhoan);
				list.add(sv);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	public List<SinhVien> getStudenListAutoGenID() {
		List<SinhVien> list = new ArrayList<SinhVien>();
		// String query = "Select * from TaiKhoan ORDER BY idTaiKhoan DESC";
		String query = "Select * from SinhVien order by idSinhVien desc";
		try {
			connection = dbConnection.getConnection();
			stm = connection.prepareStatement(query);
			rs = stm.executeQuery();
			while (rs.next()) {
				String idSinhVien = rs.getString("idSinhVien");
				String hoTenSinhVien = rs.getNString("hoTenSinhVien");
				String anhDaiDienSinhVien = rs.getString("anhDaiDienSinhVien");
				String email = rs.getString("emailSinhVien");
				String github = rs.getString("github");
				String diaChiSinhVien = rs.getNString("diaChiSinhVien");
				String idTaiKhoan = rs.getString("idTaiKhoan");
				SinhVien sv = new SinhVien(idSinhVien, hoTenSinhVien, anhDaiDienSinhVien, email, github, diaChiSinhVien,
						idTaiKhoan);
				list.add(sv);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

	public void Insert(String idSinhVien, String hoTenSinhVien, String anhDaiDienSinhVien, String emailSinhVien,
			String github, String diaChiSinhVien, String idTaiKhoan) {
		Connection connection = null;
		PreparedStatement stm = null;
		ResultSet rSet = null;
		try {
			connection = dbConnection.getConnection();
			String query = "INSERT INTO SinhVien (idSinhVien,hoTenSinhVien,anhDaiDienSinhVien,emailSinhVien,github, diachiSinhVien,idTaiKhoan) "
					+ "VALUES (?, ?, ?, ?, ?)";
			stm = connection.prepareStatement(query);
			stm.setString(1, idSinhVien);
			stm.setString(2, hoTenSinhVien);
			stm.setString(3, anhDaiDienSinhVien);
			stm.setString(4, emailSinhVien);
			stm.setString(5, github);
			stm.setString(6, diaChiSinhVien);
			stm.setString(7, idTaiKhoan);
			stm.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public String Matutang() {
		LocalDate localDate = LocalDate.now();
		int year = localDate.getYear();
		String yearStr = String.valueOf(year);
		List<SinhVien> list = getStudenListAutoGenID();
		String s = "SV";
		if (list.size() <= 0) {
			s = yearStr + "SV001";
		} else {
			String chuoi = list.get(0).getIdSinhVien().toString();
			String getString = chuoi.substring(0, 4);
			if (!getString.equals(yearStr)) {
				s = yearStr + "SV001";
			} else {
//				System.out.println(chuoi.substring(6, 9));
				int k = 0;
				k = Integer.parseInt(chuoi.substring(6, 9));
				k = k + 1;
				if (k < 10) {
					s = s + "00";
				} else {
					if (k < 100) {
						s = s + "0";
					}
				}
				s = yearStr + s + String.valueOf(k);
			}
		}
		return s;
	}

	public int InsertStudent(String idSinhVien, String hoTenSinhVien, String anhDaiDienSinhVien, String email,
			String github, String diaChiSinhVien, String idTaiKhoan) {
		Connection connection = null;
		PreparedStatement stm = null;
		// ResultSet rset = null;
		try {
			connection = dbConnection.getConnection();
			String query = "insert into SinhVien (idSinhVien,hoTenSinhVien,anhDaiDienSinhVien,emailSinhVien,github, diachiSinhVien,idTaiKhoan) VALUeS (?,?,?,?,?,?,?)";
			stm = connection.prepareStatement(query);
			stm.setString(1, idSinhVien);
			stm.setNString(2, hoTenSinhVien);
			stm.setString(3, anhDaiDienSinhVien);
			stm.setString(4, email);
			stm.setString(5, github);
			stm.setString(6, diaChiSinhVien);
			stm.setString(7, idTaiKhoan);
			stm.executeUpdate();	
			return 1;

		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}
	
	public int UpdateStudent(String idSinhVien, String hoTenSinhVien, String anhDaiDienSinhVien, String email,
			String github, String diaChiSinhVien, String idTaiKhoan){
		Connection connection = null;
		PreparedStatement stm = null;
		// ResultSet rset = null;
		try {
			connection = dbConnection.getConnection();
			String query = "update SinhVien set hoTenSinhVien = ?,anhDaiDienSinhVien = ?,emailSinhVien = ?,github = ?, diachiSinhVien = ?,idTaiKhoan = ? where idSinhVien = ?";
			stm = connection.prepareStatement(query);
			stm.setNString(1, hoTenSinhVien);
			stm.setString(2, anhDaiDienSinhVien);
			stm.setString(3, email);
			stm.setString(4, github);
			stm.setString(5, diaChiSinhVien);
			stm.setString(6, idTaiKhoan);
			stm.setString(7, idSinhVien);
			stm.executeUpdate();
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}
	
	public int DeleteStudent(String idSinhVien){
		Connection connection = null;
		PreparedStatement stm = null;
		// ResultSet rset = null;
		try {
			connection = dbConnection.getConnection();
			String query = "update SinhVien set hidden = 1 where idSinhVien = ?";
			stm = connection.prepareStatement(query);
			stm.setString(1, idSinhVien);
			stm.executeUpdate();
			return 1;
		} catch (Exception e) {
			return 0;
		}
		
	}
	
}
