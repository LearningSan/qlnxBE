package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.HanhTrinhDao;

import java.util.*;

/**
 * Servlet implementation class TimChuyenXe
 */
@WebServlet("/TimChuyenXe")
public class TimChuyenXe extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public TimChuyenXe() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set response content type to JSON
    	response.setContentType("application/json; charset=UTF-8");
    	response.setCharacterEncoding("UTF-8");
    	PrintWriter out = response.getWriter();

        try {
            // Get locations (origins and destinations) from the database using HanhTrinhDao
            Map<String, HashSet<String>> locations = HanhTrinhDao.getAllLocations();
            HashSet<String> origins = locations.get("origins");
            HashSet<String> destinations = locations.get("destinations");

            // Prepare JSON response format for origins
            StringBuilder originsStr = new StringBuilder();
            for (String origin : origins) {
                if (originsStr.length() > 0) {
                    originsStr.append(",");
                }
                originsStr.append("\"").append(origin).append("\"");
            }

            // Prepare JSON response format for destinations
            StringBuilder destinationsStr = new StringBuilder();
            for (String destination : destinations) {
                if (destinationsStr.length() > 0) {
                    destinationsStr.append(",");
                }
                destinationsStr.append("\"").append(destination).append("\"");
            }

            // Wrap both origins and destinations in a single JSON object
            String jsonResponse = "{" +
                                    "\"origins\":[" + originsStr.toString() + "]," +
                                    "\"destinations\":[" + destinationsStr.toString() + "]" +
                                    "}";

            // Send the JSON response back to the client
            out.print(jsonResponse);

        } catch (Exception e) {
            e.printStackTrace();
            out.print("{\"error\":\"Server error\"}");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
