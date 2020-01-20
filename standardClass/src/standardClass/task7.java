package standardClass;

import java.util.Calendar;

public class task7 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		//現在日時
		System.out.print("現在日時:");
		System.out.print(now.get(Calendar.YEAR) + "年");
		System.out.print(now.get(Calendar.MONTH) + 1 + "月");
		System.out.println(now.get(Calendar.DAY_OF_MONTH) + "日");
		//1週間後
		now.add(Calendar.DAY_OF_MONTH,7);
		System.out.print("1週間後:");
		System.out.print(now.get(Calendar.YEAR) + "年");
		System.out.print(now.get(Calendar.MONTH) + 1 + "月 ");
		System.out.println(now.get(Calendar.DAY_OF_MONTH) + "日");
		//1年後
		Calendar future = Calendar.getInstance();
		future.set(Calendar.YEAR,2021);
		System.out.print("1年後:");
		System.out.print(future.get(Calendar.YEAR) + "年");
		System.out.print(future.get(Calendar.MONTH) + 1 + "月");
		System.out.print(future.get(Calendar.DAY_OF_MONTH) + "日");
		int dayofweek = future.get(Calendar.DAY_OF_WEEK);
		switch(dayofweek){
		case 1 :System.out.print("(日曜日)");
		break;
		case 2:System.out.print("(月曜日)");
		break;
		case 3:System.out.print("(火曜日)");
		break;
		case 4:System.out.print("(水曜日)");
		break;
		case 5:System.out.print("(木曜日)");
		break;
		case 6:System.out.print("(金曜日)");
		break;
		case 7:System.out.print("(土曜日)");
		break;
		}
	}
}
