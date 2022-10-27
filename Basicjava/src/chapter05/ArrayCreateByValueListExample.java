package chapter05;

public class ArrayCreateByValueListExample {
	public static void main(String[] args) {
		
		int[] scores= {83, 90, 87,66,13};
		
		System.out.println("scores[0]: " +scores[0]);
		System.out.println("scores[1]: " +scores[1]);
		System.out.println("scores[2]: " +scores[2]);
		
		int sum=0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : "+sum);
		double avg =(double) sum/3;
		System.out.println("평균 : "+avg);
		
		//scores[5]=100; //오류
		//배열의 개수가 정해져있기때문에 오류

	}

}
