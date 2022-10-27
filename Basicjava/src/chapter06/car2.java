package chapter06;

public class car2 {
	//필드
	private int speed;
	private boolean stop;
	
	//생성자
	
	//메소드
	
	public int getspeed() {
		return speed;
	}
	public void setspeed(int speed) {
		if (speed<0) {
			this.speed =0;
			return;
		}else {
			this.speed=speed;
		}
	}
	public boolean isstop() {
		return stop;
	}

	public void setstop(boolean stop) {
		this.stop = stop;
		this.speed=0;
	}
}
