
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public register() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//	response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");
		String age = request.getParameter("age");

		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>登録内容をemployeeテーブルに登録</title>");
		out.println("</head>");
		out.println("<body>");

		Connection con = null;
		try {		//JDBCドライバ読み込み
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/task1","root", "");
			System.out.println("JDBCドライバ読み込み成功");
			//	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1", "root", "");
			System.out.println("データベースの接続成功");

			//sql文実行
			String sql = "insert into employee(id, name,birthday,age) values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("SQL文実行成功");

			ps.setInt(1, Integer.parseInt(id));
			ps.setString(2,name);
			ps.setString(3,birthday);
			ps.setInt(4, Integer.parseInt(age));

			int num = ps.executeUpdate();
			System.out.println(num);
			System.out.println("SQL文の結果の取得成功");

			ps.close();
			System.out.println("切断");

		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("DB処理、あるいはSQL処理に失敗");

		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.println("JDBCドライバが見つからない");

		}finally {
			//DB切断
			if(con != null) {
				try {
					con.close();		//DB切断成功
				}catch(SQLException e) {
					e.printStackTrace();		//DB切断失敗
				}
			}
		}

	}

}
