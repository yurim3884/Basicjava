package chapter04;

import java.util.Scanner;

public class IfElseIfElseExample {
	public static void main(String[] args) {
//		디버깅 (debugging)
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		if (score >= 90) {
			System.out.println("점수가 100~90 입니다.");
			System.out.println("등급은 A입니다");
		} else if (score >= 80) {
			System.out.println("점수가 80~89 입니다.");
			System.out.println("등급은 B입니다");
		} else if (score >= 70) {
			System.out.println("점수가 70~79 입니다.");
			System.out.println("등급은 C입니다");
		} else  {
			System.out.println("점수가 70 미만입니다");
			System.out.println("등급은 D입니다");
		}scanner.close();
	}
}