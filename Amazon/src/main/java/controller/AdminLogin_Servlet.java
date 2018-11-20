package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import agile.TeamA.Registerandlogin_service.impl.Register_Login_Service_impl;
import agile.TeamA.Vo.Admin_RegisterLogin_Vo;

/**
 * Servlet implementation class AdminLogin_Servlet
 */
@WebServlet("/AdminLogin_Servlet")
public class AdminLogin_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminLogin_Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String AdminName = request.getParameter("AdminName");
		String AdminPwd = request.getParameter("AdminPwd");
		Admin_RegisterLogin_Vo admininformation = new Admin_RegisterLogin_Vo();
		admininformation.setAdminPwd(AdminPwd);
		admininformation.setAdminName(AdminName);
		Register_Login_Service_impl Register_Service = new Register_Login_Service_impl();
		try {
			boolean bl = Register_Service.LoginAdmin(admininformation);
			if (bl) {
				//if login successful use this to change page
				String message = String.format(
						"Login successful!!Automatically jump to the dashboard page for you after 3 seconds!!"
								+ "<meta http-equiv='refresh' content='3;url=%s'/>",
						request.getContextPath() + "/AdminDashboardServlet");
						///adminmanagement.jsp
				request.setAttribute("message", message);
				request.getRequestDispatcher("/message.jsp").forward(request, response);
			} else {
				//use this to redirect page
				request.setAttribute("error", "The account or password you entered is incorrect. Please re-enter!");
				request.getRequestDispatcher("adminlogin.jsp").forward(request, response);
			}
		} catch (Exception e) {
			//use this to redirect page
			e.printStackTrace();
			request.setAttribute("error", "The account or password you entered is incorrect. Please re-enter!");
			request.getRequestDispatcher("adminlogin.jsp").forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
