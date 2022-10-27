package chapter02;

public class PrintfExample {
	public static void main(String[] args) {
		
		//출력 output
		//뒤에있는 숫자가 %d에 들어감
		System.out.printf("%d:%d\n",9,5);
		//1자리 숫자 2자리로 출력 빈 공간에 0 채움
		System.out.printf("%02d:%02d\n",9,5);  //=>결과값 09:05
		//숫자에 ,를 적어주기 
		System.out.printf("%,d\n",1000000); //=>결과값 1,000,000
		
		//String.format을 통해 문자열로 변환 
		//많이 사용
		String ht = String.format("%,d",1000000);
		System.out.println(ht);
	}
}
