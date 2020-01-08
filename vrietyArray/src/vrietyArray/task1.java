package vrietyArray;

import java.util.ArrayList;

public class task1 {

	public static void main(String[] args) {
		
		ArrayList <String> provincial = new ArrayList<>();
		provincial.add("北海道");
		provincial.add("東北");
		provincial.add("関東");
		provincial.add("中部");
		provincial.add("近畿");
		provincial.add("中国");
		provincial.add("九州");
		
		for(String lan : provincial) {
			System.out.println(lan);
		}
	}
}
