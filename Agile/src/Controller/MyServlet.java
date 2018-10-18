package Controller;
import DAO.NameDAO;
import DAO.NameDAO.Product;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.NameDAO;
import model.Name;
import DAO.NameDAO;
/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
/*	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println("checking for name in db");
		
		String name = request.getParameter("name");
		
		NameDAO.instance.checkFirstName(name);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// PrintWriter p = response.getWriter();
		// String name = request.getParameter("name");
		// normally out put will be in views
		// p.println("<h3>Hello " +name+ "</h3>");
		// doGet(request, response);
		
	//	String name = request.getParameter("name");
		String id = request.getParameter("pid");
		int pid = Integer.parseInt(id);
		//Name A_Name = new Name(pid);
		//NameDAO.instance.saveFirstName(A_Name);
		//String str = NameDAO.instance.checkFirstName(pid);
		//DAO.NameDAO.Product p ;
		//
		Product product = NameDAO.instance.checkFirstName(pid);
		//int product_ID;
		//StringBuilder product_Name = new StringBuilder("");
		//StringBuilder product_Manufacturer = new StringBuilder("");
		//double product_Price=0;
		//int product_Quantity=0;
//		product.setter();
		request.setAttribute("product_Id",product.product_ID);
		request.setAttribute("product_Name", product.product_Name);
		request.setAttribute("product_Manufacturer", product.product_Manufacturer);
		request.setAttribute("product_Price", product.product_Price);
		request.setAttribute("product_Quantity", product.product_Quantity);
		
		//
		request.getRequestDispatcher("product_info.jsp").forward(request, response);
	}

}
