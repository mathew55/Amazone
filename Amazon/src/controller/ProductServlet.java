package controller;

import model.Product;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDAO;
import model.Product;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("pid");
		int pid = Integer.parseInt(id);

		Product product = ProductDAO.instance.checkFirstName(pid);
		if(product.flag==0) {
			request.setAttribute("product_Id",product.product_ID);
			request.setAttribute("product_Name", product.product_Name);
			request.setAttribute("product_Manufacturer", product.product_Manufacturer);
			request.setAttribute("product_Price", product.product_Price);
			request.setAttribute("product_Quantity", product.product_Quantity);
			request.getRequestDispatcher("product_info.jsp").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("product_notfound.jsp").forward(request, response);
		}
	}

}
