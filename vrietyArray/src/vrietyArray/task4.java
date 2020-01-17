package vrietyArray;

import java.util.ArrayList;
import java.util.HashMap;

public class task4 {

	public static void main(String[] args) {

		int [] array = new int [] {21,3,32,6,99,72,78,51,1,26,87,11,48,60,29,5,46,74,14,193,215,83};
		ArrayList <Integer> odd = new ArrayList<>();
		ArrayList <Integer> even = new ArrayList<>();
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				even.add(array[i]);
			}else {
				odd.add(array[i]);
			}
		}//System.out.println(odd);
		HashMap <Integer, Integer> oddHashMap = new HashMap<>();
		HashMap <Integer, Integer> evenHashMap = new HashMap<>();
		for(int i = 0; i < odd.size(); i++) {
			oddHashMap.put(i,odd.get(i));
		}
		for(int i = 0; i < even.size(); i++) {
			evenHashMap.put(i,even.get(i));
		}
		System.out.println("{偶数" + evenHashMap.values() + "}");
		System.out.println("{奇数" + oddHashMap.values() + "}");
	}
}
