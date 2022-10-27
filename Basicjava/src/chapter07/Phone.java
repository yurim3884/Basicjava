package chapter07;

public abstract class Phone {
	public String owner;

	public Phone(String owner) {
		this.owner = owner;
	}

	//추상클라스라고 해서 반드시 추상메소드가 필요하지않다
	//추상 메소드를 가지고있다면 반드시 추상 클래스가 되어야한다.
	public abstract void turnOn();
	public abstract void turnOff();

//	public void turnOff() {
//		System.out.println("폰 전원을 끕니다");
//	}
}

