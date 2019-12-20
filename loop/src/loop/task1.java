package loop;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		int sum=0;
		
		
		for(int i=1;i<=num;i++){
		
		sum +=i;
		}
		
System.out.println("数字を入れて下さい:"+num);
System.out.println("1から"+num+"までの合計:"+sum);


		sc.close();


	}

}
