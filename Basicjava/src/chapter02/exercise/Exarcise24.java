package chapter02.exercise;

import java.util.Scanner;

public class Exarcise24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//System.out.println("원기둥 밑변의 반지름을 입력하시오.(단위: cm)");
		System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위: cm): ");
		double rad = scanner.nextDouble();
		
		//System.out.println("원기둥의 높이를 입력하시오.(단위: cm)");
		System.out.print("원기둥의 높이를 입력하시오.(단위: cm): ");
		double hei = scanner.nextDouble();
		

		double area = rad*rad*Math.PI;
		double volume = area*hei;
		
		System.out.println("원기둥 밑변의 넓이는 "+area+"cm²이고, 원기둥의 부피는 "+volume+"cm²이다.");		
		
		scanner.close();
		//스캐너를 사용하고 닫았다고 선언을 해야한다 
		//굳이..?하지만 쓰는 습관을 가져야한다
		
	}
}
