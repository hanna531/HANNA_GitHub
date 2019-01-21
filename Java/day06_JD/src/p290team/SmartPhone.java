package p290team;

public class SmartPhone extends CellPhone {
	private double temp;

	SmartPhone(String model, String color, double temp) {
		setModel(model);
		setColor(color);
		setTemp(temp);
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}
	
	//------------------------------------------//
	
	void turnOnApp() {
		System.out.println("�µ��� ������ �����մϴ�.");
	}

	void printTemp(double temp) {
		this.temp = temp;
		System.out.println("���� �µ��� " + temp + "�� �Դϴ�.");
	}

	void turnOffApp() {
		System.out.println("�µ��� ������ ���ϴ�.");
	}

}
