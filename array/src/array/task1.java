package array;

public class task1 {

	public static void main(String[] args) {

		int[] array = {4,9,19,5,8,21,42,64,73,18,2};
		int sum = 0;
		System.out.print("配列:[");

		for(int i = 0; i <= array.length; i++) {
			if(i < array.length -1) {
				System.out.print(array[i] + ",");
			}if(i == array.length -1) {
				System.out.println(array[i] + "]");
			}
		}

		for(int i : array) {
			sum += i;
	}//合計を求めるための拡張for文。15行目からのが拡張for、完全に通常のforとごちゃごちゃしてた.
		System.out.println("合計" + sum);
	}
}
