package chapter06_;

public class Circle {

	private double radius;
	private double x;
	private double y;

	double getArae() {
		double area = radius * radius * Math.PI;
		return area;
	}

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		if (radius < 0) {
			this.radius = 0;
			return;
		}
		this.radius = radius;
	}

	double getX() {
		return x;
	}

	void setX(double x) {
		this.x = x;
	}

	double getY() {
		return y;
	}

	void setY(double y) {
		this.y = y;
	}

}
