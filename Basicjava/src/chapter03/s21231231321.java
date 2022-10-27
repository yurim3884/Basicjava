package chapter03;

import java.util.Scanner;

public class s21231231321 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("아이디: ");
		String name = scanner.nextLine();
		
		System.out.println("패스워드: ");
		String strPaString=scanner.nextLine();
		int password =Integer.parseInt(strPaString);
		
		if("java".equals(name)) { //(name.equals("java")) <-null값일 경우 오류 발생
			if (password==12345) {
				System.out.println("로그인성공");
				}else {
					System.out.println("로그인실패 : 패스워드가 틀림");
				}
		}else {
			System.out.println("로그인 실패 : 아이디 존재하지 않음");
		}
		scanner.close();	
	}
	
}
