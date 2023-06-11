package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Patient;
import com.service.PatientService;
import com.service.PatientServiceImpl;

/**
 * Servlet implementation class RegistrationFormServlet
 */
@WebServlet("/RegistrationFormServlet")
public class RegistrationFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("RegistrationForm.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fn = request.getParameter("fname");
		String ln = request.getParameter("lname");
		String em = request.getParameter("email");
		String pn = request.getParameter("phone");
		String DOB = request.getParameter("date_of_birth");
		String gen= request.getParameter("gender");
		String add= request.getParameter("address");
		String marital = request.getParameter("marital_status");
		String med =request.getParameter("medical_history");
		String detail = request.getParameter("details");
		
		//save user in database
		Patient u = new Patient();
		u.setFname(fn);
		u.setLname(ln);
		u.setEmail(em);
		u.setPhone(pn);
		u.setDate_of_birth(DOB);
		u.setGender(gen);
		u.setAddress(add);
		u.setMarital_status(marital);
		u.setMedical_history(med);
		u.setDetails(detail);
		
		PatientService us = new PatientServiceImpl();
		us.Register(u);
		request.getRequestDispatcher("RegistrationForm.jsp").forward(request, response);
	}

}
