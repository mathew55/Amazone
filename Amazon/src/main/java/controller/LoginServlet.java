package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.UserRegDAO;

import model.UserRegistrationBean;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("username");
		System.out.println("username entered is"+userName);
		 String password = request.getParameter("password");
		 System.out.println("password entered is"+password);
		 String button1=request.getParameter("button1");
		 System.out.println("value of button is "+button1);
		
		UserRegistrationBean loginBean = new UserRegistrationBean(); //creating object for LoginBean class, which is a normal java class, contains just setters and getters. Bean classes are efficiently used in java to access user information wherever required in the application.
		 
		loginBean.setUserName(userName); //setting the username and password through the loginBean object then only you can get it in future.
		 loginBean.setPassword1(password);
		 
		UserRegDAO loginDao = new UserRegDAO (); //creating object for LoginDao. This class contains main logic of the application.
		 
		String userValidate = loginDao.validateUserdetailsforLogin(loginBean); //Calling authenticateUser function
		System.out.println(userValidate);
		 
		if(userValidate.equals("SUCCESS")) //If function returns success string then user will be rooted to Home page
		 {
		 request.setAttribute("userName", userName); //with setAttribute() you can define a "key" and value pair so that you can get it in future using getAttribute("key")
		 request.getRequestDispatcher("/tobzindex.jsp").forward(request, response);//RequestDispatcher is used to send the control to the invoked page.
		 }
		else if (button1.equalsIgnoreCase("SignUp"))
		 {
			 request.getRequestDispatcher("/register.jsp").forward(request, response);  
		 }
		 
		 else
		 {
		 request.setAttribute("errMessage", userValidate); //If authenticateUser() function returnsother than SUCCESS string it will be sent to Login page again. Here the error message returned from function has been stored in a errMessage key.
		 request.getRequestDispatcher("/Error.jsp").forward(request, response);//forwarding the request
		 }
		 }
	}


