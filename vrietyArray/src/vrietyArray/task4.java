package vrietyArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task4 {

	public static void main(String[] args) {

		int [] array = new int [] {21,3,32,6,99,72,78,51,1,26,87,11,48,60,29,5,46,74,14,193,215,83};
		ArrayList <Integer> odd = new ArrayList<>();
		ArrayList <Integer> even = new ArrayList<>();
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				even.add(array[i]);			//偶数
			}else {
				odd.add(array[i]);			//奇数
			}

			Map<Integer,ArrayList<Integer>> map = new HashMap<>();
			map.put(1, odd);
			map.put(2, even);

		}
		System.out.println("奇数" + odd);
		System.out.println("偶数" + even);

	}
}
