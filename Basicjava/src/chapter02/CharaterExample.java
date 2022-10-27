package chapter02;

public class CharaterExample {
	public static void main(String[] args) {
		//char(Charater)
		//'' 문자 1개 char "" 여러 문자 String 
		char c1 = 'a';  //실제 : 97
		//한개만 가능하다
		//char c2 = 'ab'; 
		//한글도 가능하다
		char c3 ='가'; //실제 : 44032
		//숫자에 해당되는 문자 변환
		char c4 = 65;
		char c5 = 44032;
		
		//String (문자열) => 참조 타입 
		//문자 하나만 사용할 일이 별로 없음
		//String 많이 사용
		//string 타입은 큰따음표
		String s1 = "a"; 
		
		System.out.println(c1);
		System.out.println(c4);
		System.out.println(c5);
		
	}
}
