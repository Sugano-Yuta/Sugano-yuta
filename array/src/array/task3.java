package array;

import java.util.Random;

public class task3 {

	public static void main(String[] args) {
		System.out.print("[");
		Random r = new Random();
		int array [] = new int [6];
		int max = array[0];
		int min = array[0];
		for(int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(10);
		}
		for(int i= 0; i < array.length ; i++) {
			if(i < array.length -1) {
				System.out.print(array[i] + ",");
			}if(i == array.length -1) {
				System.out.println(array[i] + "]");
			}
		}
		for(int i = 0; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}else if(max < array[i]) {
				max = array[i];
			}
		}

		//System.out.println(Arrays.toString(array));    配列中身確認用
		System.out.println("最大値:" + max);
		System.out.println("最小値:" + min);
	}

}