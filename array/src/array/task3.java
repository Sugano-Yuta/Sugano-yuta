package array;

import java.util.Random;

public class task3 {

	public static void main(String[] args) {
		System.out.println("[");
		Random r = new Random();
		int array [] = new int [6]; 
		int max = array[0];
		int min = array[0];
		for(int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(10);
		}
		for(int i= 0; i <= array.length ; i++) {
			if(i != array.length) {
				System.out.print(array[i] + ",");
				if(i == array.length){
					System.out.println(array[i] + "]");
				}
			}
			if(min < array[i]) {
				min = array[i];
			}
			if(max > array[i]) {
				max = array[i];
			}
		}
		System.out.println("最大値" + max);
		System.out.println("最小値" + min);
	}
	
}