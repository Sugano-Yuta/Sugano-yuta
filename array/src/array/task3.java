package array;

import java.util.Random;

public class task3 {

	public static void main(String[] args) {
	
	System.out.print("[");
	Random random = new Random();
	int[] array = new int[6];
	int max = 0;
	int min = 9;
		for(int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10);
			if(i <= array.length-2) {
				System.out.print(array[i] + ",");
			}else if(i == array.length-1) {
				System.out.println(array[i] + "]");
			}if(max < array[i]) {
				max = array[i];
			}if(min > array[i]) {
				min = array[i];
			}
		}System.out.println("最大値:" + max);
		System.out.println("最小値:"+ min);		
	}
}
