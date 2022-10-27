package chapter04;

import java.util.Random;

public class Q161003 {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		while (true) {
			int a = random.nextInt(6) + 1;
			int b = random.nextInt(6) + 1;
			System.out.println(a+","+b);
			if (a+b==5) {
				
				break;
			}
		}
	}

}
