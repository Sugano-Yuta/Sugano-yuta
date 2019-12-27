package loop;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("数字を入力して下さい:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;

		//System.out.println("数字を入力して下さい:"+num);

		for(int i = 1;i <= num; i++) {
			System.out.print(i + "+");
			sum += i;
		}
		System.out.print("=" + sum);
		sc.close();

	}
}
