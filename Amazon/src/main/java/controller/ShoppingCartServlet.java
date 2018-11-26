package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import agile.TeamA.ShoppingCart.Service.Impl.ShoppingCart_Service;
import agile.TeamA.Vo.ShoppingCart_Vo;

/**
 * Servlet implementation class ShoppingCartServlet
 */
@WebServlet("/ShoppingCartServlet")
public class ShoppingCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShoppingCartServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("get  Served at: ").append(request.getContextPath());
		String type = request.getParameter("type");
		if("mycart".equals(type)) {
			String Customer_id = request.getParameter("Customer_id");
			ShoppingCart_Service carts = new ShoppingCart_Service();
			ArrayList<ShoppingCart_Vo> Cart = carts.getCart(Integer.parseInt(Customer_id));
			request.setAttribute("Cart", Cart);
			request.setAttribute("Customer_id", Customer_id);
			request.getRequestDispatcher("/ShoppingCart.jsp").forward(request, response);
		}

		if ("addcart".equals(type)) {
			int product_id = Integer.parseInt(request.getParameter("ids"));
			int CustomerID = Integer.parseInt(request.getParameter("cid"));
			ShoppingCart_Service carts = new ShoppingCart_Service();
			ArrayList<ShoppingCart_Vo> CustomerCart = carts.getProduct_Information(product_id);
			
			boolean bl=carts.addCustomerCart(CustomerCart, CustomerID);
			if (bl) {
	/*		String message = String.format(
					"add item successful!!Automatically jump to the dashboard page for you after 3 seconds!!!!"
							+ "<meta http-equiv='refresh' content='3;url=%s'/>",
					request.getContextPath() + "/ShoppingCartServlet?customerid="+CustomerID+"&&type=getcartAu");
			request.setAttribute("message", message);*/
			request.getRequestDispatcher("/Search.jsp").forward(request, response);
			}else {
				request.setAttribute("error", "failed to add goods!Automatically jump to main page!!! ");
				request.getRequestDispatcher("Home.jsp").forward(request, response);
				
			}
		}
		
		if ("getselectitems".equals(type)) {
			String ids = request.getParameter("ids");			
			String id = request.getParameter("cid");
			int Customer_id = Integer.parseInt(id);
			// ArrayList<ShoppingCart_Vo> userhistList=(ArrayList<ShoppingCart_Vo>)
			// request.getAttribute("userhistList");
			ShoppingCart_Service carts = new ShoppingCart_Service();
			carts.updateCustomer_Cart(ids, Customer_id, "buy");
			request.getRequestDispatcher("/Search.jsp").forward(request, response);
		}
		if ("del".equals(type)) {
			String ids = request.getParameter("ids");
			// ArrayList<ShoppingCart_Vo> userhistList=(ArrayList<ShoppingCart_Vo>)
			// request.getAttribute("userhistList");
			String id = request.getParameter("cid");
			int Customer_id = Integer.parseInt(id);
			ShoppingCart_Service carts = new ShoppingCart_Service();
			carts.updateCustomer_Cart(ids, Customer_id, "delete");
			request.getRequestDispatcher("/Search.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String type = request.getParameter("type");
	
	}

}
