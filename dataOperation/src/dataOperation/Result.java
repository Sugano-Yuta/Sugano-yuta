package dataOperation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Result")
/**
 * Servlet implementation class Result
 */
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//doGet(request, response);
		//テキストボックス、チェックボックスの情報を取得
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String contactUs = request.getParameter("contactUs");
		String naiyou = request.getParameter("naiyou");
		String br = System.lineSeparator();//改行
		//出力
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE = html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'UTF-8'>");
		out.println("<title>dataOperation_Kadai</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("以下の内容でお問い合わせしました。回答をお待ちください。");
		out.println("<br>");
		out.println(name + "様");
		out.println("<br>");
		//性別の変数の変換
		String gender1 = "female";
		if(gender .equals(gender1)) {
			out.println("性別:女性");
		}else
			out.println("性別:男性");
		//お問い合わせ内容の変数の変換
		//out.println(gender); //  きちんと反映されているかの試験で使用
		out.println("<br>");
		String contactUs1 = "a";
		String contactUs2 = "b";
		out.print("お問い合わせ種類:");
		if(contactUs .equals(contactUs1)) {
			out.println("製品について<br>");
		}else if(contactUs .equals(contactUs2)) {
			out.println("不具合やクレーム<br>");
		}else
			out.println("アフターサポート<br>");
		out.println("お問い合わせ内容:" + naiyou);
		out.println(br);
		out.println("</body>");
		out.println("</html>");


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
