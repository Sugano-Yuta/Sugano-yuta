package calc;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc=new Scanner(System.in);
		String str1="ノートPCの値段:";
		String str2="89800円";
		String str3=str1.concat(str2);
		System.out.println(str3);
		
		String str=sc.nextLine();
		String strA=sc.nextLine();
		String strB=str.concat(strA);
		System.out.println(strB);
		
		sc.close();
		
		
	}

}
