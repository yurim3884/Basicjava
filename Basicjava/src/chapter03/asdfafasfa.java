package chapter03;

import java.util.Scanner;

public class asdfafasfa {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("첫 번째 수: ");
		double num1 = scanner.nextDouble();
		
		System.out.println("두 번째 수: ");
		double num2 = scanner.nextDouble();
//============================================================================================================================================================		
//		if문활용
//		 if (num2==0d) {
//			System.out.println("결과 : 무한대");
//		}else {
//			System.out.println("결과: "+num1/num2);
//		}
//============================================================================================================================================================		
//		삼항연산자1
//		System.out.println((double)num2==0.0 ? "결과:무한대" :num1/num2);
//============================================================================================================================================================		
//		삼항연산자2
//		double result=num1/num2;
//		System.out.println((double)num2==0.0 ? "결과:무한대" :result);
//============================================================================================================================================================
//		삼항연산자3
//		double result=num1/num2;
//		//System.out.println((double)num2==0.0 ? "결과:무한대" :result);
//============================================================================================================================================================
		//삼항연산자4 문자열 사용
		String resultString =num2==00 || num2==00 ?"무한대" :String.valueOf(num1/num2) ;
		System.out.println("결과:" + resultString);

		scanner.close();
	}

}
