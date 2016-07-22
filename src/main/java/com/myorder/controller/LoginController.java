package com.myorder.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myorder.model.LoginUser;
import com.myorder.validate.ValidateUser;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = null;
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		System.out.println("USerID ------------------------------"+userid + " ==========password : "+password);
		LoginUser user = new LoginUser(userid, password);
		ValidateUser validUser = new ValidateUser(user);
		if(validUser.isValidUser())
		{
			//Proceed to homepage which provides the basic functionalities 
			//like Orders, ProfileUpdate
		}
		else
		{
			dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
			dispatcher.forward(request, response);
			//TODO - write toggle error codes in login.jsp - UI designing level
		}
		
	}

}
