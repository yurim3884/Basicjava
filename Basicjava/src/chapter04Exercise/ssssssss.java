package chapter04Exercise;

import java.util.Random;
import java.util.Scanner;

public class ssssssss {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int ran = random.nextInt(100) + 1;
		int count = 0;

		while (true) {
			System.out.print("1부터 100사이의 정수 중 하나를 선택하세요:");
			int num = scanner.nextInt();
			count++;

			if (ran > num) {
				System.out.println("정답은 더 큰 수 입니다.");
			} else if (ran < num) {
				System.out.println("정답은 더 작은 수 입니다");
			} else {
				System.out.println("정답입니다");
				System.out.println("게임을 종료합니다");
				System.out.printf("총 %2d 번만에 맞추셨습니다", count);
				break;
			}
		}
	
		scanner.close();

	}
}
