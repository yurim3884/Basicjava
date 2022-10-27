package chapter07;

public class DmbCellPhone extends CellPhone {

	// 필드
	int channel;

	// 생성자
	DmbCellPhone(String model, String color, int channel) {
		//CellPhone 클래스로부터 상속받은 필드
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	// 메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB방송 수신을 시작합니다");
	}

	void changeChannelDmb(int channel) {
		System.out.println("채널 " + channel + "번으로 바꿉니다");
	}

	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다");
	}
}
