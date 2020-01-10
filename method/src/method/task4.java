package method;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		overload(sc.nextInt() , sc.nextInt());
		overload(sc.next() , sc.next());
		overload(sc.nextFloat() , sc.nextFloat());
		sc.close();
	}
	public static int overload(int a , int b) {
		int sum = a + b;
		System.out.println("数字だけの場合");
		System.out.println(sum);
		return sum;
		}
	public static String overload(String a , String b) {
		String c = a + b;
		System.out.println("文字列だけの場合");
		System.out.println(c);
		return c;
	}
	public static float overload(float a , float b) {
		float c = a + b;
		System.out.println("小数の場合");
		System.out.println(c);
		return c;
	}
}


