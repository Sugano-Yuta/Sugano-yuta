package orientation;

public class Dog extends Animal{

	public static void main(String[] args) {

		Animal Animal = new Animal();
		Animal.name = "ポチ";
		Animal.age = 5;
		Animal.weight = 12.3;

		System.out.println("名前:" + Animal.name);
		System.out.println("年齢:" +Animal.age +"歳");
		System.out.println("体重:" + Animal.weight + "Kg");

		run(name);
		sleep();
		{
		System.out.println(Animal.name + "は眠った");
		}
	}
}