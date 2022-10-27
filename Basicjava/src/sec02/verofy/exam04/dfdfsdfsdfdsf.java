package sec02.verofy.exam04;

public class dfdfsdfsdfdsf {
	public static void main(String[] args) {
		int [] array= {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
		
		int max=0;
		int min=array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]>max) {
				max=array[i];
			}
			if (min>array[i]) {
				min=array[i];
			}
		}System.out.println("최댓값은 "+max);
		System.out.println("최솟값은 "+min);
	}

}
