package chapter06;

public class Car {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	// 생성자1
	Car() {
		this(null, null, 0);
	}

	// 생성자2
	Car(String model) {
		this(model, null, 0);
//		this.model = model;
	}

	// 생성자3
	Car(String model, String color) {
		this(model,color,0);
//		this.model = model;
//		this.color = color;
	}

	// 생성자4
	Car(String model, String color, int maxSpped) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpped;
	}

}
