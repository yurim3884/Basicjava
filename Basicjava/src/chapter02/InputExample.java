package chapter02;

//import Scanner 가 떠야 Scanner사용가능
import java.util.Scanner;

public class InputExample {
	public static void main(String[] args) {
		//입력 input
		//system.in.read();
		//단점 : 한글자씩밖에 입력불가 
		//scanner 클래스 이용  - (키보드로)데이터를 입력받아 원하는 타입으로 받아준다
		
		//스캐너 사용
		 Scanner scanner = new Scanner(System.in);
		 
		 //이름 
		 System.out.println("이름을 입력하세요: ");
		 String name =scanner.nextLine(); //문자열로 반환
		 //나이
		 System.out.println("나이를 입력하세요: ");
		 int age =scanner.nextInt(); 
		 //출력
		// System.out.println("당신의 이름은 "+name+"입니다");
		 //System.out.println("당신의 나이은 "+age+"입니다");
		 System.out.println("당신의 이름은"+name+"이고 \n당신의 나이는"+ age +"입니다");
	}

}
