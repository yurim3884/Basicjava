package chapter04;

public class whileExample {
	public static void main(String[] args) {

		// 반복 횟수가 정해지지않을때 주로 사용
		//같은 식 for문사용법

//		for (int i=1; i<=10; i++) {
//			System.out.println(i);

		int i = 1;

		while (i <= 10) {
			System.out.println(i);
			i++;
		}
	}
}
