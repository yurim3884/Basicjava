package chapter04;

import java.util.Random;

public class SwichExample {
	public static void main(String[] args) {
		Random random = new Random();

		int Num1 = random.nextInt(6) + 1;
		
//		Switch case 제약사항
//		switch()
//		boolean,float,double 사용 불가
		

		switch (Num1) {
		case 1:
			System.out.println("1번이 나왔습니다");
			break;
		case 2:
			System.out.println("2번이 나왔습니다");
			break;
		case 3:
			System.out.println("3번이 나왔습니다");
			break;
		case 4:
			System.out.println("4번이 나왔습니다");
			break;
		case 5:
			System.out.println("5번이 나왔습니다");
			break;
		default:
			System.out.println("6번이 나왔습니다");
			break;
		}
	}
}
