package QuanliCLB.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;
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
		
		FileInputStream inp;
		
		List<GiaoVien> list = new ArrayList<>();
			inp = new FileInputStream(request.getServletContext().getRealPath("/File/Upload/")+fileName);
			XSSFWorkbook workbook = new XSSFWorkbook(inp);//
			//get sheet
			XSSFSheet sheet = workbook.getSheetAt(0); 
			//System.out.println("Sheet name"+sheet);
			DataFormatter dataFormatter = new DataFormatter();
			// get all row
			Iterator<Row> iterator = sheet.iterator(); 
			GiaoVien gv = new GiaoVien();
			while(iterator.hasNext()) { 
				Row row = iterator.next();
				if(row.getRowNum() ==0) {  // bỏ qua hàng trên cùng 
					continue;
				}
				Iterator<Cell> cellIterator = row.cellIterator();	// lay cac cell trong row						
				while(cellIterator.hasNext()) { 
					// Read cell
					Cell cell = cellIterator.next();
					String cellValue = dataFormatter.formatCellValue(cell); 
					//	System.out.println(cellValue);
					if(cellValue.equals("") || cellValue == null) {
						continue;
					}
					
					// Set value for Teacher object
					switch (cell.getColumnIndex()) {
					case 0:
						gv.setIdGiaoVien(cellValue);
						break;
					case 1:
						gv.setHoTenGiaoVien(cellValue);
						break;
					case 2:
						gv.setEmailGiaoVien(cellValue);
						break;
					case 3:
						gv.setDiaChiGiaoVien(cellValue);
						break;
					case 4:
						gv.setIdTaiKhoan(cellValue);
						break;
					default:
						break;
					}
					// Add Teacher object to list
					

				}	
				// Add Teacher object to list
				list.add(gv);
				TeacherListDAO dao = new TeacherListDAO();
				dao.InsertExceltTeacher(list);
				// lấy dữ liệu trong danh sách
//				for (GiaoVien giaoVien : list) {
//					System.out.println(giaoVien.getIdGiaoVien());
//					System.out.println(giaoVien.getHoTenGiaoVien());
//					System.out.println(giaoVien.getEmailGiaoVien());
//					System.out.println(giaoVien.getDiaChiGiaoVien());
//					System.out.println(giaoVien.getIdTaiKhoan());
//					
//				}
			
				// Cell cellidGiaoVien =row.getCell(1);
				// String idGiaoVien = cellidGiaoVien.toString();	
				// System.out.println(idGiaoVien);
				// Cell cellHoTenGiaoVien = row.getCell(2);
				// String HoTenGiaoVien = cellHoTenGiaoVien.toString();
				// System.out.println(HoTenGiaoVien);
				// Cell cellEmailGiaoVien = row.getCell(3);
				// String EmailGiaoVien = cellEmailGiaoVien.toString();
				// System.out.println(EmailGiaoVien);
				// Cell cellDiaChiGiaoVien = row.getCell(4);
				// String DiaChiGiaoVien = cellDiaChiGiaoVien.toString();
				// Cell cellIdTaiKhoan = row.getCell(5);
				// String IdTaiKhoan = cellIdTaiKhoan.toString();
				// System.out.println(IdTaiKhoan);
									
			}
			workbook.close();
			response.sendRedirect("TeacherList.jsp");
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
		
			
		
	}
		 

	}

