package chapter06;

import java.util.Arrays;

public class StaticRunExample {
	public static void main(String[] args) {
		StaticExample.main(args);
//		run();
		StaticRunExample example = new StaticRunExample();
		example.run();
		
		Arrays[] arrays;
		//메소드에서 힙 영역을 사용할려면 선언을 해줘야한다 
	}

	void run() {
		main(null);
		// StaticRunExample.main(null);
		System.out.println("run 메소드 실행");
	}
}
