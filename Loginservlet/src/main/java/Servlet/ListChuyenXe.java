package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ChuyenXeDao;
import domain.ChuyenXeDTO;

/**
 * Servlet implementation class ListChuyenXe
 */
@WebServlet("/ListChuyenXe")
public class ListChuyenXe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListChuyenXe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  String diemDi = request.getParameter("origin");
		    String diemDen = request.getParameter("destination");
		    String ngayDi = request.getParameter("date");

		    ChuyenXeDao dao = new ChuyenXeDao();
		    List<ChuyenXeDTO> danhSach = dao.getDanhSachChuyenXe(diemDi, diemDen, ngayDi);

		    // Set response type to JSON
		    response.setContentType("application/json");
		    response.setCharacterEncoding("UTF-8");

		    // Convert list to JSON using Gson
		    com.google.gson.Gson gson = new com.google.gson.Gson();
		    String json = gson.toJson(danhSach);
		    response.getWriter().write(json);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
