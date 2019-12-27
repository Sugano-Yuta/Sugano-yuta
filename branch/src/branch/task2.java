package branch;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		System.out.println("数字を入力してください");
		int num = sc.nextInt();
		String str = String.format("%02d",num);
		if(num < 10) System.out.println(str);
		if(num >= 10) System.out.println(num);

		sc.close();


	}

}
