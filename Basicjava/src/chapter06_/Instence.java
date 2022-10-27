package chapter06_;

public class Instence {
	public static void main(String[] args) {
	/*
	 * 클래스로부터 객체는 하나가 아니라 여러개가 만들어진다 
	 * 
	 * 인스턴스 멤버: 객체마다 가지고 있는 멤버
	 * 정적멤버 : 클래스에 위치시키고 객체들이 *공유*하는 멤버 = static 딱 한개만 존재
	 * 
	 * 
	 * 인스턴스 멤버란 객체를 생성한 후 사용할 수 있는 필드와 메소드
	 * =>인스턴스 필드 , 인스턴스 메소드
	 * 
	 * 인스턴스 멤버에 접근 this
	 * 
	 *  정적멤버란 클래스에 고정된 멤버로 객체를 생성하지않고 사용할 수 있는 필드와 메소드
	 *  => 정적 필드 , 정적 메소드
	 * 
	 * ex) 똑같은 내용의 책을 각각 학생들이 사용하고 있다 => 인스턴스
	 *     게시판(필드)에 고정되어있어 학생들이 공유하고 있다 => 정적 
	 * 
	 * 	static을 인스턴스 타입으로 선언이 되어 오류가 난다
		static 클래스 이름을 쓰면 된다
		
		System.out.println(s1.checkoutTime);  X
		System.out.println(Student.checkoutTime);  O
	 * 
	 * 
	 * 데이터를 저장하거나 동작을 실행할 때 class 정의
	 *  원칙적
	 * ->반드시 생성해야 사용 가능 
	 * ->반드시 new를 통해서 생성  ->heap
	 *  
	 *  static
	 * ->자바가 실행될 때 자동으로 메모리에 로딩  ->method
	 * -> 생성하지않아도 자동으로 로딩
	 * -> 누구나 (모든 class) 공유
	 * -> static에 붙어있는 것들은 인스턴스를 사용할 수 없다 (?)
	 * 
	 * 인스턴스에서는 static 사용 가능
	 * static 에서는 인스턴스 사용 불가
	 * 
	 * static이 붙어있으면 안붙어있는거 사용불가
	 * 무조건 생성 (new)을 해줘야한다
	 * 
	 * static이 붙여있지 않으면 static 사용가능
	 * 
	 * 
	 * arrays = static
	 * 
	 ********  가능하면 필드에 static을 붙이지 않는 것이 좋다
	 ********  메소드에 붙이는 것은 괜찮다!
	 ********  무분별한 사용은 좋지 않다 
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
	 * 
	 * 
	 * 
	 * 
	 */

}
}
