package chapter05;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		// (String[] args) = String[] args = {}; = String[] args = new String[0];

		// System.out.println("args[0]" + args[0]);
		// System.out.println("args[1]" + args[1]);  ->오류
		
		int num1 =Integer.parseInt(args[0]);
		int num2 =Integer.parseInt(args[1]);
		System.out.println(num1 +num2);
		
		//한 번 실행후 run configuration argument에 값 입력 후 실행 
		
		
	}

}
