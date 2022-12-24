package QuanliCLB.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import QuanliCLB.dbconnection.dbConnection;
import QuanliCLB.model.Permission;

public class PermissionDAO {
	Connection connection = null;
	PreparedStatement stm = null;
	ResultSet rs = null;

	public PermissionDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Permission> getPermissionTeacherList() {
		List<Permission> list = new ArrayList<Permission>();
		String query = "SELECT * FROM PhanQuyen where PhanQuyen = 2 and hidden is null";
		try {
			connection = dbConnection.getConnection();
			stm = connection.prepareStatement(query);
			rs = stm.executeQuery();
			while (rs.next()) {
				 String idPhanQuyen = rs.getString("idPhanQuyen");
				 int PhanQuyen = rs.getInt("PhanQuyen");
				 String tenModule = rs.getNString("tenModule");
				 String icon = rs.getString("icon");
				 String linkForm = rs.getString("linkForm");
				 Permission permission = new Permission(idPhanQuyen, PhanQuyen, tenModule, icon, linkForm);
				 list.add(permission);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	
	public int AddPermissionServlet(String idPhanQuyen,int PhanQuyen,String tenModule,String linkForm) {
		Connection connection = null;
		PreparedStatement stm = null;
		try {
			connection = dbConnection.getConnection();
			String query = "insert into PhanQuyen (idPhanQuyen,PhanQuyen,tenModule,linkForm) "
					+ "VALUES (?,?,?,?)";
			stm = connection.prepareStatement(query);
			stm.setString(1, idPhanQuyen);
			stm.setInt(2, PhanQuyen);
			stm.setNString(3, tenModule);
			stm.setString(4, linkForm);
		
			
			PermissionDAO permissionDAO = new PermissionDAO();
			stm.executeUpdate();	
			return 1;

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
			return 0;
		}
	}
	public int UpDatePermission (String idPhanQuyen,int PhanQuyen,String tenModule,String linkForm) {
		Connection con = null;
		PreparedStatement  stm = null;
		try {
			con = dbConnection.getConnection();
			String query = "update PhanQuyen set PhanQuyen = ?,tenModule = ?,linkForm = ? where idPhanQuyen = ?";
			stm = con.prepareStatement(query);
			stm.setInt(1, PhanQuyen);
			stm.setNString(2, tenModule);
			stm.setString(3, linkForm);
			stm.setString(4, idPhanQuyen);
			stm.execute();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
			return 0;
		}
		
	}
	public int DeletePermission(String idPhanQuyen) {
		Connection con =null;
		PreparedStatement stm = null;
		try {
			con = dbConnection.getConnection();
			String query = "update PhanQuyen set hidden = 1 where idPhanQuyen = ?";
			stm = con.prepareStatement(query);
			stm.setString(1, idPhanQuyen);
			stm.executeUpdate();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
			return 0;
		}
	}
	public List<Permission> getPermissionStudentList() {
		List<Permission> list = new ArrayList<Permission>();
		String query = "SELECT * FROM PhanQuyen where PhanQuyen = 3 and hidden is null";
		try {
			connection = dbConnection.getConnection();
			stm = connection.prepareStatement(query);
			rs = stm.executeQuery();
			while (rs.next()) {
				 String idPhanQuyen = rs.getString("idPhanQuyen");
				 int PhanQuyen = rs.getInt("PhanQuyen");
				 String tenModule = rs.getNString("tenModule");
				 String icon = rs.getString("icon");
				 String linkForm = rs.getString("linkForm");
				 Permission permission = new Permission(idPhanQuyen, PhanQuyen, tenModule, icon, linkForm);
				 list.add(permission);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	
	public List<Permission> getPermissionList() {
		List<Permission> list = new ArrayList<Permission>();
		String query = "SELECT * FROM PhanQuyen order by idPhanQuyen desc";
		try {
			connection = dbConnection.getConnection();
			stm = connection.prepareStatement(query);
			rs = stm.executeQuery();
			while (rs.next()) {
				 String idPhanQuyen = rs.getString("idPhanQuyen");
				 int PhanQuyen = rs.getInt("PhanQuyen");
				 String tenModule = rs.getNString("tenModule");
				 String icon = rs.getString("icon");
				 String linkForm = rs.getString("linkForm");
				 Permission permission = new Permission(idPhanQuyen, PhanQuyen, tenModule, icon, linkForm);
				 list.add(permission);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	
	public String Matutang() {
		LocalDate localDate = LocalDate.now();
		int year = localDate.getYear();
		String yearStr = String.valueOf(year);
		List<Permission> list = getPermissionList();
		String s = "PQ";
		if (list.size() <= 0) {
			s = yearStr + "PQ001";
		} else {
			String chuoi = list.get(0).getIdPhanQuyen().toString();
			String getString = chuoi.substring(0, 4);
			if (!getString.equals(yearStr)) {
				s = yearStr + "PQ001";
			} else {
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
}
