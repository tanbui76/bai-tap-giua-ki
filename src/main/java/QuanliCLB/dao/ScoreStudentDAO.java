package QuanliCLB.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import QuanliCLB.dbconnection.dbConnection;
import QuanliCLB.model.BangDiem;
import QuanliCLB.model.BangDiemChiTiet;
import QuanliCLB.model.BangDiemPhu;
import QuanliCLB.model.HocKi;
import QuanliCLB.model.MonHoc;
import QuanliCLB.model.NienKhoa;
import QuanliCLB.model.TuanHoc;

public class ScoreStudentDAO {
	Connection conn = null;
	PreparedStatement stm = null;
	ResultSet rs = null;
	
    public NienKhoa getIdNienKhoa(String idNienKhoa) {
    	NienKhoa  nienKhoa = null;
    	String query ="select * from NienKhoa where idNienKhoa=?";
    	 try {
				conn = dbConnection.getConnection();
				stm = conn.prepareStatement(query);
				stm.setString(1, idNienKhoa);
				rs = stm.executeQuery();
				if(rs.next()) {
					 String idNienKh =rs.getString("idNienKhoa");
					 String namNienKhoa = rs.getString("namNienKhoa");
					
					  nienKhoa = new NienKhoa(idNienKh,namNienKhoa);
					  return nienKhoa;

					 
				}
			} catch (Exception e) {
				e.printStackTrace();
			} 
    	
    	
		return nienKhoa;
    }
    
    
    public HocKi getIdKi(String idNienKhoa) {
    	HocKi hocKi = null;
    	String query ="select * from HocKi where idNienKhoa=?";
    	 try {
				conn = dbConnection.getConnection();
				stm = conn.prepareStatement(query);
				stm.setString(1, idNienKhoa);
				rs = stm.executeQuery();
				if(rs.next()) {
					 String idHocki =rs.getString("idHocKi");
					 String idNienKhoas = rs.getString("idNienKhoa");
					 String tenHocKi = rs.getString("tenHocKi");
					
					  hocKi = new HocKi(idHocki,idNienKhoas,tenHocKi);
					  return hocKi;
					 
				}
			} catch (Exception e) {
				e.printStackTrace();
			} 
    	
    	
    	 return hocKi;
    }
    
    public BangDiem getIdBangDiem(String idHocKi, String idSinhVien) {
    	BangDiem bangDiem = null;
    	String query ="select *from BangDiem where idHocKi=? and idSinhVien=?";
    	try {
    		conn = dbConnection.getConnection();
    		stm =conn.prepareStatement(query);   		
    		stm.setString(1, idHocKi);
    		stm.setString(2, idSinhVien);
    		rs= stm.executeQuery();
    		if(rs.next()) {
    			String idBangDiem = rs.getString("idBangDiem");
    			String idHocK = rs.getString("idHocKi");
    			String idSV = rs.getString("idSinhVien");
    			String idGiaoVien = rs.getString("idGiaoVien");
    			bangDiem = new BangDiem(idBangDiem,idHocK,idSV,idGiaoVien);
    			return bangDiem;
    			
    			
    		}
    		
    		
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
    	return bangDiem;
    	
    }
    
    public List<BangDiemChiTiet> getIdMonHoc(String idBangDiem) {
    	List<BangDiemChiTiet> listBangDiemChiTiets = new ArrayList<>();
    
    	String query = "select * from BangDiemChiTiet where idBangDiem=?";
    	try {
    		conn = dbConnection.getConnection();
    		stm =conn.prepareStatement(query); 
    		stm.setString(1, idBangDiem);
    		rs = stm.executeQuery();
    		if(rs.next()) {
    			
    			String idBangDiemChiTiet = rs.getString("idBangDiemChiTiet");
    			String idBangD = rs.getString("idBangDiem");
    			
    			float diemHe1 = rs.getFloat("diemHe1");
    		    float diemHe2 = rs.getFloat("diemHe2");
    			float diemHe3 = rs.getFloat("diemHe3");
    			String idMonHoc = rs.getString("idMonHoc");
    			BangDiemChiTiet bangDiemChiTiet = new BangDiemChiTiet(idBangDiemChiTiet,idBangD,diemHe1,diemHe2,diemHe3,idMonHoc);
    		    listBangDiemChiTiets.add(bangDiemChiTiet);
    		}
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
    	return listBangDiemChiTiets;
    	
    }
    
    
    public MonHoc getTenMon(String tenMonHoc) {
    	MonHoc monHoc = null;
    	String query ="select *from MonHoc where idMonHoc=?";
    	try {
    		conn = dbConnection.getConnection();
    		stm =conn.prepareStatement(query); 
    		stm.setString(1, tenMonHoc);
    		rs = stm.executeQuery();
    		if(rs.next()) {
    			String idMonHoc = rs.getString("idMonHoc");
    			String tenMH = rs.getNString("tenMonHoc");
    			int tongSoTiet = rs.getInt("tongSoTiet");
    			monHoc = new MonHoc(idMonHoc,tenMH,tongSoTiet);
    			return monHoc;
    		}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return monHoc;
    	
    }
    
    

    
    public static void main(String[] args) {
    	String idNienKhoa = "NK001";
    	ScoreStudentDAO scoreStudentDAO = new ScoreStudentDAO();
    	NienKhoa nk = scoreStudentDAO.getIdNienKhoa(idNienKhoa);
    	System.out.println(nk.getIdNienKhoa());
    	HocKi hocKi = scoreStudentDAO.getIdKi(idNienKhoa);
    	String idHk  = hocKi.getIdHocKi();
    	System.out.println(idHk);
    	String idsv ="2022SV001";
    	BangDiem bangDiem = scoreStudentDAO.getIdBangDiem(idHk,idsv);
    	String idBangDiem = bangDiem.getIdBangDiem();
    	System.out.println(idBangDiem);
    	List<BangDiemChiTiet> list = scoreStudentDAO.getIdMonHoc(idBangDiem);
        for (BangDiemChiTiet bangDiemChiTiet : list) {
			System.out.println(bangDiemChiTiet.getIdMonHoc());
			 String idMon = bangDiemChiTiet.getIdMonHoc(); 
			 MonHoc monHoc = scoreStudentDAO.getTenMon(idMon);
			 System.out.println(monHoc.getTenMonhoc());
		}

    	
    }
	

}
