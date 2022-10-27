package chapter03;

import java.util.Scanner;

public class Exercise31 {
	public static void main(String[] args) {
		
		//절대값 반환 메소드 Math.abs
		//((a + b) + |a - b|) / 2         큰 값
		//((a + b) - |a - b|) / 2         작은 값 
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("첫 번째 숫자를 입력하세요: ");
		int num1 = scanner.nextInt();

		System.out.println("두 번째 숫자를 입력하세요: ");
		int num2 = scanner.nextInt();

		int bnum = ((num1 + num2) + Math.abs(num1 - num2)) / 2;
		int snum = ((num1 + num2) - Math.abs(num1 - num2)) / 2;

		System.out.println("큰 수를 작은 수로 나눈 몫은 " + bnum / snum + "이고, 나머지는 " + bnum % snum + "이다.");
//		========================================================================================================================================================
		/*
		 * if(num1>num2) {
		 * System.out.println("큰 수를 작은 수로 나눈 몫은 "+num1/num2+"이고, 나머지는 "+num1%num2+"이다.")
		 * ; }else {
		 * System.out.println("큰 수를 작은 수로 나눈 몫은 "+num2/num1+"이고, 나머지는 "+num2%num1+"이다.")
		 * ; }
		 */
		scanner.close();
	}

}
