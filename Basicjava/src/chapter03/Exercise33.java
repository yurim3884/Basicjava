package chapter03;

import java.util.Scanner;

public class Exercise33 {
	public static void main(String[] args) {
		// 윤년은 4의 배수이어야 하고, 100의 배수는 아니어야 한다.
		// 또한 400의 배수는 무조건 윤년이 된다.

		Scanner scanner = new Scanner(System.in);

		System.out.println("윤년인지 확인할 연도를 입력하세요: ");
		int year = scanner.nextInt();
		
		String result=(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? year + "은 윤년입니다" : year + "은 윤년이 아닙니다");

		System.out.println(result);
		
		scanner.close();
//============================================================================================================================================================	
//		String result1=(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "윤년입니다" :  "윤년이 아닙니다");
//
//		System.out.println(year+"은 "+result1);
//============================================================================================================================================================	
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("윤년인지 확인할 연도를 입력하세요: ");
//		int year = scanner.nextInt();
//		
//		System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? year + "은 윤년입니다" : year + "은 윤년이 아닙니다");
//
//============================================================================================================================================================	
//		  if(year%4==0 && year%100 !=0) {
//		  
//		  System.out.println(year + "은 윤년입니다");
//			}else if (year%400==0) {
//		  System.out.println(year + "은 윤년입니다"); 
//				}else { System.out.println(year
//		  +"은 윤년이 아닙니다"); }
//		 /

	}

}
