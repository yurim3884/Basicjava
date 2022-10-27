package sec02.verofy.exam04;

import java.util.Random;
import java.util.Scanner;

public class sdfdfsdfsfew {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		String[] game = { "가위", "바위", "보" };

		System.out.print("가위 바위 보를 입력하세요: ");
		String player = scanner.nextLine();
		System.out.println("게이머: " + player);
		String computer = game[(int) random.nextInt(game.length)];
		System.out.println("인공지능 컴퓨터: " + computer);

		if (player.equals(computer)) {
			System.out.println("비김");
		} else if (player.equals("주먹") && computer.equals("가위") || player.equals("가위") && computer.equals("보")
				|| player.equals("보") && computer.equals("주먹")) {
			System.out.println("게이머 승리");
		} else if (player.equals("주먹") && computer.equals("보") || player.equals("가위") && computer.equals("바위")
				|| player.equals("보") && computer.equals("가위")) {
			System.out.println("인공지능 컴퓨터 승리");
		} else {
			System.out.println("잘못된 값을 입력하셨습니다");
		}

	}

}
