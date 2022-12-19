package QuanliCLB.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



import QuanliCLB.dbconnection.dbConnection;
import QuanliCLB.model.GiaoVien;
import QuanliCLB.model.SinhVien;

public class TeacherListDAO {
	Connection con = null;
	PreparedStatement stm = null;
	ResultSet rs = null;
	
	public TeacherListDAO() {
		// TODO Auto-generated constructor stub
	}
	public List<GiaoVien> getTeacherList() throws SQLException{
		List<GiaoVien> list = new ArrayList<GiaoVien>();
		String query = "SELECT * FROM GiaoVien where HIDDEN is null ";
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


	public void InsertExceltTeacher(List<GiaoVien> giaovien) {
		Connection connection = null;
		PreparedStatement stm = null;
	//	ResultSet rset = null;
		try {
			connection = dbConnection.getConnection();
			String  query = "INSERT INTO GiaoVien (idGiaoVien,hoTenGiaoVien,emailGiaoVien, diachiGiaoVien,idTaiKhoan)"
					+ "VALUES (?, ?, ?, ?, ?)";
			stm = connection.prepareStatement(query);
			for (GiaoVien gv: giaovien) { 
				stm.setString(1, gv.getIdGiaoVien());
				stm.setString(2, gv.getHoTenGiaoVien());
				stm.setString(3, gv.getEmailGiaoVien());
				stm.setString(4, gv.getDiaChiGiaoVien());
				stm.setString(5, gv.getIdTaiKhoan());
				stm.addBatch();
			
			}
			stm.executeBatch();
			System.out.println("Thêm thành công!");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
//	public void InsertExcel(String idGiaoVien, String hoTenGiaoVien, String emailGiaoVien, String diachiGiaoVien, String idTaiKhoan) throws ClassNotFoundException, SQLException {
//		Connection connection = null;
//		PreparedStatement stm = null;
//		ResultSet rs = null;
//		try {
//			connection = dbConnection.getConnection();
//			String  query = "INSERT INTO GiaoVien (idGiaoVien,hoTenGiaoVien,emailGiaoVien, diachiGiaoVien,idTaiKhoan)"
//					+ "VALUES (?, ?, ?, ?, ?)";
//			stm = connection.prepareStatement(query);
//			stm.setString(1, idGiaoVien);
//			stm.setString(2, hoTenGiaoVien);
//			stm.setString(3, emailGiaoVien);
//			stm.setString(4, diachiGiaoVien);
//			stm.setString(5, idTaiKhoan);
//			stm.executeUpdate();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
	public int UpdateTeacher(String idGiaoVien, String hoTenGiaoVien, String anhDaiDienGiaoVien, String emailGiaoVien,
			String github, String diaChiGiaoVien, String idTaiKhoan){
		Connection connection = null;
		PreparedStatement stm = null;
		// ResultSet rset = null;
		try {
			connection = dbConnection.getConnection();
			String query = "update GiaoVien set hoTenGiaoVien = ?,anhDaiDienGiaoVien = ?,emailGiaoVien = ?,github = ?, diachiGiaoVien = ?,idTaiKhoan = ? where idGiaoVien = ?";
			stm = connection.prepareStatement(query);
			stm.setNString(1, hoTenGiaoVien);
			stm.setString(2, anhDaiDienGiaoVien);
			stm.setString(3, emailGiaoVien);
			stm.setString(4, github);
			stm.setString(5, diaChiGiaoVien);
			stm.setString(6, idTaiKhoan);
			stm.setString(7, idGiaoVien);
			stm.executeUpdate();
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}
	public List<SinhVien> getTeacherListAutoGenID() {
		List<SinhVien> list = new ArrayList<SinhVien>();
		// String query = "Select * from TaiKhoan ORDER BY idTaiKhoan DESC";
		String query = "Select * from GiaoVien order by idGiaoVien desc";
		
		try {
			con = dbConnection.getConnection();
			stm = con.prepareStatement(query);
			rs = stm.executeQuery();
			while (rs.next()) {
				String idGiaoVien = rs.getString("idGiaoVien");
				String hoTenGiaoVien = rs.getNString("hoTenGiaoVien");
				String anhDaiDienGiaoVien = rs.getString("anhDaiDienGiaoVien");
				String email = rs.getString("emailGiaoVien");
				String github = rs.getString("github");
				String diaChiGiaoVien = rs.getNString("diaChiGiaoVien");
				String idTaiKhoan = rs.getString("idTaiKhoan");
				SinhVien sv = new SinhVien(idGiaoVien, hoTenGiaoVien, anhDaiDienGiaoVien, email, github, diaChiGiaoVien,
						idTaiKhoan);
				list.add(sv);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	public String Matutang() {
		LocalDate localDate = LocalDate.now();
		int year = localDate.getYear();
		String yearStr = String.valueOf(year);
		List<SinhVien> list = getTeacherListAutoGenID();
		String s = "GV";
		if (list.size() <= 0) {
			s = yearStr + "GV001";
		} else {
			String chuoi = list.get(0).getIdSinhVien().toString();
			String getString = chuoi.substring(0, 4);
			if (!getString.equals(yearStr)) {
				s = yearStr + "GV001";
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
	public int DeleteTeacher(String idGiaoVien){
		Connection connection = null;
		PreparedStatement stm = null;
		// ResultSet rset = null;
		try {
			connection = dbConnection.getConnection();
			String query = "update GiaoVien set HIDDEN = 1 where idGiaoVien = ?";
			stm = connection.prepareStatement(query);
			stm.setString(1, idGiaoVien);
			stm.executeUpdate();
			return 1;
		} catch (Exception e) {
			return 0;
		}
		
	}
	
	
	
}
