package ex2;
/*
 * 	Ex1_Parent : 추상 메서드를 가진 클래스는 반드시 추상 클래스이다.
 */
public abstract class Ex1_Parent {			//	abstract class 생성함.
	//	상속 받을 자원
	private final int pay = 1000000;
	//	추상 메서드 : 미션!
	public abstract void moveMountain();	//	abstract method이기 때문에 abstract class
											//	가 필수적으로 들어가야함!
	//	public void moveMountain() {}
	
	public int getPay() {
		return pay;
	}
	
}
