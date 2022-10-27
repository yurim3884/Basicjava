package chapter06;

public class PersonExample1 {
	public static void main(String[] args) {
		Person1 p1=new Person1("12345-1234567","홍길동");
		
//		Person1 p1 =new Person1(); 
////		p1.ssn="123456-1234567";
//		p1.name="홍길동";
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation="usa";
//		p1.ssn="654321-7654321";
		p1.name="홍삼원";
	}

}
