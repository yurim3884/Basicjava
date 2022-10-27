package chapter05;

import java.util.Arrays;

public class AdvancedForExample {
	public static void main(String[] args) {

		int[] scores = { 95, 71, 84, 93, 87 };

		int sum = 0;
		int sum1 = 0;

		// 1. 기본 for 문
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum);

		// 2. 향상된 for 문 (Advenced for Loop): foreach
		// there is something(score) in(:) everything.(scores)
		for (int score : scores) {
			// scores에서 자동으로 순차적으로 숫자 출력
			// 꺼내온 데이터 저장 score
			// scores 에서 score 출력

			sum1 += score;

			System.out.println(sum1);
			double avg = ((double) sum1 / scores.length);
			System.out.println(avg);

		}

		// 3. forEach 메소드 이용
		// jdk 1.8에 string + lambda를 이용하여 함수형 프로그래밍 구현
		// 많이 사용
		// 속도가 느릴 수 있다
		// Arrays.asList(scores).forEach(null);

	}

}
