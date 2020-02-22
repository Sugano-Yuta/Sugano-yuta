package array;

import java.util.Arrays;

public class task2 {

	public static void main(String[] args) {
		
		int [] array = new int[7];
		//System.out.println(array.length);(要素数確認で使用)
		for(int num = 0; array.length > num ; num++) {
			if( num < array.length) {
				array[num] = array.length - num;
			}else if(num == array.length) {
				array[num] = array.length - num;
			}
		}
		System.out.println(Arrays.toString(array));
		
		
		for(int i = 0; i < array.length; i++) {
			if( i < array.length) {
				array[i] = i + 1;
			}else if(i == array.length){
				array[i] = i;
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
