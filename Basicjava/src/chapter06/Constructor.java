package chapter06;

public class Constructor {
	/*생성자 p232
	 * 
	 * 생성자는 초기화를 담당한다
	 * new()연산자로 호출되는 {}블록
	 * ----------------------------------------------------------------------------------------------------------------------------------------- 
	 * 자동으로 public  Constructor 생성
	 * ->public class Constructor { }가 아니라 public  Constructor 이게 호출
	 * ----------------------------------------------------------------------------------------------------------------------------------------- 
	 * 멤버 코드를 작성할 때 모든 사람을 다 호출하기는 무리 
	 * - member테이블에서 public Member(String n, int a)
	 * name = n;
		age=a;
		//문자 타입은 n 숫자로 들어가면 a로 들어간다
	 *MemberExample에서  Member member2=new Member("홍길동", 30);
	 * 
	 * public Member(String n, int a) 원하는 만큼 제작가능  (단 개수나 타입이 달라야한다)
	 * public Member(String n, int a,String p, string i){
	 * name = n; age=a; password=p; id=i;}
	 * ----------------------------------------------------------------------------------------------------------------------------------------- 
	 *  //코드 구별 더 쉽게
	    public  Member(String name,String password, String id,int age) {
		this.name = name; this.age=age; this.password=password; this.id=id;
      	}
	    //현재 메모리 상에 있는 객체(인스턴스 )를 this
	 *    MemberExample 에서 생성된 Member의 주소 값 
	 * -----------------------------------------------------------------------------------------------------------------------------------------
	 * public Member() 는 동작을 실행하는 메소드 
	 * -----------------------------------------------------------------------------------------------------------------------------------------
	 * 매개변수 
	 * 메소드나 생성자 ()안에 있는 변수
	 * 호출할 때 인수로 전달된 값을 함수 내부에서 사용할 수 있게 해주는 변수 
	 * parameter
	 * 
	 * public Member(String name, int age) {
	 * 일때 String name, int age
	 * -----------------------------------------------------------------------------------------------------------------------------------------
	 * this()    != this.
	 * 내부적으로 자기 자신의 생성자를 호출할 때 
	 * 현재 클래스 안에 있는 생성자 호출
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}