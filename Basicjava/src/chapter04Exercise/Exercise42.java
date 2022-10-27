package chapter04Exercise;

import java.util.Scanner;

public class Exercise42 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력하세요 (1~12): ");
		int month = scanner.nextInt();

		if (month > 3 && month <= 5) {
			System.out.println(month + "월은 봄 입니다.");
		} else if (month >= 3 && month <= 8) {
			System.out.println(month + "월은 여름 입니다.");
		} else if (month >= 9 && month <= 11) {
			System.out.println(month + "월은 가을 입니다.");
		} else if (month == 12 || (month <= 2 && month>0)) {
			System.out.println(month + "월은 겨울 입니다.");
		} else {
			System.out.println(month + "월은 잘못된 입력입니다.");
		}
		scanner.close();
	}
}
