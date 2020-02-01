package orientation;

public class Animal {

	String name;
	int age;
	public Animal() {

	}
	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}

//	System.out.println("名前:" + this.name);
//	System.out.println("年齢:" + this.age + "歳");
	public void sleep() {
		System.out.println("眠った");
	}
	public void animalDate() {
		System.out.println("名前:" + this.name);
		System.out.println("年齢:" + this.age  + "歳");
	}
}