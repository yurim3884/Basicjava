package chapter06;

public class MemberExample {
	public static void main(String[] args) {
		Member member = new Member(null, 0);

		member.name = "최하얀";
		member.age = 23;

		System.out.println(member.name);
		System.out.println(member.age);
		
	   Member member2=new Member("홍길동", 30);
		System.out.println(member2.name);
		System.out.println(member2.age);
		
		 Member member3=new Member("홍길동" ,30);
		 System.out.println(member3);
		 
		 //같지만 내용이 다르기때문에 구별 가능하다
		 //생산자를 오버로딩한다
		 new Member();
		 new Member("홍길동");
		 new Member("홍길동",20);
	}
}
