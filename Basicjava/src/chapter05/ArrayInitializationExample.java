package chapter05;

public class ArrayInitializationExample {
	public static void main(String[] args) {
		
		int a= 0;
		System.out.println(a);
		
		
		//배열일 경우 자바에서 초기화를 하지않아도 자동적으로 초기화를 해준다
		int[] b =new int[10];
		System.out.println(b[0]);
	}

}
