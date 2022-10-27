package chapter06_;

public class Time {

	private int hour;
	private int minute;
	private int second;

	public Time() {
		return;
	}

	public Time(int hour, int minute, int second) {

		this.hour = hour;
		this.minute = minute;
		this.second = second;

		if (hour >= 0 && hour < 24) {
			this.hour = hour;
			// return;
		} else {
			this.hour = 0;
		}

		if (minute >= 0 && minute < 60) {
			this.minute = minute;
			// return;
		} else {
			this.minute = 0;
		}

		if (second >= 0 && second < 60) {
			this.second = second;
			// return;

		} else {
			this.second = 0;
		}
	}
	//필드안의 모든 객체를 문자열로 출력하는데 사용한다 
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}
