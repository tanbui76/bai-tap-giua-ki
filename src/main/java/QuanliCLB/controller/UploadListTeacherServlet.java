package QuanliCLB.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
		
		FileInputStream inp;
		
			List<GiaoVien> list = new ArrayList<>();
			
			inp = new FileInputStream(request.getServletContext().getRealPath("/File/Upload/")+fileName);
			XSSFWorkbook workbook = new XSSFWorkbook(inp);
			//get sheet
			XSSFSheet sheet = workbook.getSheetAt(0);
			//System.out.println("Sheet name"+sheet);
			DataFormatter dataFormatter = new DataFormatter();
			// get all row
			Iterator<Row> iterator = sheet.iterator();
			while(iterator.hasNext()) {
				Row row = iterator.next();
				if(row.getRowNum() ==0) {
					continue;
				}
				Iterator<Cell> cellIterator = row.cellIterator();
				
				// Read cells and set value for Teacher object
				GiaoVien gv = new GiaoVien();
				while(cellIterator.hasNext()) {
					// Read cell
					Cell cell = cellIterator.next();
					String cellValue = dataFormatter.formatCellValue(cell);
					System.out.println(cellValue);
					
				}
			}
			workbook.close();
			// get all cells
			
		/*	for(int i=1; i<=sheet.getLastRowNum(); i++)
			{
				row = sheet.getRow(i);
				gv.setIdGiaoVien(row.getCell(1).getStringCellValue());
				gv.setHoTenGiaoVien(row.getCell(2).getStringCellValue());
				gv.setEmailGiaoVien(row.getCell(4).getStringCellValue());
				gv.setDiaChiGiaoVien(row.getCell(5).getStringCellValue());
				gv.setIdTaiKhoan(row.getCell(7).getStringCellValue());
				list.add(gv);
			
									
			}
	    */
		/*	TeacherListDAO dao = new TeacherListDAO();
			dao.InsertListTeacher(list);
			System.out.println(list);
			*/
			response.sendRedirect("TeacherList.jsp");
			
			
		
		
	}
	
	
		 
		 

	}

