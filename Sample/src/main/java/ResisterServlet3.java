

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register3")
public class ResisterServlet3 extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String age = req.getParameter("age");
		if(age != null && age.equals("child")) {
			age = "18歳以下";
		} else {
			age = "18歳以上";
		}
		req.setAttribute("age", age);
	
		String langs = "";
		String[] lang = req.getParameterValues("lang");
		if (lang != null) {
		for(int i = 0; i < lang.length; i++) {
			langs = langs + lang[i] + "　";
		}
		}
		req.setAttribute("langs", langs);
		
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/register3.jsp");
		rd.forward(req, res);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}
}
