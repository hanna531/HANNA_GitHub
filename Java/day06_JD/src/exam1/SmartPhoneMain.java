package exam1;

public class SmartPhoneMain {
	public static void main(String[] args) {
		//	SmartPhone ��ü ����
		SmartPhone sp = new SmartPhone("�ڹ���", "����", false);
		
		//	CellPhone���� ���� ��ӹ��� �ʵ�
		System.out.println("��: " + sp.getModel());
		System.out.println("����: " + sp.getColor());
		
		//	SmartPhone�� �ʵ�
		System.out.println("ȫä ��: " + sp.isEye());
		
		//	CellPhone���κ��� ��ӹ��� �޼ҵ� ȣ��
		sp.powerOn();
		sp.bell();
		sp.sendVoice("�ȳ��ϼ���");
		sp.receiverVoice("��");
		sp.sendVoice("Ȯ�� ��");
		sp.hangUp();
		
		//	SmartPhone�� �޼ҵ�
		sp.checkEye(true);
		sp.checkEye(false);
		System.out.println(sp.checkEye2(true));
		System.out.println(sp.checkEye2(false));
		
	}
}
