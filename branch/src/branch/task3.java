package branch;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		System.out.println(" ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num < 0) {System.out.println("入力された数字は負の数です");}
		else if(num > 0) {System.out.println("入力された数は正の数です");}
		else {System.out.println("入力された数は0です");}

		sc.close();
		}
}
