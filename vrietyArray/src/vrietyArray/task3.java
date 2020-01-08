package vrietyArray;

import java.util.HashMap;

public class task3 {

	public static void main(String[] args) {
		
		HashMap<String,Integer> fruits = new HashMap<>();
		fruits.put("りんご", 130);
		fruits.put("メロン", 6000);
		fruits.put("みかん", 120);
		fruits.put("バナナ", 98);
		for(HashMap.Entry <String,Integer> pandf:fruits.entrySet()) {
			System.out.print(pandf.getKey());
			System.out.print(",");
			System.out.print(pandf.getValue());
			System.out.println("円");
		}
	}
}
