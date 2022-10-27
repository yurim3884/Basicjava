package chapter02;


public class variableExchangingExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x: "+x+"\ty: "+ y);
		
		//temp  라는 변수에 x를 옮긴 후 x y 바꿈
		
		int temp =x ;
		//temp라는 변수에 x 대입
		x=y;
		//비어진 x에 y대입
		y =temp ;
		//x에서 옮겨진 temp를 y에 대입
		
		System.out.println("x: "+ x+"\ty: "+ y ); 
		
		System.out.println("자바는" ); 
		System.out.println("\n재미있는 \"프로그래밍\"언어\n" ); 
		System.out.println("입니다" );

	}
}
