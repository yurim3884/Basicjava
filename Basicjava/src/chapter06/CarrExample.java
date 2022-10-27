package chapter06;

public class CarrExample {
	public static void main(String[] args) {
		Carr myCar = new Carr();
		
		//myCar의 setGas 메소드 추출
		myCar.setGas(8); 
		
		//myCar의 isLeftGas 메소드 추출
		boolean gasState = myCar.isLeftGas();
		if (gasState) {
			System.out.println("출발합니다");
			myCar.run(); //myCar의 run 메소드 추출
		}
		
		//myCar의 isLeftGas 메소드 추출
		if (myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요");
		}

	}

}
