package ex2;
/*
 * 	Ex1_Child
 */
public class Ex1_Child extends Ex1_Parent{
	
	//2. Object 의 메서드를 재정의 한것
	
	@Override
	public String toString() {
		return String.valueOf("상속 받은 금액:" + getPay());
	}
	
	//1. 재정의를 해야만 Ex_Parent 를 상속받을 수 있다.
	@Override
	public void moveMountain() {
		System.out.println("산을 성공적으로 옮긴 후 " + toString()+ "받았다");
		
	}	
}
