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
		System.out.println("온도계 어플을 실행합니다.");
	}

	void printTemp(double temp) {
		this.temp = temp;
		System.out.println("현재 온도는 " + temp + "도 입니다.");
	}

	void turnOffApp() {
		System.out.println("온도계 어플을 끕니다.");
	}

}
