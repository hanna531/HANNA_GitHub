package exam1;

public class DmbCellPhone extends CellPhone{
	//	�ʵ�
	private int channel;
	
	//	������
	
	SmartPhone sp = new SmartPhone("�ڹ���", "������", false);
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
		System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}

}
