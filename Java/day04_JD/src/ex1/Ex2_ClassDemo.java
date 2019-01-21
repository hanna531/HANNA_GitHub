package ex1;
/*
 * 	클래스 구성
 * 	1. 해더
 * 	2. 멤버필드		(속성)
 * 	3. 멤버메서드	(동작)
 * 	클래스는 객체지향으로 설계(재사용), 통상 메인메서드는 포함되지 않는다.
 */
public class Ex2_ClassDemo {
	// ***** 멤버필드는 선언과 동시에 초기화 됨!
	int pay;
	String team;
	
	/*
	 * 	메서드를 한번 만들어 (정의해)보면서 의미를 파악해봅시다.
	 * 
	 */
	public void test() { //	Ex2_ClassDemo클래스가 객체로 생성된 이후
		System.out.println("pay : " + pay +" ;Team : "+ team);	//Pay : 0, Team : null
	}
	
	// 테스트 후 18 ~ 21 라인을 주석 처리하고 Ex2_Main 클래스를 만들어서 구현
	
	/*	
	 * 	의미 있는 작업으로 메서드를 정의 해봅시다.
	 * 	pay에 어떤 값을 멤버변수에 저장할 수 있도록 제공하는 메서드 만들기 (개념화)
	 *	변환형을 결정할 때 고민해야 할것 : 메서드 호출 후에 특정 값을 반환 받을 것인지
	 *	받을값이 없으면 메서드만 수행 할 것인지......
	 * 	값을 넣는 작업에 대해서 반환값을 받을 필요가 없다고 생각해서 void라고 결정했음......
	 */
	
	public void insertPay(int pay) {//	인자가 있음 int pay = 지역변수 또한 멤버변수 pay와 충돌 X
									//	멤버변수와 이름이 같을때 지역변수가 우선적으로 작동됨
		System.out.println("LOG1: 지역변수 pay : " + pay);
		System.out.println("LOG2: 멤버변수 pay : " + this.pay);
	}
	
	public void insertPay2(int p) {
		System.out.println("LOG1: 지역변수 pay : " + p);
		System.out.println("LOG2: 멤버변수 pay : " + pay);
	}
	
	public void insertPay3(int p) {
		pay = p;
		System.out.println("LOG1: 지역변수 pay : " + p);
		System.out.println("LOG2: 멤버변수 pay : " + pay);
	}
	
	/*
	 * 	해보기1: 이번에는 team에 값을 저장하는 메서드를 만들어 봅시다.
	 * 	해보기2: 이번에는 pay, team의 값을 동시에 저장하는 메서드를 만들어 봅시다.
	 */
	
	public void insertTeam(String t) {
		team = t;
		System.out.println("저장된 team의 값은: " + team);
	}
	
	public void insertPayTeam(int p, String t) {
		pay = p;
		team = t;
		System.out.println("저장된 pay의 값은: " + p);
		System.out.println("저장된 team의 값은: " + team);
	}
	
	public String insertTeam2() {
		return team;
		
	}
}
