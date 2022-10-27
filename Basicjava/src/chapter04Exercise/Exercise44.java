package chapter04Exercise;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("가위 바위 보 게임");

		System.out.println("철수: ");
		String c = scanner.next();
		System.out.println("영희: ");
		String y = scanner.next();
		//조건문은 결과를 먼저 생각

		if (c.equals("가위")) {
			if (y.equals("바위")) {
				System.out.println("결과: 영희 승리!");
			} else if (y.equals("가위")) {
				System.out.println("결과: 비겼습니다");
			} else {
				System.out.println("결과: 철수 승리!");
			}

		} else if (c.equals("바위")) {
			if (y.equals("바위")) {
				System.out.println("결과: 비겼습니다");
			} else if (y.equals("가위")) {
				System.out.println("결과: 철수 승리!");
			} else {
				System.out.println("결과: 영희 승리!");
			}
		} else if (c.equals("보")) {
			if (y.equals("바위")) {
				System.out.println("결과: 철수 승리!");
			} else if (y.equals("가위")) {
				System.out.println("결과: 영희 승리!");
			} else {
				System.out.println("결과: 비겼습니다");
			}
		} else {
			System.out.println("잘못입력하였습니다");
		}
		scanner.close();
	}

}
