package Mypakage;

import java.io.IOException;
import My_DAO.MyDAO;
//import beans.EmpBean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.My_Bean;

/**
 * Servlet implementation class Cust_insert
 */
@WebServlet("/Cust_insert")
public class Cust_insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cust_insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String address=request.getParameter("Add");
		String mob=request.getParameter("mobile");
		String email=request.getParameter("email");
		
		String acc_no=request.getParameter("acc_num");
		String pass=request.getParameter("password");
		String balance=request.getParameter("balance");
		
		My_Bean b=new My_Bean();
		
		//b.setEid(Integer.parseInt(eid));
		b.setName(name);
		b.setAcc_no(Integer.parseInt(acc_no));
		b.setAddress(address);
		b.setEmail(email);
		b.setPass(pass);
		b.setMob(Integer.parseInt(mob));
		b.setBalance(Integer.parseInt(balance));
		
		//b.setSalary(Double.parseDouble(sal));
		//b.setAddress(add);

		MyDAO m = new MyDAO();
		int x= m.insert(b);
		
		if(x==1)
	         {
	        	 RequestDispatcher rd=request.getRequestDispatcher("admin/create_account.jsp");
                request.setAttribute("msg", "Data Inserted Successfully...");
               rd.forward(request, response);
	         
	         }
	         else
	         {
	        	 RequestDispatcher rd=request.getRequestDispatcher("admin/create_account.jsp");
             request.setAttribute("msg", "Data Not Inserted Successfully...");
            rd.forward(request, response);
	         }
			

	}

}
