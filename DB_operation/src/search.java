
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class search
 */
@WebServlet("/Search")
public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public search() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String age = request.getParameter("age");


		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>内容をemployeeテーブルから検索</title>");
		out.println("</head>");
		out.println("<body>");

		Connection con = null;
		try {
			//JDBCドライバの読み込み（MySQL）
			Class.forName("com.mysql.jdbc.Driver");

			//データベースの接続
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1", "root", "");

			//SQL文の実行、？に条件指定
			String sql = "select * from employee where name like ?";
			//SELECT * FROM テーブル名 WHERE カラム名 LIKE パターン;

			PreparedStatement ps = con.prepareStatement(sql);


			ps.setString(1,"%" + name + "%");
			out.println("検索結果");
			out.println("<br>");


			//SQL文結果取得
			ResultSet rs = ps.executeQuery();
			//		out.println(rs);

			while (rs.next()) {
				out.println("ID:" + rs.getInt("id"));
				out.println("<br>");
				out.println("名前:" + rs.getString("name"));
				out.println("<br>");
				out.println("生年月日" + rs.getDate("birthday"));
				out.println("<br>");
				out.println("年齢:" + rs.getInt("age"));

			}

			//使用が終わったら切断
			ps.close();

		}catch(SQLException e) {
			//DB接続やSQL処理の失敗時の処理
			e.printStackTrace();
			System.out.println("DB接続やSQL処理の失敗");

		}catch(ClassNotFoundException e) {
			//JDBCドライバが見つからない時の処理
			e.printStackTrace();
			System.out.println("JDBCドライバが見つからない");

		}finally {
			//データベース切断
			if(con != null){
				try {
					con.close();
					System.out.println("データベース切断成功");

				}catch(SQLException e) {
					//DB切断失敗時処理
					e.printStackTrace();
					System.out.println("データベース切断失敗");
				}
			}
		}
		out.println("</body>");
		out.println("</html>");
	}
}


