package chapter05;

import java.util.Scanner;

public class ReferenceTypeExample {
	public static void main(String[] args) {
		int a =10;
		int b=20;
		String c ="홍길동";
		
		Scanner scanner =new Scanner(System.in);
		
		String name = null;
		
		if (a !=10) {
			name = scanner.nextLine();
			
		}System.out.println(name);
	}

}
