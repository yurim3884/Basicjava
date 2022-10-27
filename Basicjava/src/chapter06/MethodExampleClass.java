package chapter06;

public class MethodExampleClass {
	double divide(int x, int y) {
//		return (double) x / y;
		//= int x =10; int y=10;
		
		double result =(double)x/y; //3
		return result;} //4
	
	//jdk1.5 부터 가변인수 개념 도입
	///int...nums    
	//nums라는 변수는 내부적으로 배열로 관리
	

	void run(int...nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		double divide=divide(10, 20); //5
		System.out.println(divide);  //6
	}
	
	public static void main(String[] args) {
		MethodExampleClass class1 = new MethodExampleClass(); //1
		class1.run(1,2,55); //2
		//예전 class1.run(new int[] {1,2,3,4});
		
	}
}


//실행이 완료되는 순서 
//12번라인 8번라인보다 실행은 먼저 되지만 divide(10, 20) 호출이 먼저되기때문에 8번부터 완료가된다
//main부터 실행된다 
//메인에 실행되고 run호출 run에서 divide 호출 -> divide 먼저 실행 되고 run 실행 