package chapter02;

public class VariableUseExample {
	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		
		System.out.println(hour+"시간"+minute+"분");
		//printf (포맷형식) 활용 예제
		//정수 d 실수 f 문자열 s 
		System.out.printf("%d시간 %d분\n",hour,minute);
		System.out.printf("%02d:%02d\n",hour,minute);
		
		int totalMinute =hour *60 +minute;
		System.out.println("총"+totalMinute+"분");
	}
}
