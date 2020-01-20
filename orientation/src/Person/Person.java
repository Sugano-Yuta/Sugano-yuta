package Person;

class Person {

	String name;
	int age;
	static int wallet;

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
	public Person(int A) {
		wallet += A;
		System.out.println(Person.wallet );
	}
	public Person() {
	}
	public void myprofile(){
		System.out.println("私の名前は" + this.name + "です。");
		System.out.print("私の年齢は" + this.age + "です。");
		System.out.print("よろしくお願いします。");
	}
}

