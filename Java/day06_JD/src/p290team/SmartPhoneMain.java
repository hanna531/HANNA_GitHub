package p290team;

public class SmartPhoneMain {
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("����Ʈ��", "ȭ��Ʈ", -1.4);

		System.out.println("����Ʈ�� ��: " + smartPhone.getModel());
		System.out.println("����Ʈ�� ����: " + smartPhone.getColor());

		System.out.println("����µ�:" + smartPhone.getTemp());

		smartPhone.powerOn();
		smartPhone.bell();
		smartPhone.sendVoice("��������.");
		smartPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���.");
		smartPhone.sendVoice("��~ �� �ݰ����ϴ�.");
		smartPhone.hangUp();

		smartPhone.turnOnApp();
		smartPhone.printTemp(-1.4);
		smartPhone.turnOffApp();

	}
}