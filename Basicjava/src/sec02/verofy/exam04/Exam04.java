package sec02.verofy.exam04;

public class Exam04 {
	public static void main(String[] args) {

		int[] array = { 1, 5, 3, 8, 2 };
		
		int max = array[0];
		int min = array[0];

		for (int i = 0; i < array.length; i++) {
			if(max<array[i]) {
				max=array[i];
			}
			if(min>array[i]) {
				min=array[i];
			}
		}
		
		
		System.out.println("max: " + max);
		System.out.println("min: " + min);

	}
}
