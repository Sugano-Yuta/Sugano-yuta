package method;

public class task5 {

	public static void main(String[] args) {



		String array [] = {"a","b","c"};
		nullcheck(array);
		//	List<String> L1 = Arrays.asList(array1);
		String array2 [] = {"a",null,"c"};
		nullcheck(array2);


	}

	private static void nullcheck(String array[]) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 0; i < array.length; i++) {
			if(array[i] != null) {
				System.out.println(false);
			}else if(array[i] == null){
				System.out.println(true);
			}

		}
	}

}

