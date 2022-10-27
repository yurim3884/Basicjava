package chapter04Exercise;

import java.util.Scanner;

public class dsdsdsdsd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("가위 바위 보 게임");

		System.out.print("철수: ");
		String c = scanner.next();
		System.out.print("영희: ");
		String y = scanner.next();
		// 조건문은 결과를 먼저 생각

		if (c.equals("가위")) {
			switch (y) {
			case "가위":
				System.out.println("비김");
				break;
			case "바위":
				System.out.println("영희 이김");
				break;
			case "보":
				System.out.println("철수 이김");
				break;
			}

		} else if (c.equals("바위")) {
			switch (y) {
			case "가위":
				System.out.println("철수 이김");
				break;
			case "바위":
				System.out.println("비김");
				break;
			case "보":
				System.out.println("영희 이김");
				break;
			}

		} else if (c.equals("보")) {
			switch (y) {
			case "가위":
				System.out.println("영희 이김");
				break;
			case "바위":
				System.out.println("철수 이김");
				break;
			case "보":
				System.out.println("비김");
				break;
			}
		} else {
			System.out.println("잘못된 입력값 입니다");
		}scanner.close();
	}
}
