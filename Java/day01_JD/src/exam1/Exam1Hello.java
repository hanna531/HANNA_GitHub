package exam1;

public class Exam1Hello {
	//클래스 영역
	public static void main(String[] args) {		//1
		//메인 메서드 영역
		
		/**System.out.println("안녕하세요");				
		System.out.println("반갑습니다");
		System.out.println("고진덕 이라고 합니다");
		*/
		
		System.out.println("메인 메서드 실행");			//2
		// test 메서드 호출
		test();										//3
		System.out.println("메인 메서드 종료");			//5
		
	}
	public static void test () {
		//메서드 영역
		System.out.println("test 메서드를 실행");		//4
	}

}
