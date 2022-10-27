package chapter06_;

public class CarExmple {
	public static void main(String[] args) {
		NewCar myCar = new NewCar("red");
		System.out.println("myCar의 색: " + myCar.getColor());
		System.out.println("차의 최대 속력: " + NewCar.getMaxspeed() + "km/h");

		System.out.print("첫 번째 speedUp(100.0km/h): ");
		if (myCar.speedUp(100.0)) {
			System.out.print("속도 변경 가능, ");
		} else {
			System.out.print("속도 변경 불가능, ");
		}
		System.out.println("현재 차의 속력: " + myCar.getSpeed() + "km/h");
//		System.out.println("현재 차의 속력: " +getkilloToMile(myCar.getSpeed()) + "mile/h");

		System.out.print("두 번째 speedUp(90.0km/h): ");
		if (myCar.speedUp(90.0)) {
			System.out.print("속도 변경 가능, ");
		} else {
			System.out.print("속도 변경 불가능, ");
		}
		System.out.println("현재 차의 속력: " + myCar.getSpeed() + "km/h");
//		System.out.println("현재 차의 속력: " +getkilloToMile(myCar.getSpeed()) + "mile/h");
		System.out.println();

		NewCar yourCar = new NewCar("blue");
		System.out.println("yourCar의 색: " + yourCar.getColor());
		System.out.println("차의 최대 속력: " + NewCar.getMaxspeed() + "km/h");

		System.out.print("첫 번째 speedUp(-100.0km/h): ");
		if (yourCar.speedUp(-100.0)) {
			System.out.print("속도 변경 가능, ");
		} else {
			System.out.print("속도 변경 불가능, ");
		}
		System.out.println("현재 차의 속력: " + yourCar.getSpeed() + "km/h");

		System.out.print("두 번째 speedUp(210.0km/h): ");
		if (yourCar.speedUp(210.0)) {
			System.out.print("속도 변경 가능, ");
		} else {
			System.out.print("속도 변경 불가능, ");
		}
		System.out.println("현재 차의 속력: " + yourCar.getSpeed() + "km/h");

	}

//	private static double getkilloToMile(double speed) {
//		// TODO Auto-generated method stub
//		return speed/1.6;
//	}

}
