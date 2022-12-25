package QuanliCLB.Filter;

import java.awt.dnd.DragSourceAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import QuanliCLB.dao.LoginDAO;
import QuanliCLB.dao.PermissionDAO;
import QuanliCLB.model.Permission;
import QuanliCLB.model.TaiKhoan;

/**
 * Servlet Filter implementation class AuthenicationFilter
 */
@WebFilter("/AuthenicationFilter")
public class AuthenicationFilter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public AuthenicationFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		String getURL =  ((HttpServletRequest)request).getRequestURI();
		System.out.println(getURL);
		
		if(getURL.equals("/QuanLiCLB/LogoutServlet")|| getURL.equals("/QuanLiCLB/")||getURL.equals("/QuanLiCLB/NotPermission.jsp")) {
			chain.doFilter(request, response);
		}
		else {
			HttpSession session = ((HttpServletRequest)request).getSession();
			PermissionDAO dao = new PermissionDAO();
			List<Permission> listTcPermission = dao.getPermissionTeacherList();
			List<Permission> listStPermission = dao.getPermissionStudentList();
			if(session.getAttribute("tk")==null) {
				chain.doFilter(request, response);
			} else {
				TaiKhoan tk = (TaiKhoan) session.getAttribute("tk");
				int phanquyen = tk.getPhanQuyen();
				if(phanquyen==1) {
					chain.doFilter(request, response);
				}
				if(phanquyen==2) {
					if(checkPassed(getURL, listTcPermission)==true) {
						chain.doFilter(request, response);
					} else {
						((HttpServletResponse) response).sendRedirect("NotPermission.jsp");
					}
				}
				if(phanquyen==3) {
					if(checkPassed(getURL, listStPermission)==true) {
						chain.doFilter(request, response);
					} else {
						((HttpServletResponse) response).sendRedirect("NotPermission.jsp");
					}
				}
			}
		}
		
		
		
		// pass the request along the filter chain
		
	}
	
	public boolean checkPassed(String url,List<Permission> list) {
		for (int i = 0; i < list.size(); i++) {
			String checkingURL = "/QuanLiCLB/" + list.get(i).getLinkForm();
			if(url.equals(checkingURL)==true) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
