package Servlet;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.KhachHangDao;

/**
 * Servlet implementation class Sign_up
 */
@WebServlet({ "/Sign_up" })
public class Sign_up extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private KhachHangDao dao=new KhachHangDao();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sign_up() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	  	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String phone = request.getParameter("phone");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");

        // Validate the registration input
        String error = dao.ValidateSign_up(phone, password, confirmPassword);

        if (error.isEmpty()) {
            // Proceed with the registration logic (insert into DB, etc.)
            response.sendRedirect("Login/sign_in.html"); // Redirect to login page or success page
        } else {
            // If there's an error, append the error to the URL as a query parameter
            response.sendRedirect("Login/sign_up.html?"+ error);
        }	}
	}


