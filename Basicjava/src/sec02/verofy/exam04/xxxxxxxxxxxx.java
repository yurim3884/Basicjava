package sec02.verofy.exam04;

public class xxxxxxxxxxxx {
	public static void main(String[] args) {
		
		int [] array= {1,5,3,8,2};
		int max=0;
		int min =array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]>max) {
				max=array[i];
			}
			if (min>array[i]) {
				min=array[i];
			}
		}System.out.println(max);
		System.out.println(min);
	}

}
