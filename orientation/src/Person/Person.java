package Person;

public class Person{

	private String name;
	private int age;
	public static int wallet;
	//コンストラクタの生成
	public Person() {}
	//コンストラクタを引数ありで生成
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public Person(int wallet) {
		this.wallet += wallet;
		System.out.println(Person.wallet);
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void myProfile(){
		System.out.println("私の名前は" + this.name + "です。");
		System.out.print("私の年齢は" + this.age + "です。");
		System.out.print("よろしくお願いします。");
	}
}

