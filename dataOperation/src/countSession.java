

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/countSession")
/**
 * Servlet implementation class countSession
 */
public class countSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession(false);
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>訪問回数テスト(セッション)</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("訪問回数テスト(セッション)");
		if(session == null) {
			out.println("初めての訪問です");
			session = request.getSession(true);
			String visitedStr = (String) session.getAttribute("visited");
			session.setAttribute("visited", "1");
		}else if(session != null) {
			String visitedStr = (String) session.getAttribute("visited");
			int visited = Integer.parseInt(visitedStr);
			visited++;
			out.println("<p>訪問回数は");
			out.println(visited);
			out.println("回目です</p>");
			session.setAttribute("visited", Integer.toString(visited));


		}

		// out.println("<a href=¥"/session/sessiontest¥">再表示</a




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
