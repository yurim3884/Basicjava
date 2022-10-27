package chapter03;

import java.util.Scanner;

public class Exercise32 {
	public static void main(String[] args) {

		// 1. 한 나라의 수도이고, 인구가 100만 이상이어야 한다.
		// 2. 연 소득이 1억 이상인 인구가 50만 이상이어야 한다

		Scanner scanner = new Scanner(System.in);

		System.out.println("수도 입니까? (수도: 1 , 수도아님: 0)");
		int cap = scanner.nextInt();

		System.out.println("총 인구는? (단위: 만)");
		int pop = scanner.nextInt();

		System.out.println("연소득이 1억 이상인 인구는? (단위: 만)");
		int rich = scanner.nextInt();
		
		String result=(cap == 1 && pop >= 100 || rich >= 50 ? "이 도시는 메트로폴리스입니다" : "이 도시는 메트로폴리스가 아닙니다");

		System.out.println(result);
		
		System.out.println(cap == 1 && pop >= 100 || rich >= 50 ? "이 도시는 메트로폴리스입니다" : "이 도시는 메트로폴리스가 아닙니다");
		
		scanner.close();
//
//============================================================================================================================================================
//		  if(cap==1 && pop>=100) { System.out.println( "이 도시는 메트로폴리스입니다"); 
//		 		}else if (rich>=50) 
//		  			{ System.out.println("이 도시는 메트로폴리스입니다"); 
//		  }else {
//		  System.out.println("이 도시는 메트로폴리스가 아닙니다"); }
//============================================================================================================================================================
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("수도 입니까? (수도: true, 수도아님: false)");
//		boolean cap = scanner.nextBoolean();
//
//		System.out.println("총 인구는? (단위: 만)");
//		int pop = scanner.nextInt();
//
//		System.out.println("연소득이 1억 이상인 인구는? (단위: 만)");
//		int rich = scanner.nextInt();
//		
//		String result=(cap && pop >= 100 || rich >= 50 ? "이 도시는 메트로폴리스입니다" : "이 도시는 메트로폴리스가 아닙니다");
//============================================================================================================================================================
//		System.out.println(result);
//		scanner.close();
//		
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("수도 입니까? (수도: 1, 수도아님: 0)");
//		boolean cap = scanner.nextInt()==1; //? true : false;//
//
//		System.out.println("총 인구는? (단위: 만)");
//		int pop = scanner.nextInt();
//
//		System.out.println("연소득이 1억 이상인 인구는? (단위: 만)");
//		int rich = scanner.nextInt();
//		
//		String result=(cap && pop >= 100 || rich >= 50 ? "이 도시는 메트로폴리스입니다" : "이 도시는 메트로폴리스가 아닙니다");
//
//		System.out.println(result);
//
	}
}
