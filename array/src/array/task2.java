package array;

public class task2 {

	public static void main(String[] args) {

		int [] array = new int[8];
		for(int i = array.length -1 ; i > 0; i-- ) {
			array[i] = i;
			}
		for(int i = array.length -1 ; i > 0; i--) {
			if(i > 1) {
				System.out.print(array[i] + ",");
			}else if(i == 1) {
				System.out.println(array[i]);
			}

		}
		for(int i = 1; i < array.length ; i++) {
			if(i < array.length-1) {
				System.out.print(array[i] + ",");
			}else if(i < array.length) {
				System.out.println(array[i]);
			}
		}
	}
}
