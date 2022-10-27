package chapter04Exercise;

import java.util.Scanner;

public class ex41 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("삼각형의 첫번쨰 변의 길이를 입력하세요: ");
		int leg1 = scanner.nextInt();
		System.out.println("삼각형의 두번쨰 변의 길이를 입력하세요: ");
		int leg2 = scanner.nextInt();
		System.out.println("삼각형의 세번쨰 변의 길이를 입력하세요: ");
		int leg3 = scanner.nextInt();

		if ((leg1 < leg2 + leg3) & (leg2 < leg1 + leg3) && (leg3 < leg2 + leg1)) {
			System.out.println("삼각형을 만들 수 있습니다");

		}System.out.println("삼각형을 만들 수 없습니다");
		scanner.close();
	}
}
