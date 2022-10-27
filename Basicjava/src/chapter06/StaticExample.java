package chapter06;

public class StaticExample {
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "권나영";
		s1.no = "s304001";
		s1.checkoutTime = "18:00";
		s1.balance = 100000;
//		
//		System.out.println(s1.name);
//		System.out.println(s1.checkoutTime);
//		System.out.println(s1.book.title);

		Student s2 = new Student();
		s2.name = "김성준";
		s2.no = "s304002";
		s2.checkoutTime = "18:10";
		s1.balance = 110000;

//		System.out.println(s2.name);
//		System.out.println(s2.checkoutTime);
//		System.out.println(s2.book.title);

		Student s3 = new Student();
		s3.name = "김용익";
		s3.no = "s304003";
		s3.checkoutTime = "21:27";
		s1.balance = 120000;

//		System.out.println(s3.name);
//		System.out.println(s3.checkoutTime);
//		System.out.println(s3.book.title);
		s2.balance = 50000;

		System.out.println(s1.name);
//		System.out.println(s1.checkoutTime);
		System.out.println(Student.checkoutTime);
		System.out.println(s1.book.title);
		System.out.println(s2.name);
		System.out.println(Student.checkoutTime);
//		System.out.println(s2.checkoutTime);
		System.out.println(s2.book.title);
		System.out.println(s3.name);
		System.out.println(Student.checkoutTime);
//		System.out.println(s3.checkoutTime);
		System.out.println(s3.book.title);

		// checkoutTime static을 통해 정적 멤버로 만들었기때문에 모든 클래스가 하나의 값을 공유
		// static을 인스턴스 타입으로 선언이 되어 오류가 난다
		// static 클래스 이름을 쓰면 된다

//		System.out.println(s1.checkoutTime);  X
//		System.out.println(Student.checkoutTime);  O
	}

}
