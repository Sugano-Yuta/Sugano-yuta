package instance;

public class task3 {

	public static void main(String[] args) {

		// インスタンス生成
		Person sugano = new Person();

		// name, ageに値を入れる
		sugano.name = "菅野優太";
		sugano.age = 23;

		// myPrifileを呼び出す
		sugano.myProfile();
	}
}
