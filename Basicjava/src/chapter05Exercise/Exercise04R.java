package chapter05Exercise;

import java.util.Random;

public class Exercise04R {
	public static void main(String[] args) {
		Random random = new Random();

		int[] game = new int[6];
		

		for (int i = 0; i < 10000; i++) {
			game[random.nextInt(6)]++;
//			int a = random.nextInt(6);
//			if (a == 1) {
//				game[0]++;
//			} else if (a == 2) {
//				game[1]++;
//			} else if (a == 3) {
//				game[2]++;
//			} else if (a == 4) {
//				game[3]++;
//			} else if (a == 5) {
//				game[4]++;
//			} else {
//				game[5]++;
//			}

		}
		System.out.println("-------------");
		System.out.println("면\t빈도");
		System.out.println("-------------");
		
		for (int j = 0; j < game.length; j++) {
			System.out.println( j+1 +"\t"+ game[j]);	
		}

	}
}
