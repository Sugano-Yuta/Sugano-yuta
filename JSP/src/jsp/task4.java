package jsp;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/task4")
/**
 * Servlet implementation class task4
 */

public class task4 extends HttpServlet {
	//private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		final String PATH = "/WEB-INF/HelloJSP/Fortune_result.jsp";
		//パス設定
		//占い結果の設定
		String [] array = {"大吉","中吉","小吉","末吉","凶","大凶"};
		Random r = new Random();
		String result = array[r.nextInt(array.length)];
		//日付の設定
		Date today = new Date();//現在日時の取得
		//変数の設定
		FortuneBean fb = new FortuneBean();  //インスタンス化
		fb.setFortune(result);
		fb.setToday(today);
		request.setAttribute("fortuneData", fb);
		//(自分でデータ名を決める,存在するデータ名を入れる),requsetも変数なのでdogetメソッドよりsetAttributeも下に置く;
		request.getRequestDispatcher(PATH).forward(request, response);
		//getRequestDispatcher

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//request.setAttribute();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}