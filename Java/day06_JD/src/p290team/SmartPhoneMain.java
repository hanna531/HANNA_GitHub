package p290team;

public class SmartPhoneMain {
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("스마트폰", "화이트", -1.4);

		System.out.println("스마트폰 모델: " + smartPhone.getModel());
		System.out.println("스마트폰 색상: " + smartPhone.getColor());

		System.out.println("현재온도:" + smartPhone.getTemp());

		smartPhone.powerOn();
		smartPhone.bell();
		smartPhone.sendVoice("여보세요.");
		smartPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		smartPhone.sendVoice("아~ 예 반갑습니다.");
		smartPhone.hangUp();

		smartPhone.turnOnApp();
		smartPhone.printTemp(-1.4);
		smartPhone.turnOffApp();

	}
}