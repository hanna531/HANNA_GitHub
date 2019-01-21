package exam1;

public class SmartPhoneMain {
	public static void main(String[] args) {
		//	SmartPhone 객체 생성
		SmartPhone sp = new SmartPhone("자바폰", "검정", false);
		
		//	CellPhone으로 부터 상속받은 필드
		System.out.println("모델: " + sp.getModel());
		System.out.println("색상: " + sp.getColor());
		
		//	SmartPhone의 필드
		System.out.println("홍채 값: " + sp.isEye());
		
		//	CellPhone으로부터 상속받은 메소드 호출
		sp.powerOn();
		sp.bell();
		sp.sendVoice("안녕하세요");
		sp.receiverVoice("예");
		sp.sendVoice("확인 끝");
		sp.hangUp();
		
		//	SmartPhone의 메소드
		sp.checkEye(true);
		sp.checkEye(false);
		System.out.println(sp.checkEye2(true));
		System.out.println(sp.checkEye2(false));
		
	}
}
