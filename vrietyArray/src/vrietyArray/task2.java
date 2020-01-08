package vrietyArray;

import java.util.ArrayList;

public class task2 {

	public static void main(String[] args) {

		int array[] = {21,3,32,6,99,72,78,51,1,26,87,11,48,60};
		//奇数のArrayList
		ArrayList <Integer> odd = new ArrayList<>();
		//偶数のArrayList
		ArrayList <Integer> even = new ArrayList<>();
			for(int i = 0; i < array.length; i++) {
				if(array[i] % 2 <= 0) {
					even.add(array[i]);
				}else {
					odd.add(array[i]);
				}
			}
			/*for(int num : odd) {
				System.out.println(num);
				テストで奇数を抽出できたかの表示に使用したもの
			}*/
			/*for(int numn : even) {
				System.out.println(numn);
				テストで偶数を抽出できたかの表示に使用したもの*/
			System.out.println("奇数" + odd );
					
	}
}

