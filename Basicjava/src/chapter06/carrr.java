package chapter06;

public class carrr {
	
	int speed;

	void run() {
		if (speed == 0) {
			System.out.println("멈춥니다");
		} else {
			System.out.println(speed + "으로 달립니다.");
		}
	}

	public static void main(String[] args) {
		//static 내부(main)에서 인스턴스 객체(speed)를 사용하기 위해서는 선언 및 생성을 해야한다
		carrr mycar = new carrr();
		mycar.speed = 60;
		mycar.run();
	}
}
