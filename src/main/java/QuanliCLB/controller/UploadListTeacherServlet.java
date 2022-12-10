package QuanliCLB.controller;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.tomcat.util.descriptor.web.MultipartDef;

import QuanliCLB.dao.TeacherListDAO;
import QuanliCLB.model.GiaoVien;



@WebServlet("/UploadListTeacherServlet")
@MultipartConfig()
public class UploadListTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Part part = request.getPart("file");
		String realPart = request.getServletContext().getRealPath("/File/Upload");
		System.out.println(realPart);
		String fileName = Path.of(part.getSubmittedFileName()).getFileName().toString();
		// kiem tra file da dc tạo chua
		if(!Files.exists(Path.of(realPart)))
		{
			Files.createDirectories(Path.of(realPart));
		}
		part.write(realPart+"/"+fileName);
		/*
		try(PrintWriter out= response.getWriter()){
			out.print("Luu thanh cong!!");
		}
		*/
		
		FileInputStream inp;
		
			List<GiaoVien> list = new ArrayList<>();
			GiaoVien gv = new GiaoVien();
		//	inp = new FileInputStream(request.getServletContext().getRealPath("/File/Upload/")+fileName);
			//Workbook workbook = new HSSFWorkbook(new POIFSFileSystem(inp));
			Workbook wb = WorkbookFactory.create(new FileInputStream(request.getServletContext().getRealPath("/File/Upload/")+fileName));
			Sheet sheet = wb.getSheetAt(0);
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
			System.out.println(list);
			response.sendRedirect("TeacherList.jsp");
			
			
		
			// TODO: handle exception
			//System.out.println("error");
		
	}
	
	
		 
		 

	}

