
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext context = getServletContext();
	    String fullPath = context.getRealPath("/File/test.xlsx");
	    Path path = Paths.get(fullPath);
	    byte[] data = Files.readAllBytes(path);
	    response.setContentType("application/octet-stream");
	    response.setHeader("Content-disposition", "attachment; filename=test.xlsx");
	    response.setContentLength(data.length);
	    InputStream inputStream = new BufferedInputStream(new ByteArrayInputStream(data));
	    OutputStream outStream = response.getOutputStream();
	    byte[] buffer = new byte[4096];
	    int bytesRead = -1;
	    while ((bytesRead = inputStream.read(buffer)) != -1) {
	      outStream.write(buffer, 0, bytesRead);
	    }
	    inputStream.close();
	    outStream.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
