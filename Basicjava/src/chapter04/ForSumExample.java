package chapter04;

//import java.util.Scanner;

public class ForSumExample {
	public static void main(String[] args) {

		int sum = 0;

		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100 합: " + sum);

		// 1부터 100까지의 합이 아닌
		// 1부터 입력된 숫자까지의 합을 구하는 프로그램을 작성하시오
		
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("입력");
//		int ii = scanner.nextInt();
//		
//		
//		int sum1 = 0;
//
//		for (int iii = 0; iii <= ii; iii++) {
//			sum1 += iii;
//		}
//		System.out.println("1~ "+ii+"합:"+sum1);
		
		
		int a = 0;
		int b = 0;
		for (a = 1; a <= 100; a++) {
			b += a;
		}
		System.out.println("1~ "+(a-1)+"합:"+b);
		//a는 101이되므로 -1
		
	}
}
