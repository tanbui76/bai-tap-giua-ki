

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FileDownloadServlet
 */
@WebServlet("/FileDownloadServlet")
public class FileDownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out = response.getWriter()){
			out.print("Hello word");
			/*
			 * String name = request.getParameter("filename"); String path =
			 * getServletContext().getRealPath("/"+"File"+File.separator+name);
			 * out.print(path); ServletContext context = getServletContext();
			 * 
			 * String mimeType = context.getMimeType(path); if (mimeType == null) { mimeType
			 * = ""; } response.setContentType(""); response.setContentLengthLong((int)down
			 */
			/*
			 * OutputStream out1 = response.getOutputStream(); String name =
			 * request.getParameter("filename"); String path =
			 * getServletContext().getRealPath("/"+"File"+File.separator+name);
			 * out.print(path);
			 * 
			 * 
			 * 
			 * response.setContentType("text/html");
			 * response.setContentType("APPLICATION/OCTET-STREAM");
			 * response.setHeader("Content-Disposition", "attachment; filename=test.xlsx");
			 * FileInputStream in = new FileInputStream(path); byte[] buffer = new
			 * byte[4096]; int length; while ((length = in.read(buffer)) > 0) {
			 * out1.write(buffer, 0, length); } in.close(); out1.flush();
			 */
			 String fileName = "test.xlsx";
		        FileInputStream fileInputStream = null;
		        OutputStream responseOutputStream = null;
		        try
		        {
		            String filePath = request.getServletContext().getRealPath("/File/")+ fileName;
		            File file = new File(filePath);
		            
		            String mimeType = request.getServletContext().getMimeType(filePath);
		            if (mimeType == null) {        
		                mimeType = "application/octet-stream";
		            }
		            response.setContentType(mimeType);
		            response.addHeader("Content-Disposition", "attachment; filename=" + fileName);
		            response.setContentLength((int) file.length());
		 
		            fileInputStream = new FileInputStream(file);
		            responseOutputStream = response.getOutputStream();
		            int bytes;
		            while ((bytes = fileInputStream.read()) != -1) {
		                responseOutputStream.write(bytes);
		            }
		        }
		        catch(Exception ex)
		        {
		            ex.printStackTrace();
		        }
		        finally
		        {
		            fileInputStream.close();
		            responseOutputStream.close();
		        }
		    }
			
		}
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
