

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CountCookie
 */
public class CountCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset = UTF-8");

		PrintWriter out = response.getWriter();


		out.println("<!DOCTYPE = html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'UTF-8'>");
		out.println("<title>CountCookie</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>訪問回数テスト(クッキー)</h1>");

		Cookie [] cookie = request.getCookies();
		Cookie visitedCookie = null;
		if(cookie != null) {
			for(int i = 0; i < cookie.length; i++) {
				if(cookie[i].getName().equals("visited")) {
					visitedCookie = cookie[i];
				}
			}
		}
		if(visitedCookie != null) {
			int visited = Integer.parseInt(visitedCookie.getValue()) +1;

			out.print(visited);
			out.println("回目の訪問です。");
			visitedCookie.setValue(Integer.toString(visited));
			visitedCookie.setMaxAge(300);
			response.addCookie(visitedCookie);
		}else {
			out.println("<p>初回の訪問です。</p>");

			Cookie newCookie = new Cookie("visited", "1");
			response.addCookie(newCookie);			
		}
		out.println("<br>");
		out.println("<a href = http://localhost:8080/dataOperation/CountCookie>画面を再訪問</a>");

	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
