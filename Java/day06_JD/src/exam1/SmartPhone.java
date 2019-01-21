package exam1;

public class SmartPhone extends CellPhone{
	//	필드
	private boolean eye;
	
	//	생성자

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
		System.out.println("홍채인식을 시작합니다.");
		if (this.eye == true) {
			System.out.println("성공입니다.");
		} else {
			System.out.println("실패입니다. 다시 인식해주세요.");
			this.powerOff();
		}
	}
	
	String checkEye2(boolean eye) {
		String result;
		if (eye == true) {
			result = "성공입니다.";
			return (result);
		} else {
			result = "실패입니다. 다시 인식해주세요.";
			return (result);
		}
		
	}
	
	
}
