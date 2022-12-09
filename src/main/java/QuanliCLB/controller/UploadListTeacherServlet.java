package QuanliCLB.controller;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import QuanliCLB.dao.TeacherListDAO;
import QuanliCLB.model.GiaoVien;



@WebServlet("/UploadListTeacherServlet")
public class UploadListTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public UploadListTeacherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FileInputStream inp;
		try {
			List<GiaoVien> list = new ArrayList<>();
			GiaoVien gv = new GiaoVien();
			inp = new FileInputStream("C:/Users/Ngan Thanh/Downloads/test.xlsx");
			Workbook workbook = new HSSFWorkbook(new POIFSFileSystem(inp));
			Sheet sheet = workbook.getSheetAt(0);
			Row row ;
			for(int i=1; i<=sheet.getLastRowNum(); i++)
			{
				row = sheet.getRow(i);
				gv.setIdGiaoVien(row.getCell(1).getStringCellValue());
				gv.setHoTenGiaoVien(row.getCell(2).getStringCellValue());
				gv.setEmailGiaoVien(row.getCell(4).getStringCellValue());
				gv.setDiaChiGiaoVien(row.getCell(5).getStringCellValue());
				gv.setIdTaiKhoan(row.getCell(7).getStringCellValue());
				list.add(gv);
			
									
			}
			TeacherListDAO dao = new TeacherListDAO();
			dao.InsertListTeacher(list);
			response.sendRedirect("TeacherList.jsp");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
		}
	}

}
