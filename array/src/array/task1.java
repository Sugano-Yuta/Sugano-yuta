package array;

public class task1 {

	public static void main(String[] args) {

		int[] array = {4,9,19,5,8,21,42,64,73,18,2};
		int sum = 0;
		System.out.print("配列:[");
		for(int i = 0; i < array.length; i++) {
			if(i <= 9) {
					System.out.print(array[i] + ",");
			}else if (i == 10) {
					System.out.println(array[10] + "]");
			}
				sum += array[i];
		}
		System.out.print(sum);
	}
}
