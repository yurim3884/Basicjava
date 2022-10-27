package chapter06;

public class car2example {
	public static void main(String[] args) {
		car2 mycar = new car2();

		// 잘못된 속도 변경
		mycar.setspeed(-50);

		System.out.println("현재속도" + mycar.getspeed());

		// 올바른 속도 변경

		mycar.setspeed(60);

		if (!mycar.isstop()) {
			mycar.setstop(true);
		}
		System.out.println("현재속도" + mycar.getspeed());
	}

}
