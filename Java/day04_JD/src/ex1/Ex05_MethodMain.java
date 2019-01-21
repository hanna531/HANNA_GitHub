package ex1;

public class Ex05_MethodMain {

	public static void main(String[] args) {
		Ex05_MethodDemo ref = new Ex05_MethodDemo();
		Ex05_ColorOffice eo1 = new Ex05_ColorOffice();//A
		Ex05_ColorOffice eo2 = new Ex05_ColorOffice();//B
		Ex05_ColorOffice eo3 = new Ex05_ColorOffice();//C
		
		//메서드 인자값으로 우리집의 주소를 각각 전달한다면
		//같은 주소를 보고 있다는 개념
		eo1.jobPaint(ref, "노란색");
		eo2.jobPaint(ref, "빨간색");
		eo3.jobPaint(ref, "보라색");
		//메모리 구조를 그리면서 왜 레드가 나오는지 생각
		System.out.print("색상확인: " + ref.viewColor());
		//같은 주소를 바라보고 있다가 결론적으로 보라색을 출력
	}

}
