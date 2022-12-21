package QuanliCLB.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import QuanliCLB.dbconnection.dbConnection;
import QuanliCLB.model.GiaoVien;
import QuanliCLB.model.MonHoc;

public class CourseDAO {
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement stm = null;

	public List<MonHoc> getMonHoc() {
		List<MonHoc> listMon = new ArrayList<>();
		String query = "SELECT * FROM MonHoc";
		try {
			conn = dbConnection.getConnection();
			stm = conn.prepareStatement(query);
			rs = stm.executeQuery();
			while (rs.next()) {
				String idMonHoc = rs.getString("idMonHoc");
				String tenMonHoc = rs.getString("tenMonHoc");
				int tongSoTiet = rs.getInt("tongSoTiet");
				MonHoc monhoc = new MonHoc(idMonHoc, tenMonHoc, tongSoTiet);
				listMon.add(monhoc);
			}

		} catch (Exception e) {

		}

		return listMon;

	}

	public int InsertMonHoc(String idMonHoc, String tenMonHoc, int tongSoTiet) {
		Connection connection = null;
		PreparedStatement stm = null;
		ResultSet rSet = null;
		try {
			conn = dbConnection.getConnection();
			String query = "insert into MonHoc (idMonHoc, tenMonHoc, tongSoTiet)" + "values (?,?,?)";
			stm = conn.prepareStatement(query);
			stm.setString(1, idMonHoc);
			stm.setNString(2, tenMonHoc);
			stm.setInt(3, tongSoTiet);
			stm.executeUpdate();

			return 1;

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
			return 0;
		}

	}

	public void DeleteMonHoc(String idMonHoc) {
		String query = "delete from MonHoc where idMonHoc=?";
		try {
			conn = dbConnection.getConnection();
			stm = conn.prepareStatement(query);
			stm.setString(1, idMonHoc);
			stm.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public int UpdateMonHoc(String idMonHoc, String tenMonHoc) {
		Connection connection = null;
		PreparedStatement stm = null;
		try {
			conn = dbConnection.getConnection();
			String query = "update MonHoc set tenMonHoc= ?  where idMonHoc = ?";
			stm = conn.prepareStatement(query);
			stm.setString(1, idMonHoc);
			stm.setString(2, tenMonHoc);
			stm.executeUpdate();
			
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}

	}

	public List<MonHoc> getCourseListAutoID() {
		List<MonHoc> list = new ArrayList<MonHoc>();
		String queryString = "Select * from MonHoc order by idMonHoc desc";
		try {
			conn = dbConnection.getConnection();
			stm = conn.prepareStatement(queryString);
			rs = stm.executeQuery();
			while (rs.next()) {
				String idMonHoc = rs.getString("idMonHoc");
				String tenMonHoc = rs.getNString("tenMonHoc");
				int tongSoTiet = rs.getInt("tongSoTiet");
				MonHoc mHoc = new MonHoc(idMonHoc, tenMonHoc, tongSoTiet);
				list.add(mHoc);

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;

	}

	public String Matutang() {
		LocalDate localDate = LocalDate.now();
//		int year = localDate.getYear();
//		String yearStr = String.valueOf(year);
		List<MonHoc> list = getCourseListAutoID();
		String s = "MH";
		if (list.size() <= 0) {
			s = "MH001";
		} else {
			String chuoi = list.get(0).getIdMonHoc().toString();
//			String getString = chuoi.substring(0, 4);

//				System.out.println(chuoi.substring(6, 9));
			int k = 0;
			k = Integer.parseInt(chuoi.substring(3, 5));
			k = k + 1;
			if (k < 10) {
				s = s + "00";
			} else {
				if (k < 100) {
					s = s + "0";
				}
			}
			s = s + String.valueOf(k);

		}
		return s;
	}

}
