package chapter05Exercise;

public class ExerciseArray01 {
	public static void main(String[] args) {
		
		int[] array= {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
		
//		int max=0;
//		int min =array[0];
		int max1=Integer.MIN_VALUE;
		int min1 =Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]>max1) {  //큰게 앞으로 가는 것이 좋아
				max1=array[i];
			}
			if(min1>array[i]) {
				min1=array[i];
			}
		}
//		System.out.println("최댓값: "+max);
//		System.out.println("최솟값: "+min);
		System.out.println("최댓값: "+max1);
		System.out.println("최솟값: "+min1);
		
		
	}

}
