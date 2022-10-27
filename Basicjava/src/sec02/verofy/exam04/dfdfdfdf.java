package sec02.verofy.exam04;

import java.util.Random;

public class dfdfdfdf {
	public static void main(String[] args) {

		Random random = new Random();

		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=random.nextInt(45)+1;
			for (int j = 0; j < i; j++) {
				if (i==j) {
					i--;
				}
			}System.out.println(lotto[i]);
		}

	}
}
