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
 * Servlet implementation class UpdateEmployee
 */

@WebServlet("/UpdateEmployee")
public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateEmployee() {
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
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String name = request.getParameter("name");

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>employeeテーブルに更新</title>");
		out.println("</head>");
		out.println("<body>");
		Connection con = null;
		try {
			//JDBCドライバの読み込み（MySQL）
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("JDBCドライバの読み込み成功");

			//データベースの接続
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1", "root", "");
			System.out.println("データベースの接続成功");

			String sql = "update  employee SET name = ? where id = ?  ";
			//UPDATE テーブル名 SET カラム1の名前 = カラム1の値, カラム2の名前 = カラム2の値, …… WHERE 条件;

			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("SQL文実行成功");

			ps.setString(1, name);
			ps.setInt(2,Integer.parseInt(id));



			//使用が終わったら切断
			int num = ps.executeUpdate();
			System.out.println(num);
			ps.close();
			out.println("更新");
			System.out.println("切断");

		}catch(SQLException e) {
			//DB接続SQL処理の失敗時の処理
			e.printStackTrace();
			System.out.println("DB接続やSQL処理の失敗");


		}catch(ClassNotFoundException e) {
			//JDBCドライバが見つからない時の処理
			e.printStackTrace();
			System.out.println("JDBCドライバ見つからない");

		}finally {
			//データベース切断
			if(con != null){
				try {
					con.close();
					System.out.println("データベース切断成功");

				}catch(SQLException e) {
					//DB切断失敗時処理
					e.printStackTrace();
					System.out.println("データベースの切断失敗");
				}
			}
		}
		out.println("</body>");
		out.println("</html>");
	}
}


