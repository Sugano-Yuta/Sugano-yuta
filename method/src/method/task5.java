package method;

import java.util.Arrays;
import java.util.List;

public class task5 {

	public static void main(String[] args) {

		String array1 [] = {"a","b","c"};
		List<String> L1 = Arrays.asList(array1);
		String array2 [] = {"a",null,"c"};
		List<String> L2 = Arrays.asList(array2);
		if(L1.contains(null)) {
			System.out.println(true);
		}else System.out.println(false);
	if(L2.contains(null)) {
		System.out.println(true);
	}else System.out.println(false);

}
	}
