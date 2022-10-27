package chapter05Exercise;

import java.util.Random;

public class Exercise04 {
	public static void main(String[] args) {
		Random random = new Random();

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;

		for (int i = 0; i < 10000; i++) {
			int a = random.nextInt(6) + 1;
			switch (a) {
			case 1:
				num1++;
				break;
			case 2:
				num2++;
				break;
			case 3:
				num3++;
				break;
			case 4:
				num4++;
				break;
			case 5:
				num5++;
				break;
			case 6:
				num6++;
				break;
			}
		}
		System.out.println("-------------");
		System.out.println("면\t" + "빈도");
		System.out.println("-------------");
		System.out.println("1\t" + num1);
		System.out.println("2\t" + num2);
		System.out.println("3\t" + num3);
		System.out.println("4\t" + num4);
		System.out.println("5\t" + num5);
		System.out.println("6\t" + num6);
	}

}
