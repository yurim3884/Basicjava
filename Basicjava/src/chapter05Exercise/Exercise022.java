package chapter05Exercise;

import java.util.Arrays;
import java.util.Random;

public class Exercise022 {
	public static void main(String[] args) {

		Random random = new Random();

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
				    break;
				}
			}
		}
//		for (int l = 0; l < lotto.length; l++) {
//			System.out.println(lotto[l]);
//
//		}
		System.out.println(Arrays.toString(lotto));
	}

}
