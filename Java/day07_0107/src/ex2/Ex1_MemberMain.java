package ex2;

public class Ex1_MemberMain {
	public static void main(String[] args) {
		/*
		 * 	핵심포인트 *************************************
		 * 	내부 클래스를 생성하려고 할 떄는
		 * 	외부 클래스를 생성한 후 그 주소를 참조해서
		 * 	다시 내부 클래스를 생성하는 방식이다.
		 * 	1. 외부 클래스 생성
		 */
		Ex1_MemberInner outer = new Ex1_MemberInner();
		
		/*
		 * 	2. 외부 클래스의 주소값을 저장한 참조 변수 outer를
		 * 	내부 클래스를 생성
		 */
		outer.superA();					//	SuperA에서 정의된 메서드를 호출
		Ex1_MemberInner.Inner inner;	//	내부 클래스의 형태를 가진 변수 inner정의
		inner = outer.new Inner();		//	정의된 변수에 
		inner.printData();
		inner.superB();
		System.out.println("====================================");
		
		/*
		 * 	연습문제)
		 * 	외부클래스 생성 후 내부 클래스 생성하고자 할때
		 * 한줄로 생성하고 바로 printData()
		 */
		
		new Ex1_MemberInner().new Inner().printData();
	}
}
