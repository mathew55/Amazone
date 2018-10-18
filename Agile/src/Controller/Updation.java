package Controller;
import DAO.NameDAO;
import DAO.NameDAO.Product;
import DAO.UpdationDAO;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Name;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/Updation")
public class Updation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Updation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	
		
		int qty = Integer.parseInt(request.getParameter("qty"));
		int pid = Integer.parseInt(request.getParameter("pid"));
		int flag = UpdationDAO.instance.UpdateDB(qty,pid);
		if(flag==1)
			request.getRequestDispatcher("UpdationSuccess.jsp").forward(request, response);
		else
			request.getRequestDispatcher("UpdationFailure.jsp").forward(request, response);
	}

}
