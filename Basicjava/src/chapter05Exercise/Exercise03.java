package chapter05Exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		String[] idn = { "가위", "바위", "보" };

		String computer = idn[(int) random.nextInt(3)];

		System.out.print("가위바위보를 입력하세요: ");
		String gamer = scanner.next();
		System.out.println("게이머: " + gamer);
		System.out.println("인공지는 컴퓨터: " + computer);

		if (gamer.equals(computer)) {
			System.out.println(" 결과: 비김!");
		} else if (gamer.equals("가위") && computer.equals("바위") || gamer.equals("보") && computer.equals("가위")
				|| gamer.equals("바위") && computer.equals("보")) {
			System.out.println("결과: 컴퓨터 승리 !");

		} else if (gamer.equals("가위") && computer.equals("보") || gamer.equals("보") && computer.equals("바위")
				|| gamer.equals("바위") && computer.equals("가위")) {
			System.out.println("결과: 컴퓨터 승리 !");
		} else {
			System.out.println("잘못 입력하였습니다");
		}

		scanner.close();
	
	}
}
