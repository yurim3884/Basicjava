package chapter04;

import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {

//		 랜덤 사용하기 (Pseudo Random : 수도 랜덤)
//		 1.책에 있는 내용
//		 int num = (int) (Math.random()*6)+1;
//		 2.random 객체를 이용해서 만들기
//		 new Random ()
//		 3.보안 SecureRandom 사용

		Random random = new Random();
		
//		random.nextInt(6); // 0-5까지의 숫자 출력
//		random.nextInt(7); //0-6까지의 숫자 출력
		
		int Num1 = random.nextInt(6) + 1;
		int Num2 = random.nextInt(6) + 1;
		int Num3 = random.nextInt(6) + 1;
		int Num4 = random.nextInt(6) + 1;
		int Num5 = random.nextInt(6) + 1;
		int Num6 = random.nextInt(6) + 1;

		System.out.println(Num1);
		System.out.println(Num2);
		System.out.println(Num3);
		System.out.println(Num4);
		System.out.println(Num5);
		System.out.println(Num6);

	}

}
