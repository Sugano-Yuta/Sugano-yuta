import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

	public static void main(String[] args) {
		Connection con = null;
		try {
			//JDBCドライバーの読み込み(mysql)
			Class.forName("com.mysql.cj.jdbc.Driver");
			//データベースへの接続(jdbc:データベースの種類://接続先:ポート番号/データベース名,アカウント名,パスワード)
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/task1","root","");

			System.out.println("DB接続に成功しました");

		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(con != null) {
				try{
					con.close();
				}catch(SQLException e){
					e.printStackTrace();

				}
			}

		}
	}
}
