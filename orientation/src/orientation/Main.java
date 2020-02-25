package orientation;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Dog dog = new Dog("ポチ",5,12.3); //コンストラクタを呼び出し実行するためにnew ,()に引数を入れた
		Animal animal = new Animal();

		//animal = dog;
		dog.run();
		animal.sleep();
		dog.sleep();


	}
}
