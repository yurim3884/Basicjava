package sec02.verofy.exam04;

import java.util.Scanner;

public class zzzzzzzzzzzzzzzzz {
	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			
			System.out.println("-------------------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3.점수리스트 | 4.분석 | 5. 종료");
			System.out.println("-------------------------------------------------------------------");
			System.out.print("선택>");

			int selectNo = scanner.nextInt();

			switch (selectNo) {
			
			case 1:
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "] > ");
					scores[i] = scanner.nextInt();
				}
				break;
			case 3:
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] > " + scores[i]);
				}
				break;
			case 4:
				int max = 0;
				int sum = 0;
				double avg = 0;

				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if (max < scores[i]) {
						max = scores[i];
					}

				}
				avg = (double) sum / studentNum;
				System.out.println(max);
				System.out.println(avg);
				break;
			
			default:
				run=false;
				System.out.println("프로그램 종료");
				break;

			}
		}
	}

}
