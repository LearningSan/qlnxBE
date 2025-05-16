package Servlet;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import Dao.GheNgoiDao;
import domain.GheNgoiDTO;

/**
 * Servlet implementation class DanhSachGhe
 */
@WebServlet({ "/DanhSachGhe", "/layghe" })
public class DanhSachGhe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachGhe() {
        super();
        // TODO Auto-generated constructor stub
    }	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

        String diemdi = request.getParameter("diemdi");
        String diemden = request.getParameter("diemden");
        String ngaydiStr = request.getParameter("ngaydi");

        Date ngaydi = java.sql.Date.valueOf(ngaydiStr); // yyyy-MM-dd

        GheNgoiDao dao = new GheNgoiDao();
        List<GheNgoiDTO> dsGhe = dao.getGheNgoiTheoHanhTrinh(diemdi, diemden, ngaydi);

        Gson gson = new Gson();
        String json = gson.toJson(dsGhe);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
