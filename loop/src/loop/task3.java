package loop;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("数字を入力してしてください");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;

		while(num > 0) {
			num /= 10;
			sum++;
		}
		System.out.println(sum);
		sc.close();
	}

}
