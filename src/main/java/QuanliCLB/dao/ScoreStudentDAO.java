package QuanliCLB.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import QuanliCLB.dbconnection.dbConnection;
import QuanliCLB.model.BangDiemPhu;

public class ScoreStudentDAO {
	Connection connection = null;
	PreparedStatement stm = null;
	ResultSet rs = null;
	
	public ScoreStudentDAO() {
		// TODO Auto-generated constructor stub
	}
	public List<BangDiemPhu> getBangDiemPhu() {
		List<BangDiemPhu> list =  new ArrayList<BangDiemPhu>();
		String query = "select distinct f.namNienKhoa, e.tenHocKi, d.idMonHoc,d.tenMonhoc\r\n"
				+ "from BangDiemChiTiet  a\r\n"
				+ "inner join BangDiem b on a.idBangDiem = b.idBangDiem\r\n"
				+ "join SinhVien c on c.idSinhVien = b.idSinhVien\r\n"
				+ "join MonHoc d on d.idMonHoc = a.idMonHoc\r\n"
				+ "join HocKi e on e.idHocKi = b.idHocKi\r\n"
				+ "join NienKhoa f on f.idNienKhoa = e.idNienKhoa";
		try {
			connection =dbConnection.getConnection();
			stm = connection.prepareStatement(query);
			rs = stm.executeQuery();
			while (rs.next()) {
				System.out.println("h1");
				String namNienKhoa = rs.getString("namNienKhoa");
				String tenHocKi = rs.getNString("tenHocKi");
				String idMonHoc = rs.getString("idMonHoc");
				String tenMonhoc = rs.getNString("tenMonHoc");
				BangDiemPhu bd = new BangDiemPhu(namNienKhoa,tenHocKi,idMonHoc,tenMonhoc);
				System.out.println("h2");
				System.out.println(tenMonhoc);
				list.add(bd);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return list;
	}
}
