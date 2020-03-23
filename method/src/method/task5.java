package method;

import java.util.Objects;

public class task5 {

	public static void main(String[] args) {



		String array [] = {"a","b","c"};
		nullcheck(array);
		boolean result = nullcheck(array);
		String str1 = String.valueOf(result);
		System.out.println(str1);
		String array2 [] = {"a",null,"c"};
		nullcheck(array2);
		boolean result2 = nullcheck(array2);
		String str2 = String.valueOf(result2);
		System.out.println(str2);


	}

	private static boolean nullcheck(String array[]) {
		// TODO 自動生成されたメソッド・スタブ
		boolean result = false ;
		for(int i = 0; i < array.length; i++) {
			if(Objects.equals(array[i],null)) {
				result = true;
			}
		}
		return result;
	}
}

