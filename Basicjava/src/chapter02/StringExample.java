package chapter02;

public class StringExample {
	public static void main(String[] args) {
		String name ="홍길동";
		String job = "프로그래머";
		
		String contents = "홍\\길\\동\n님\r직업:\t \"프로그래머\"";
		// \n \r = 줄바꿈 \t 탭 \" 큰따음표 \' 작은 따음표  (그냥 사용가능 ) \\ \입력 

		//System.out.println(name + "님");
	    //System.out.println("직업 :" + job);

		System.out.println(contents);
		//결과물 
		//홍\길\동
		//님
		//직업:	 "프로그래머"
	}

}
