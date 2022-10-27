package chapter04Exercise;

import java.util.Scanner;

public class Exercise43 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("점수를 입력하세요");
		System.out.print("프로그래밍 기초 : ");
		double pro = scanner.nextDouble();
		System.out.print("데이터베이스 : ");
		double db = scanner.nextDouble();
		System.out.print("화면 구현 : ");
		double scr = scanner.nextDouble();
		System.out.print("애플리케이션 구현 : ");
		double app = scanner.nextDouble();
		System.out.print("머신러닝 : ");
		double mac = scanner.nextDouble();

		double total = pro + db + scr + app + mac;
		double ave = total / 5;

		System.out.println("총점: " + (int) total);
		System.out.printf("평균: %.2f", ave);

		if (ave >= 90) {
			System.out.println("\n학점: A");
		} else if (ave > 80) {
			System.out.println("\n학점: B");
		} else if (ave > 70) {
			System.out.println("\n학점: C");
		} else if (ave > 60) {
			System.out.println("\n학점: D");
		} else {
			System.out.println("\n학점: F입니다");
		}
		scanner.close();
	}

}
