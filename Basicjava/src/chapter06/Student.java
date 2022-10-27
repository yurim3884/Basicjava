package chapter06;

public class Student {
	String name;
	String no;
	Book book; // 인스턴스 멤버
	static String checkoutTime; // 정적 멤버
	long balance;

	public Student() {
		book = new Book();
		book.title = "혼공자바";
	}
}

class Book {
	String title;
}
