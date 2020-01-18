package method;

import java.util.Arrays;

public class task5 {

	public static void main(String[] args) {
		String [] array = {"null","nell","nill","nall","noll"};
		task5(array);
}

	private static void task5(String[] array) {
		if(Arrays.asList(array).contains("null")) {
			System.out.println("true");
			}else {
				System.out.println("false");
			}
		
	
	}
}