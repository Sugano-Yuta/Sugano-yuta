package standardClass;

public class task5 {

	public static void main(String[] args) {
		String str = "cat_mouse_mouse_cat_cat";
		String str1 = str.replace("_",",");	
		String[] str2 = str1.split(",");
		//System.out.println(Arrays.toString(str2));	配列がきちんと作られているかテストで表示したもの
		int countcat = 0;
		int countmouse = 0;
		for(int i = 0; i < str2.length; i++) {
			if(str2[i].equals("cat")) {
				countcat++;
			}else if(str2[i].equals("mouse")) {
				countmouse++;
			}
		}
		if(countmouse > countcat) {
			System.out.println("mouseの方が多い");
		}else if(countmouse < countcat) {
			System.out.println("catの方が多い");
		}
	}	
}
