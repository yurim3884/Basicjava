package chapter04;

public class ContinueExample {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			// for (int i = 2; i <= 10; i+2) { // if 문을 활용하지 않고 출력

			if (i % 2 != 0) { // 짝수출력
				// if(i % 2==0) { //홀수출력
				continue; // (i % 2 != 0) 홀수이면 continue해라
				// break; 짝수가 되는 순간 break => 2로 시작하므로 출력값 X
			}
			System.out.println(i); // continue 조건이 거짓일 때 출력
		}
	}
}
