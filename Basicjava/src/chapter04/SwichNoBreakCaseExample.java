package chapter04;

import java.util.Random;

public class SwichNoBreakCaseExample {
	public static void main(String[] args) {
		
		Random random = new Random();

		int time = random.nextInt(4) + 8;

		System.out.println("[현재시간: " + time + "시]");

		switch (time) {
		case 8:
			System.out.println("출근합시다");
		case 9:
			System.out.println("회의를 합시다");
		case 10:
			System.out.println("업무를 봅시다");
		default:
			System.out.println("외근을 나갑시다");
		}
	}

}
