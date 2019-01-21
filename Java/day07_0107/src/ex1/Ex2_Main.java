package ex1;

public class Ex2_Main extends Ex2_WindowDemo{
	public static void main(String[] args) {
		Ex2_Main ref = new Ex2_Main();
		ref.exec1();
	
//	2. 추상 메서드를 직접 익명 내부 클래스로 재정의를 할 경우
	new Ex2_WindowDemo() {
		
		@Override
		public void exec1() {
			System.out.println("다른 방법");
			
		}
	}.exec1();

}
	@Override
	public void exec1() {
		System.out.println("결정 메서드를 정의해서 사용!");
	}
	@Override
	public void exec3() {
		System.out.println("확인용");
		super.exec3();
	}
	
}
