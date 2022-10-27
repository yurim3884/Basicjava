package sec02.verofy.exam04;

import java.util.Random;

public class ddfsdfdfdf {
	public static void main(String[] args) {
		System.out.println("----------------------------------");
		System.out.println("면\t빈도");
		System.out.println("----------------------------------");
		
		Random random=new Random();
		
		int[] dice = new int[6];
		
		for (int i = 0; i < 10000; i++) {
			dice[random.nextInt(6)]++;
		}
		for (int i = 0; i < dice.length; i++) {
			System.out.println(i+1+"\t"+dice[i]);	
		}
	}

}
