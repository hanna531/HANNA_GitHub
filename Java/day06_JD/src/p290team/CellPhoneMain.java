package p290team;

public class CellPhoneMain {
	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
//	CellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10); �̷��� �ϸ� ����


		System.out.println("��: " + dmbCellPhone.getModel());
		System.out.println("����: " + dmbCellPhone.getColor());

		System.out.println("ä��: " + dmbCellPhone.getChannel());

		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������.");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���.");
		dmbCellPhone.sendVoice("��~ �� �ݰ����ϴ�.");
		dmbCellPhone.hangUp();

		dmbCellPhone.turnOffDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	

	}
}
