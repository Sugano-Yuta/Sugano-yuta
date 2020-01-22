package calc;

import java.util.Scanner;


public class task3 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int numA = sc.nextInt();
		int numB = sc.nextInt();
		int numC = num + numA + numB;
		int numD = (num + numA + numB) / 3;
		double numE = (num + numA + numB) / 3.0;
		System.out.println("合計" + numC);
		System.out.println("平均(3で割った時):"+ numD );
		System.out.println("平均(3.0で割った時):"+ numE);
		sc.close();
	}
}