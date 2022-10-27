package chapter05;

import java.util.Random;

public class qustndustmq {
	public static void main(String[] args) {

		// 랜덤 클래스에 15개의 배열
		Random[] random = new Random[15];
		
		//일반적인 객체 생성 방식
		random[0] = new Random();
		random[1] = new Random();
		random[2] = new Random();
		
		//->리터럴 형식의 방식
		Random[] random3 = {new Random(),new Random(), };
		
		int ranNum = random[0].nextInt(10);  //0부터 10개의 숫자 
		double ranDouble = random[1].nextDouble();
		float ranfloat = random[2].nextFloat();
		
		System.out.println(ranNum);
		System.out.println(ranDouble);
		System.out.println(ranfloat);

		// boolean 타입 데이터 25개 배열
		boolean[] flags = new boolean[25];
		flags[0] = false; // =flags1 = false;
		flags[1] = true; // =flags2 = true;

	}

}
