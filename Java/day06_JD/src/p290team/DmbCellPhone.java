package p290team;

public class DmbCellPhone extends CellPhone {
	private int channel;
	
	DmbCellPhone(String model, String color, int channel){
		setModel(model);
		setColor(color);
		setChannel(channel);
	}

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

	public DmbCellPhone(){
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
}
