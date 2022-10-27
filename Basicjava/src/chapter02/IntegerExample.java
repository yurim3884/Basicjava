package chapter02;

public class IntegerExample {
	public static void main(String[] args) {
		int val1 = 100;
		int val2 = 200;
		//int var3 = 300; 300 ctrl+ 1
		
		int var3 = val1 + val2;
		
		byte var4 = -128;
		//byte var4 = -130; ctrl+ 1을 이용해 오류남 int로 바꾸던지 숫자를 바꿔야함
		int var5 = -130;
		//단위 구분할 때 _ 넣어도된다
		long i = 100_000_000_000L; 
		//=>리터럴 (literal) 정수는 int 실수는 double이 기본
		//리터럴 프로그래머에 의해 직접 입력된 값 / 변하지않는 값 / =상수
		//어떤 숫자 데이터를 변수로 입력될 때의 그 값 자체
		//롱타입이라는 것을 알려줘야함 숫자뒤에L(대 소문자 다 가능) 100_000_000_000L 주로 대문자 사용
		//		long i = 100000000;  
		
		double var8 = 100_000_000_000L;
		//int가 표현할 수 있는 범위보다 벗어나므로 f d L 을 사용해야한다
		
		float var6 = 10.1f;
		//기본형이 double이므로 더블 타입으로 바꾸던지 숫자 뒤에 f입력하여 float타입임을 선언한다 
		double var7 = 10.1D;
		//숫자 뒤에 D 생략가능 하지만 int 에는 i 입력 불가 
		
		//사용하지 않은 변수에는 에러가 뜬다 
		System.out.println(var3);
	}
}
