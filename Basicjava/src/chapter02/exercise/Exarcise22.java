package chapter02.exercise;


public class Exarcise22 {
	public static void main(String[] args) {
		double distance = 40e12;
		double light = 300_000; // km/s
		//걸리는 시간 => 거리 / 속도
		//빛의 속도  : 년

		
		double time=(distance/light)/356/24/60/60;
				
		System.out.println("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 " +time +"광년이다.");
	}
}
