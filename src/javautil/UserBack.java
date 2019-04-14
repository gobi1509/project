package javautil;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import login.TeamProcess1;

/**
 * Servlet implementation class UserBack
 */
@WebServlet("/UserBack")
public class UserBack extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserBack() {
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
		String n=request.getParameter("uname");
		String k=request.getParameter("password");  
		TeamProcess1 obj=new TeamProcess1();
	boolean g=	obj.login(n, k);
		System.out.println(g);
		
		
		if(g == true)
		{
		RequestDispatcher rs = request.getRequestDispatcher("dashboard.jsp");
		rs.forward(request, response);
		}
		else {
			RequestDispatcher rs = request.getRequestDispatcher("error.html");
			rs.forward(request, response);
		}
		
	}

}
