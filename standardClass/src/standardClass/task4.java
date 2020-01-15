package standardClass;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "ABCDGOPQRYZ";
		String str2 = sc.next();
		if(str.contains(str2)) {
			System.out.println(str + "は" + str2 + "を含む");
		}else {System.out.println(str + "は" + str2 + "を含まない" );
			
		}sc.close();

	}

}
