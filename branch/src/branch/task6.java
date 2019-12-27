package branch;

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		System.out.println("1から5までの数字を入力してください");
		int num = sc.nextInt();
		String str = "";

		switch(num) {
		case 1:
			str = "I";
			break;
		case 2:
			str="II";
			break;
		case 3:
			str="III";
			break;
		case 4:
			str="VI";
			break;
		case 5:
			str="V";
			break;
		default:
			str="unknown";
		}
		System.out.println(num + "→" + str);

		sc.close();
		}
}
