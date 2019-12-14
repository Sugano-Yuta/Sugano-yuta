package branch;

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		String str="";
		
		if(num==1) {
			str="I";
			//=で代入==で比較
		}
		else if(num==2) {
			str="II";
		}
		
		else if(num==3) {
			str="III";
		}
		else if(num==4) {
			str="VI";
		}
		else if(num==5){
			str="V";
		}
		else {
			str="unknown";
		}
		System.out.println(str);

		sc.close();
		
	}

}
