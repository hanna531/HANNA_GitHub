package exam1;

public class DmbCellPhone extends CellPhone{
	//	필드
	private int channel;
	
	//	생성자
	
	SmartPhone sp = new SmartPhone("자바폰", "검정색", false);
	public DmbCellPhone(String model, String color, int channel) {
//		this.model = model;
//		this.color = color;
		this.setModel(model);
		this.setColor(color);
		this.channel = channel;
	}

	//	POJO
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	//	Method
	
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}

}
