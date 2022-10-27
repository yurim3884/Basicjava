package chapter02;

public class VariableExample {
	public static void main(String[] args) {
		//변수 선언  type + 변수이름 ;
		//데이터 종류 (type)를 선언 할 때 알려줌
		int number1 = 0 ; //선언 및 초기화  
		int number2 = 0 ;
		
		//변수 초기화
		//type 선언은 하지않아도된다
		//number1 = 715;
		//number2 = 328;
		
		//연산
		// 대입연산자 (=) 오른쪽에 있는 값을 왼쪽에 대입(할당,assignment) 
		//number1 * number2를 reult에 대입한다 
		int result = number1 * number2;
		System.out.println( result );
		//System.out.println( number1 * number2 );
	}
}
