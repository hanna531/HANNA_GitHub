package ex2;

public class Ex4_Microwave {

	boolean power; // true: on/false:off
	int time; //전자레인지의 작동 시간
	int watt; //전자레인지의 강약조절
	//setPower 가 호출 될 떄 인자 값으로 boolean 값을 받아서
	//멤버 필드 power 에 저장하고 그 값을 판별한 후 적절한 출력을 담당.
	public void setPower(boolean p) {
		//멤버변수에 저장
		power = p;
		if (p == true) { //프로그램으로 실행!
			System.out.println("전자레인지가 켜졌습니다.");
		} else {
			System.out.println("전자레인지가 꺼졌습니다.");
		}
	}
	//멤버 필드 time을 셋팅시킴
	public void setTime(int t) {
		time = t;
	}
	//멤버 필드 watt을 셋팅시킴
	public void setWatt(int w) {
		watt = w;
	}
	public String viewControl() {
		int m = time/60;
		int s = time%60;

		return "전자레인지 상태: 설정시간 "+m+"분"+s+"초, 전력:"+watt+ "W 입니다.";
	}
}
