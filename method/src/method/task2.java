package method;

import java.util.Calendar;

public class task2 {

	public static void main(String[] args) {
		task2("菅野優太",175.0,23,1996,8,1);
		Calendar cal = Calendar.getInstance();
		cal.set(1996,8,1);
	}

	public static void task2(String name , double taller , int age , int year , int month , int day) {
		System.out.println("私の名前は" + name + "です。");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + taller +"cmです。");
		System.out.println("よろしくお願いします。");
	}
}

