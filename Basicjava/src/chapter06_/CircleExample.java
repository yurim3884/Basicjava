package chapter06_;

public class CircleExample {
	public static void main(String[] args) {
		Circle circle1= new Circle(); 
		circle1.setRadius(3.6);
		circle1.setX(0.0);
		circle1.setY(1.5);
		
		System.out.println("반지름: "+circle1.getRadius());
		System.out.println("원의 중심 좌표: ("+circle1.getX()+"),("+circle1.getY()+")");
		System.out.printf("넓이: %.2f\n",circle1.getArae());
		
		Circle circle2= new Circle(); 
		circle2.setRadius(-5.6);
		circle2.setX(1.0);
		circle2.setY(2.2);
		
		System.out.println("반지름: "+circle2.getRadius());
		System.out.println("원의 중심 좌표: ("+circle2.getX()+"),("+circle1.getY()+")");
		System.out.printf("넓이: %.2f\n",circle2.getArae());
		
	}

}
