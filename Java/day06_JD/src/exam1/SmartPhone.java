package exam1;

public class SmartPhone extends CellPhone{
	//	�ʵ�
	private boolean eye;
	
	//	������

	public SmartPhone(String model, String color, boolean eye) {
//		this.model = model;
//		this.color = color;
		this.setModel(model);
		this.setColor(color);
		this.eye = eye;
	}

	//	POJO
	public boolean isEye() {
		return eye;
	}

	public void setEye(boolean eye) {
		this.eye = eye;
	}

	//	Method
	
	void checkEye(boolean eye) {
		this.eye = eye;
		System.out.println("ȫä�ν��� �����մϴ�.");
		if (this.eye == true) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("�����Դϴ�. �ٽ� �ν����ּ���.");
			this.powerOff();
		}
	}
	
	String checkEye2(boolean eye) {
		String result;
		if (eye == true) {
			result = "�����Դϴ�.";
			return (result);
		} else {
			result = "�����Դϴ�. �ٽ� �ν����ּ���.";
			return (result);
		}
		
	}
	
	
}
