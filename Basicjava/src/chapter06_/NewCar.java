package chapter06_;

public class NewCar {

	private double speed;
	private String color;
	private static final double MAX_SPEED = killoToMile(200);

	NewCar() {
	}

	public NewCar(String color) {
		this.color = color;
	}

	double getSpeed() {
		return MileToKillo(speed);
	}

	void setSpeed(double speed) {
		this.speed = killoToMile(speed);
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	public static double getMaxspeed() {
		return MileToKillo(MAX_SPEED);
	}

	boolean speedUp(double speed) {
		speed=killoToMile(speed);
		if (speed < 0 || speed > MAX_SPEED) {
			return false;
		} else {
			this.speed += speed;
			return true;
		}
	}

	private  static double killoToMile(double distance) {
		return distance / 1.6;
	}

	@Override
	public String toString() {
		return "NewCar [speed=" + speed + ", color=" + color + "]";
	}

	public static double getMaxSpeed() {
		return MAX_SPEED;
	}

	private static double MileToKillo(double distance) {
		return distance * 1.6;
	}
}
