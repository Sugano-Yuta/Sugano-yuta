package orientation;

public class Animal {

	static String name;
	static int age;
	static double weight;

	public Animal() {
		//実行なしメソッド
	};
	public Animal(String name,int age, double weight) {
		Animal.name = name;
		Animal.age = age;
		Animal.weight = weight;
	}
	public static void sleep() {
		System.out.println("眠った");
	}
	public static void run(String name){
		System.out.println(Animal.name + "は走った");
	}
}
