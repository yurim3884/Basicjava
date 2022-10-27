package chapter07;

public class SmartPhone extends Phone{
	
	public SmartPhone(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println(owner+"님의 전화를 킵니다");
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println(owner+"님의 전화를 끕니다 ");
	}
	
	public void hangOn() {
		System.out.println("전화 통화를 시작합니다" );
	}
	public void hangOff() {
		System.out.println("전화 통화를 종료합니다" );
	}

}
