package chapter02;

public class CastingExample {
	public static void main(String[] args) {
		int i = 500;
		byte b = (byte)i;
		
		System.out.println(b);
		
		double d = 3.14;
		int intvalue =(int) d;
		System.out.println(intvalue);
		
		int x =10;
		int y =3;
		//둘중의 하나가 더블이 되면 작은 int를 큰 double으로 변환
		//int result = x/y;  => 3
		double result = x/y;
		System.out.println(result);  //=>3.0
		
		byte b1 =10;
		byte b2 = 20;
		byte b3 =(byte)(b1 + b2) ;
		int intValue2 = b1 + b2;
		
		System.out.println(b3);
		System.out.println(intValue2);
		
		float f1 = 3.14f;
		//float f2 = 3.15f;
		double f2= 3.15f;
		
		float f3 =(float)(f1 +f2);
		double f4 = f1+ f2;
		
		System.out.println(f3);
		System.out.println(f4);
		
		System.out.println(3+3);
		System.out.println("3"+3+3+"3");
		System.out.println(3+"3");
		
		int a =100; //연산가능
		String str = a +"";
		//숫자를 문자로 바꿀때 사용
		System.out.println(str);
		
		//문자를 숫자로 변경할 때
		
		String str2 ="100"; //연산 불가능
		String str3 ="10e4";
		System.out.println(Integer.parseInt(str2));
		System.out.println(Double.parseDouble (str3));
		
		double pi = 3.14;
		String pistr=pi+"";
		String pistr2 =String.valueOf(pi);
		System.out.println(pistr);
		System.out.println(pistr2);
		
		//char +1하는 법 
		char c1 ='a';
		char c2 =(char)(c1+1);
		System.out.println(c2);
	
		int x2 =5;
		int y2= 2;
		double result2 = (double)x2/y2;
		System.out.println(result2);
		
		double var6 = 3.5;
		double var7 =2.7;
		int result3 = (int)(var6+var7);
		System.out.println(result3);
		
		long r = 2l;
		float rr= 1.8f;
		double rrr= 2.5;
		String rrrr ="3.9";
		int result4 =(int)( r+(int)rr+rrr+Double.parseDouble(rrrr));
		System.out.println(result4);
		
		
		
		
		
		
		
	}

}
