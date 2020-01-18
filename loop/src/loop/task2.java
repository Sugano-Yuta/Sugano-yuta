package loop;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		System.out.print("数字を入力して下さい:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;

		for(int i = 1;i <= num; i++) {
			if(i < num) {
				System.out.print(i + "+");
			}else if(i == num){
				System.out.print(i);
			}
			sum += i;
		}
		System.out.print("=" + sum);
		sc.close();

	}
}
