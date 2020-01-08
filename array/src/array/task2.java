package array;

public class task2 {

	public static void main(String[] args) {

		int[] array = {1,2,3,4,5,6,7};
		for(int i = 6; i < array.length; i-- ) {
			if(i > 0) {
				 System.out.print(array[i] + ",");
			}else if(i == 0) {
				System.out.println(array[i]);
			}
		}
		for(int i = 0; i < array.length; i++) {
			if(i < 6) {
				System.out.print(array[i] + ",");
			}else if(i == 6) {
				
				System.out.print(array[i]);
				}
		}
	}
}
