package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.InputStream;

import dao.AddProductdao;
import model.AddProduct;

/**
 * Servlet implementation class AddProductServlet
 */
@WebServlet("/AddProductServlet")
@MultipartConfig(maxFileSize = 16177215) 

public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductServlet() {
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
		// TODO Auto-generated method stub
		//doGet(request, response);
		InputStream inputStream = null;
		
		String productName = request.getParameter("productName");
		String productDescription = request.getParameter("productManufacturer");
		String productPrice1 = request.getParameter("productPrice");
		double productPrice = Double.parseDouble(productPrice1);
		String productQuant = request.getParameter("productQuantity");
		int productQuantity = Integer.parseInt(productQuant);
		String productManufacturer = request.getParameter("productManufacturer");
		Part filePart = request.getPart("inputname");
		
		if (filePart != null) {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());
             
            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();
        }
		
		AddProduct product = new AddProduct(productName, productDescription, productPrice, productQuantity, productManufacturer, filePart);
		AddProductdao.instance.saveProduct(product);
		request.getRequestDispatcher("product.jsp").forward(request, response);
	}

}
