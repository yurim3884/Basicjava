package chapter06_;

public class Car {

	private double speed;
	private String color;
	private static final double MAX_SPEED = 200;

	Car() {
	}

	public Car(String color) {
		this.color = color;
	}

	double getSpeed() {
		return speed;
	}

	void setSpeed(double speed) {
		this.speed = speed;
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	public static double getMaxspeed() {
		return MAX_SPEED;
	}

	boolean speedUp(double speed) {
		if (speed < 0 || speed > MAX_SPEED) {
			return false;
		} else {
			this.speed += speed;
			return true;
		}
	}

}
