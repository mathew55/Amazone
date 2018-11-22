package controller;

import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdminDashboard;
import model.DashboardProduct;

/**
 * Servlet implementation class AdminDashboardServlet
 */
@WebServlet("/AdminDashboardServlet")
public class AdminDashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminDashboardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @return 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AdminDashboard adminDash = new AdminDashboard();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//int totalProduct = AdminDashboard.instance.getTotalProduct();
		int totalProduct = adminDash.getTotalProduct();
		request.setAttribute("ProductTotal", totalProduct );
		
		//Get Total Product less than 3
		int totalProductLess = adminDash.getProductLessThan3();
		request.setAttribute("ProductTotalLessThan3", totalProductLess );
		
		// Get 7 recent Products
		ArrayList<DashboardProduct> getListProduct = adminDash.getListofFewProduct();
		request.setAttribute("ProductList", getListProduct );
		request.getRequestDispatcher("adminmanagement.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
