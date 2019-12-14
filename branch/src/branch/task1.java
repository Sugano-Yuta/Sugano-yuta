package branch;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc=new Scanner(System.in);
		
		System.out.println("10以上の数字を入力してください");
		int num=sc.nextInt();
		if(num<10) System.out.println(num*10);
		if(num>=10) System.out.println(num);
	
		sc.close();
		
	}

}
