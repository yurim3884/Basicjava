package chapter02.exercise;

import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가로의 길이는? (단위: m): ");
		double width =scanner.nextDouble();
		
		System.out.println("세로의 길이는? (단위: m): ");
		double  height =scanner.nextDouble();
	
		
		double area =width*height;
		double perimeter =(width+height)*2;
		

		System.out.println("직사각형의 넓이: " +area);
		System.out.println("직사각형의 둘레: "+perimeter);
	}

}
