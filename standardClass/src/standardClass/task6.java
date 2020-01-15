package standardClass;

import java.util.Calendar;

public class task6 {

	public static void main(String[] args) {
	Calendar now = Calendar.getInstance();
	System.out.print(now.get(Calendar.YEAR) + "年");
	System.out.print(now.get(Calendar.MONTH) + "月");
	System.out.println(now.get(Calendar.DAY_OF_MONTH) + "日");
	
	System.out.print(now.get(Calendar.YEAR) + "年");
	System.out.print(now.get(Calendar.MONTH) + "月");
	System.out.print(now.get(Calendar.DAY_OF_MONTH) + "日");
	System.out.print(now.get(Calendar.HOUR_OF_DAY) + "時");
	System.out.print(now.get(Calendar.MINUTE) + "分");
	}

}
