package Mypakage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import My_DAO.MyDAO;

/**
 * Servlet implementation class Admin_check
 */
@WebServlet("/Admin_check")
public class Admin_check extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin_check() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String u=request.getParameter("name");
		String p=request.getParameter("psw");
	     MyDAO m=new MyDAO();
	     
	     int x=m.logincheck(u, p);
		if(x==1)
		{
		   //Session code here
			HttpSession session=request.getSession();
			session.setAttribute("uid",u);
			response.sendRedirect("admin/Admin_panel.jsp");
			
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			request.setAttribute("msg","Login fail try again...");
			rd.forward(request,response);
			  //response.sendRedirect("index.jsp");
		}
		
	}
	
}


