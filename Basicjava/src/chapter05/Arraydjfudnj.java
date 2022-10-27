package chapter05;

import java.util.Arrays;
import java.util.Random;

public class Arraydjfudnj {
	public static void main(String[] args) {

		int[] lotto = new int[45];

		Random random = new Random();

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}

		for (int i = 0; i < lotto.length; i++) {
			int temp = lotto[i];
			int ranNum = random.nextInt(45);
			lotto[i] = lotto[ranNum];
			lotto[ranNum] = temp;

		}
		for (int j = 0; j < 6; j++) {
//			System.out.println(Arrays.toString(lotto));
			System.out.println(lotto[j]);

		}
//		System.out.println(lotto[0]);
//		System.out.println(lotto[1]);
//		System.out.println(lotto[2]);
//		System.out.println(lotto[3]);
//		System.out.println(lotto[4]);
//		System.out.println(lotto[5]);
	}


}
