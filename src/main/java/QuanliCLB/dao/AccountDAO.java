package QuanliCLB.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import QuanliCLB.dbconnection.dbConnection;
import QuanliCLB.model.SinhVien;
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
					listtk.add(tk);			
				}			
				
			} catch (Exception e) {
				
			}
				
			return listtk;
		}
	 public List<TaiKhoan> getTaiKhoanIntoID(){
			List<TaiKhoan> listtk = new ArrayList<>();
			String query = "Select * from TaiKhoan order by idTaiKhoan desc";		
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
					listtk.add(tk);			
				}			
				
			} catch (Exception e) {
				
			}
				
			return listtk;
		}
	 
	 public String Matutang() {
			LocalDate localDate = LocalDate.now();
			int year = localDate.getYear();
			String yearStr = String.valueOf(year);
			List<TaiKhoan> list = getTaiKhoanIntoID();
			String s = "TK";
			if (list.size() <= 0) {
				s = yearStr + "TK001";
			} else {
				String chuoi = list.get(0).getIdTaiKhoan().toString();
				String getString = chuoi.substring(0, 4);
				if (!getString.equals(yearStr)) {
					s = yearStr + "TK001";
				} else {
//					System.out.println(chuoi.substring(6, 9));
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
	 
	 public void Insert(String idTaiKhoan, String tenDangNhap, String matKhau, int phanQuyen) {
		 Connection connection = null;
		 PreparedStatement stm = null;
		 //ResultSet rs = null;
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
