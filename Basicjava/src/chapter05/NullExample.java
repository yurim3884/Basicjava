package chapter05;

import java.util.Scanner;

public class NullExample {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//		String str = null;
//		System.out.println(str);
//		
//		int length= str.length();
//		
//		System.out.println("파일 길이: "+length); //NullPointerException

		String str = null;
		System.out.println(str);
		String name = scanner.nextLine();
		if (name.equals("java")) {
			str = scanner.nextLine();
		}
		if (str != null) {

			int length1 = str.length();

			System.out.println("파일 길이: " + length1); // NullPointerException
		}scanner.close();
		
		System.out.println(str);
		
	}

}
