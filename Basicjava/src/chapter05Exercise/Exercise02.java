package chapter05Exercise;

import java.util.Random;

public class Exercise02 {
	public static void main(String[] args) {

		Random random = new Random();
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=random.nextInt(45)+1;
			for (int j = 0; j < i; j++) {
				if (i==j) {
					
				}
			}System.out.println(lotto[i]);
		}

	}
}