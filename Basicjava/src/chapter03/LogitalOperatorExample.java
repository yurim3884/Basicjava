package chapter03;

public class LogitalOperatorExample {
	public static void main(String[] args) {
		
		int charCode ='A';
		
		//& | 1조건식에서 이미 조건식이 결정이 되어도 계속해서 계산
		
		if ((charCode>=65)&(charCode<=90)) {
			System.out.println("대문자군요");
		}
		//&& 앞의 값이 F일때 뒤의 값 계산 안 함
		if ((charCode>=97)&&(charCode<=122)) {
			System.out.println("소문자군요");
		}
		
		if ((charCode>=48)&& !(charCode<=90)) {
			System.out.println("0~9 숫자군요");
		}
		
		int value =6;
		
		if((value%2==0)| (value%3==0)) {
			System.out.println("2 또는 3의 배수군요");
		}
		//|| 앞의 값이 t이면 뒤의 값 계산 안 함
		if((value%2==0)|| (value%3==0)) {
			System.out.println("2 또는 3의 배수군요");
			
		}
	}
}
