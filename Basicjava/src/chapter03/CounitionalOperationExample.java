package chapter03;

public class CounitionalOperationExample {
	public static void main(String[] args) {
		int score =95;
		char grade =(score>90)? 'A' :((score>80) ? 'B' : 'C');
		
		System.out.println(score +"점은 "+grade+"등급입니다");
		
		float var1 = 10f;
		float var2 =var1 /100;
		if(var2==0.1f) {
			System.out.println("10%");
		}else {
			System.out.println("!");
		}
		
		
	}

}
