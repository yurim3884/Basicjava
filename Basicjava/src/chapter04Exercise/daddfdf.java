package chapter04Exercise;

import java.util.Scanner;

public class daddfdf {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("가위 바위 보 게임");

		System.out.println("철수: ");
		String c = scanner.next();
		System.out.println("영희: ");
		String y = scanner.next();
		
		String result="";
		
		if(c.equals(y)) {
			result="비김";
			
		}else if(c.equals("가위") && y.equals("바위") ||
				c.equals("보") && y.equals("가위") ||
				c.equals("바위") && y.equals("보") ) {
			result=" 영희 승리 ";
		}else if(c.equals("가위") && y.equals("보") ||
				c.equals("보") && y.equals("바위") ||
				c.equals("바위") && y.equals("가위") ) {
			result=" 철수 승리 ";
		}else {
			result = "오류";
		}
		System.out.println("결과: "+result);
		scanner.close();
		
	}

}
