package branch;

import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		System.out.println("病院に行く曜日を入力してください\n"
				+ "【月曜、火曜、水曜、木曜、金曜、土曜、日曜】");
		
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		
		if(str.equals("月曜")) {
			System.out.println("午前診療と午後診療があります");
		}
		else if(str.equals("火曜")) {
			System.out.println("午前診療と午後診療があります");
		}
		else if(str.equals("水曜")) {
			System.out.println("午前診療と午後診療があります");
			}
		else if(str.equals("木曜")) {
			System.out.println("午前診療と午後診療があります");
		}
		else if(str.equals("金曜")) {
			System.out.println("午前診療と午後診療があります");
		}
		else if(str.equals("土曜")) {
			System.out.println("午前診療のみです");
		}
		else if(str.equals("日曜")) {
			System.out.println("休診です");
		}
		else {
			System.out.println("入力を確認してください");
		}
		
		sc.close();
		
				}
	}


