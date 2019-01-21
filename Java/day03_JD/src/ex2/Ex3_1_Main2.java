package ex2;

import java.util.Scanner;

public class Ex3_1_Main2 {
	//1. 메인 메서도를 정의 (JVM이 실행)
	public static void main(String[] args) {
		/*2.Ex3_Remocon 클래스를 객체로 생성하자.
		*	참조자료형 참조변수 = new 생성할객체();
		*	stack에서 선언된 Ex3_Remocon을 참조자료형으로 한
		*	변수 er 에는 Heap 영역에 new 연산자로 생성된 객체의 주소 (100) 이
		*	저장 되어 있다. 그러므로 er 변수로 Ex3_Remocon겍체를 참조해서 사용할 수 있다.
		*/
		Ex3_Remocon er = new Ex3_Remocon();
		//3.UI
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("전원켜기 1, 전원끄기 2 :");
			String powerMsg = sc.nextLine();
			if (powerMsg.equals("1")) {
				System.out.println("현재 채널값은: " + er.viewControl());
				er.setPower(true);
				System.out.println("채널 값 :");
				int chNumber = Integer.parseInt(sc.nextLine());
				er.setChNum(chNumber);
				System.out.println("변경된 채널값은: "+ er.viewControl());
			} else if (powerMsg.equals("2")){
				er.setPower(false);
				System.out.println(er.viewControl()+" 채널을 기억합니다.");
				break;
			} else {
				System.out.println("잘못된 번호 입니다.");
			}
		}
		
	}
}
