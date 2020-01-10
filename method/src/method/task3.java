package method;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		task3(sc.nextInt() ,  sc.nextInt());
		sc.close();
	}
	private static int task3(int base , int height ) {
		int area = base * height / 2;
		System.out.println("三角形の面積");
		System.out.println(area);
		return area;
	}
}