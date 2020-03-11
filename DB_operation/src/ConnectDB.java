import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
			//SQL文の実行
			String sql = "SELECT name from employee where age = ?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt (1,29);
	//		ps.setInt (2,39);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
			//	String name = rs.getString("name");
				System.out.println("DB接続に成功しました");
			//	int id = rs.getInt("id");
			//	System.out.println("ID" + id);
			//	String birthday = rs.getString("birthday");
			//	System.out.println("誕生日:" + birthday);
			//	int age = rs.getInt("age");
			//	System.out.println("年齢" + age);
			}
			rs.close();
			ps.close();

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
