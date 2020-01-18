package calc;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String str1 = "ノートPCの値段:";
		int num = 89800;
		String str2 = "円";
		System.out.println(str1 + num + str2);

		String str = sc.nextLine();
		String strA = sc.nextLine();
		String strB = str.concat(strA);
		System.out.println(strB);
		sc.close();

	}

}
