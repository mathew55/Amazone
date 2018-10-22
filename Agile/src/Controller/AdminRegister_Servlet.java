package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import agile.TeamA.Registerandlogin_service.impl.Register_Service_impl;
import agile.TeamA.Registerandlogin_serviceI.Register_Login_Service;
import agile.TeamA.Vo.Admin_RegisterLogin_Vo;
/**
 * Servlet implementation class AdminRegister_Servlet
 */
@WebServlet("/AdminRegister_Servlet")
public class AdminRegister_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void destory() {
		
		super.destroy();
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminRegister_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession se = request.getSession();
		se.setMaxInactiveInterval(604800);
	    request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html;charset=utf-8");
		
		//String type=request.getParameter("type");
		
			String AdminID=request.getParameter("AdminID");
			String AdminPwd=request.getParameter("AdminPwd");
			String vtyAdminPwd=request.getParameter("vtyAdminPwd");
			String AdminName=request.getParameter("AdminName");
			String EmailAddress=request.getParameter("EmailAddress");
		
		Admin_RegisterLogin_Vo admininformation=new Admin_RegisterLogin_Vo();
		admininformation.setAdminID(AdminID);
		admininformation.setAdminPwd(AdminPwd);
		admininformation.setvtyAdminPwd(vtyAdminPwd);
		admininformation.setAdminName(AdminName);
		admininformation.setEmailAddress(EmailAddress);
		try {
			Register_Service_impl Register_Service=new Register_Service_impl();
			Register_Service.RegisterAdmin(admininformation);
			
			String message = String.format(
					                     "Register successful!!Automatically jump to the login page for you after 3 seconds!!"
					                     + "<meta http-equiv='refresh' content='3;url=%s'/>", 
					                    request.getContextPath()+"/servlet/LoginUIServlet");
					            request.setAttribute("message",message);
					            request.getRequestDispatcher("/message.jsp").forward(request,response);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
