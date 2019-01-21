package ex2;

public class Ex1_MemberInner extends SuperA{
	//	기본 접근 제한자.
	int numA;
	
	//	클래스 내부에서만 접근이 가능
	private int numB;
	static int numC;
	
	//	메서드
	public Ex1_MemberInner() {
		numA = 10; numB = 100; numC = 200;
	}
	
	//	멤버 영역에 클래스를 정의 : 멤버 내부 클래스
	public class Inner extends SuperB{			//	내부클래스에서 다른 클래스를 불러올수 있음
		public void printData() {
			System.out.println("int A: "+numA);
			System.out.println("int B: "+numB);	//	private인 아우터 클래스에 접근가능하다.
			System.out.println("int C: "+numC);
		}
	}
}
