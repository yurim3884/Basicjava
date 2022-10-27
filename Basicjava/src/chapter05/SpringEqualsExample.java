package chapter05;

public class SpringEqualsExample {
	public static void main(String[] args) {
		
		String strVar1 ="신민철";
		String strVar2 ="신민철";
		
		System.out.println(strVar1==strVar2);
		//리터럴 형식("")으로 만든 스트링객체는 나중에 만든 글씨와 처음 글씨가 겹치면 저장이 안된다
		//같은 부모(string)을 참조하고 있기때문에 true가 나온다
		
		
		String strVar3 =new String("신민철");
		String strVar4 =new String("신민철");

		System.out.println(strVar3==strVar4);
		// 두 개의 문자가 각각 다른 곳에 저장되므로 각각 저장
		// 각자 다르게 저장되기때문에 false
		
		System.out.println(strVar3.equals(strVar4)); 
		//string 타입을 비교할 때는 equals를 사용하는 것이 좋다
	}

}
