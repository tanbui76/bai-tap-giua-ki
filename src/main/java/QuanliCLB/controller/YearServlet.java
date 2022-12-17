package QuanliCLB.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import QuanliCLB.dao.YearDao;
import QuanliCLB.model.NienKhoa;

/**
 * Servlet implementation class YearServlet
 */
@WebServlet("/YearServlet")
public class YearServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public YearServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 YearDao yearDao = new YearDao();
		  List<NienKhoa> nienKhoa = yearDao.getListNienKhoa();  
		  request.setAttribute("listNienKhoa", nienKhoa);
		  RequestDispatcher rDispatcher = request.getRequestDispatcher("Schedule.jsp");
		 rDispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
