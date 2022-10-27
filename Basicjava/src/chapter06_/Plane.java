package chapter06_;

public class Plane {

	private String manufacturer;
	private String model;
	private int maxNumberOfPassengers;
	private static int numberOfPlanes;

	public Plane() {
		numberOfPlanes++;
	}

	public Plane(String manufacturer, String model, int maxNumberOfPassengers) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
		numberOfPlanes++;
	}

	String getManufacture() {
		return manufacturer;
	}

	String getModel() {
		return model;
	}

	int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}

	void setManufacture(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	void setModel(String model) {
		this.model = model;
	}

	void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		if (maxNumberOfPassengers < 0) {
			maxNumberOfPassengers = 0;
		}
		this.maxNumberOfPassengers = maxNumberOfPassengers;
	}

	static int getNumberOfPlanes() {
		return numberOfPlanes;
	}

	public String toString() {
		return String.format("제조사: %S \n비행기 모델명: %S \n 최대 승객수 %d", manufacturer, model, maxNumberOfPassengers);
	}

}
