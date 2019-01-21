package p290team;

public class CellPhoneMain {
	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
//	CellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10); 이렇게 하면 오류


		System.out.println("모델: " + dmbCellPhone.getModel());
		System.out.println("색상: " + dmbCellPhone.getColor());

		System.out.println("채널: " + dmbCellPhone.getChannel());

		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요.");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		dmbCellPhone.hangUp();

		dmbCellPhone.turnOffDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	

	}
}
