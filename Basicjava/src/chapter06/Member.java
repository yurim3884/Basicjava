package chapter06;

public class Member {

	String name;
	String id;
	String password;
	int age;
	
//	- 자동으로 만들어짐
	public Member() {
		//개수나 타입을 다르게 제작해야한다
		// TODO Auto-generated constructor stub
	}
	
	public Member(String name) {this.name = name;
		// TODO Auto-generated constructor stub
	}
//  호출되는 것 :public Member() ! public class Member
	
//	public  Member(String n, int a,String p, String i) {
//		name = n; age=a; password=p; id=i;
//	}
	//코드 구별 더 쉽게
	 //생산자를 오버로딩을 정의한다
	public  Member(String name,String password, String id,int age) {
		this.name = name; this.age=age; this.password=password; this.id=id;
	}
	//현재 메모리 상에 있는 객체(인스턴스)를 this
	//MemberExample 에서 생성된 Member의 주소 값 
	
	//매개변수 String name, int age
	public Member(String name, int age) {
		//문자 타입은 n 숫자로 들어가면 a로 들어간다
		
//		//외부에서 호출
//		new Member("홀길동",30);
//		//홍길동 = n 30은 a로 들어간다
		
		
		this.name = name;
		this.age=age;
		System.out.println(this);
		
		
	}

}
