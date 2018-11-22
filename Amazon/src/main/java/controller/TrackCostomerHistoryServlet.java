package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CustomerHist.Service.Imp.CustomerHist_Imp;
import model.CustomerHist;

/**
 * Servlet implementation class TrackCostomerHistoryServlet
 */
@WebServlet("/TrackCostomerHistoryServlet")
public class TrackCostomerHistoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TrackCostomerHistoryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CustomerHist_Imp chip=new CustomerHist_Imp();
		ArrayList<CustomerHist> CustomerHistlist=chip.getcustomerhist();
		request.setAttribute("CustomerHistlist",CustomerHistlist);
		System.out.println("This is from the servlet" + CustomerHistlist);
		request.setAttribute("CustomerHistlist", CustomerHistlist);
		request.getRequestDispatcher("CustomerHist.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
