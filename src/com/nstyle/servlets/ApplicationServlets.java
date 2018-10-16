package com.nstyle.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.nstyle.models.AppointmentModels;
import com.nstyle.utils.AppointmentUtils;

/**
 * Servlet implementation class ApplicationServlets
 */
public class ApplicationServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	private AppointmentUtils appointmentUtils = null;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ApplicationServlets() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" INSIDE SERVLET ");
		appointmentUtils = new AppointmentUtils();
		List<AppointmentModels> appointments = appointmentUtils.getValue();
		ObjectMapper mapper = new ObjectMapper();
		String respMess = mapper.writeValueAsString(appointments);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(respMess);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
