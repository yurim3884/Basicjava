package chapter03;


public class CompareOperatorExample {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 =num1==num2;
		boolean result2 =num1 !=num2;
		boolean result3 =num1<=num2;
		
		char char1 = 'b'; //A=65/a=97/0=48/b=98
		char char2 ='B'; //B=66
		boolean result4 = char1<char2;
		
		//double v2=0.1;
		//float v3 =0.1f;
		//System.out.println(v2 ==(double)v3);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}
