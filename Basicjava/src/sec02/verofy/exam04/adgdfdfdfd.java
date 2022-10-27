package sec02.verofy.exam04;

import java.util.Arrays;
import java.util.Scanner;

public class adgdfdfdfd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean run = true;
		int studentNum = 0;
		int[] score = null;

		while (run) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 |3.점수리스트 |4.분석 |5. 종료");
			System.out.println("----------------------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				System.out.print("학생수>");
				studentNum = Integer.parseInt(scanner.nextLine());
				score = new int[studentNum];

			} else if (selectNo == 2) {
				for (int i = 0; i <score.length; i++) {
					System.out.print("score["+i+"]>");
					score[i] = Integer.parseInt(scanner.nextLine());
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < score.length; i++) {
					System.out.println("score["+i+"]"+score[i]);
				}
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0.0;
				for (int i = 0; i < score.length; i++) {
					sum += score[i];
					if (score[i] > max) {
						max = score[i];
					}
				}
				avg = (double)sum / score.length;
				System.out.println("최고 점수:" + max);
				System.out.println("평균 점수:" + avg);
			} else if (selectNo == 5) {
				run = false;
			}
		}System.out.println("프로그램 종료");
	}
}
