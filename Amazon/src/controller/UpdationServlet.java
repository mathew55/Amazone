package controller;

import dao.ProductDAO;
import model.Product;
import dao.UpdationDAO;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Product;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/UpdationServlet")
public class UpdationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int qty = Integer.parseInt(request.getParameter("qty"));
		int pid = Product.getpid();
		int qty_available = Product.getquantityavailable();
		if (qty_available >= qty) {
			qty = qty_available - qty;
			int flag = UpdationDAO.instance.UpdateDB(qty, pid);
			if (flag == 1)
				request.getRequestDispatcher("UpdationSuccess.jsp").forward(request, response);
			else
				request.getRequestDispatcher("UpdationFailure.jsp").forward(request, response);
		} else
		{
			request.setAttribute("product_Id",pid);
			request.setAttribute("product_qty", qty);
			request.getRequestDispatcher("NegativeQuantity.jsp").forward(request, response);
		}
	}

}
