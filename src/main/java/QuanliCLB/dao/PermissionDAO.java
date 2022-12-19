package QuanliCLB.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import QuanliCLB.dbconnection.dbConnection;
import QuanliCLB.model.Permission;
import QuanliCLB.model.SinhVien;

public class PermissionDAO {
	Connection connection = null;
	PreparedStatement stm = null;
	ResultSet rs = null;

	public PermissionDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Permission> getPermissionTeacherList() {
		List<Permission> list = new ArrayList<Permission>();
		String query = "SELECT * FROM PhanQuyen where PhanQuyen = 2";
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
	public List<Permission> getPermissionStudentList() {
		List<Permission> list = new ArrayList<Permission>();
		String query = "SELECT * FROM PhanQuyen where PhanQuyen = 3";
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
	
}
