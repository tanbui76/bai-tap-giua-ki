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
import QuanliCLB.model.SinhVien;


public class StudentListDAO {
	Connection connection = null;
	PreparedStatement stm = null;
	ResultSet rs = null;
	
	public StudentListDAO() {
		// TODO Auto-generated constructor stub
	}
	public List<SinhVien> getStudenList(){
		List<SinhVien> list = new ArrayList<SinhVien>();
		String query = "SELECT * FROM SinhVien";
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
				SinhVien sv = new SinhVien(idSinhVien, hoTenSinhVien, anhDaiDienSinhVien, email, github, diaChiSinhVien,idTaiKhoan );
				list.add(sv);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public List<SinhVien> getStudenListAutoGenID(){
		List<SinhVien> list = new ArrayList<SinhVien>();
		String query = "Select * from TaiKhoan order by idTaiKhoan desc";
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
				SinhVien sv = new SinhVien(idSinhVien, hoTenSinhVien, anhDaiDienSinhVien, email, github, diaChiSinhVien,idTaiKhoan );
				list.add(sv);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public void Insert(String idSinhVien, String hoTenSinhVien,String anhDaiDienSinhVien,String emailSinhVien,String github,String diaChiSinhVien,String idTaiKhoan) {
		Connection connection = null;
		PreparedStatement stm =null;
		ResultSet rSet=null;
		try {
			connection = dbConnection.getConnection();
			String query = "INSERT INTO SinhVien (idSinhVien,hoTenSinhVien,anhDaiDienSinhVien,emailSinhVien,github, diachiSinhVien,idTaiKhoan) "
					+ "VALUES (?, ?, ?, ?, ?)";
			stm = connection.prepareStatement(query);
			stm.setString(1, idSinhVien);
			stm.setString(2, hoTenSinhVien);;
			stm.setString(3, anhDaiDienSinhVien);
			stm.setString(4, emailSinhVien);
			stm.setString(5, github);
			stm.setString(6, diaChiSinhVien);;
			stm.setString(7, idTaiKhoan);
			stm.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public String Matutang()
    {
		LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        String yearStr = String.valueOf(year);
        List<SinhVien> list = getStudenListAutoGenID();
        String s = "SV";
        if (list.size() <= 0)
        {
            s = yearStr + "SV001";
        }
        else
        {
            String chuoi = list.get(0).getIdTaiKhoan().toString();
            if (chuoi.substring(0, 4) != yearStr)
            {
                s = yearStr + "SV001";
            }
            else
            {
                int k;
                k = Integer.parseInt(chuoi.substring(6, 3));
                k = k + 1;
                if (k < 10) {
                	s = s + "00";
                }
                else {
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
