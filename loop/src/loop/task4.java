package loop;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc=new Scanner(System.in);
		System.out.print("正の整数を入力してください:");
		int num=sc.nextInt();
		System.out.print(num+"の約数:");
		for(int i=1; i<=num; i++) {

			if (num==i) 	System.out.print(i);
			else if(num%i==0)	System.out.print(i+",");
		}

		sc.close();
	}

}
