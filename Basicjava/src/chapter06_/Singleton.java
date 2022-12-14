package chapter06_;

public class Singleton {
	public static void main(String[] args) {
		/*
		 * 싱글톤
		 * 객체의 인스턴스가 오직 1개만 생성되는 패턴
		 * 클래스의 인스턴스를 하나만 생성하여 사용하는 패턴
		 *  
		 *  특정 객체를 여러곳에서 공유해야 할 때 사용
		 * 
		 * 클래스 = 필드(여러개)+메소드(여러개 만드는 것이 의미가 없음)
		 * 
		 * 
		 * 다양한 곳에서 A객체를 호출하기 위해서는 각각의 코드 위치에서 여러개 만들어야한다
		 *  new A();
		 *  new A();
		 *  ->  공간을 비효율적으로 사용하고있다(?)
		 *  
		 *  메소드를 하기 위해서 필드를 만든다고 가정하면 
		 *  하나만 만드는 것이 좋다
		 *  
		 *  
		 * 디자인 패턴
		 * 
		 * 
		 * 여러곳에서 동시에 접근해서 생길 수 있는 문제(동기화 문제)를 잘 파악하고 설계
		 * 싱글톤 패턴을 만들땐 기본적으로 생성자를 private로 해서 외부에서는 직접 인스턴스를 생성할 수 없게 하고,
		 * 
		 * 사용자에게 인스턴스를 전달하는 static 메소드가 있다.
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
