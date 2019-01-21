package ex1;

public class Ex3_ClassDemo {

	/*
	 * Team A: method 를 사용해서 pay를 저장할수 있는 권한을 줌 (read, write)
	 * Team B: a에서 저장된 pay값을 보여줌 (read only)
	 * A, B 팀이든 pay란 자원에 직접 접근하지 못하도록 한다.
	 */
	
	private int pay;
	
	//this : 현재 클래스의 주소를 참조 (자신의 주소값)
	public void insertPay(int pay, String pwd) {
		if (pwd.equals("1")) {
			//멤버필드의 pay = 지역변수 pay
			this.pay = pay;
		} else {
			System.out.println("경고메세지!");
		}
		
	}
	
	//멤버 필드의 pay값을 변환해 주는 함수
	public int viewPay() {
		return pay;	//pay의 값만을 
	}
	
	public void viewPay2() {
		System.out.println(pay); //pay 값을 print로 출력함
	}

}
