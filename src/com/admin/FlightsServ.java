package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FlightsServ
 * @param <>
 */
@WebServlet("/FlightsServ")
public class FlightsServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightsServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<com.admin.Flights>flightlist=FlightDB.getFlightList();
			request.setAttribute("flightlist", flightlist);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		 RequestDispatcher dispatcher=request.getRequestDispatcher("shoe-flights.jsp");
		 dispatcher.forward(request,  response);
	}

}
