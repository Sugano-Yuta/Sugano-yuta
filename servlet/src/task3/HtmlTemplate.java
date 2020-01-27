package task3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HtmlTemplate
 */
public class HtmlTemplate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("").append(request.getContextPath());
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		HtmlTemplate.header(out);
		out.println("<p>↓占い↓</p>");
		String [] Uranai = {"大吉","中吉","小吉","末吉","凶","大凶"};
		Random r = new Random();
		String result = Uranai[r.nextInt(5)];
		out.println(result);
		HtmlTemplate.footer(out);
	}
	private static void footer(PrintWriter out) {
		// TODO 自動生成されたメソッド・スタブ
		out.println("<!DOCTYPE = html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'UTF-8'>");
		out.println("<title>Servlet Kadai</title>");
		out.println("</head>");
		out.println("<body>");

	}
	private static void header(PrintWriter out) {
		// TODO 自動生成されたメソッド・スタブ
		out.println("</body>");
		out.println("</html>");

	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

