package orientation;

public class Dog extends Animal{
	double weight;

	public Dog() {

	}
	public Dog (String name,int age,double weight) {
		this.weight = weight;
		this.name = name;
		this.age = age;
		System.out.println("体重:" + this.weight + "kg" );
		System.out.println("名前:" + this.name);
		System.out.println("年齢:" + this.age  + "歳");

	}

	public void run() {
		System.out.println(name + "は走った");
	}

	public void sleep() {
		System.out.println(name + "は眠った");
	}
}