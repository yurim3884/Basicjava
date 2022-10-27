package chapter05;

public class InputDataArrayExample {

	public static void main(String[] args) {

		int[] numArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// 배열 안의 데이터 변경
		numArr[4] = 100;

		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}

		// 많이 사용한다
		int[] nums = new int[10];
		// 배열 안의 데이터 변경
		nums[6] = 40;

		for (int i = 0; i < nums.length; i++) {
			System.out.println("nums[" + i + "]: " + nums[i]);
		}

		byte[] bytes; // 배열선언
//		bytes = {1,2,3,4,5}; //배열에서 리터럴 형식으로 초기화 할때는 선언과 동시해 해야한다
		bytes = new byte[] { 1, 2, 3, 4, 5 };
	}

}
