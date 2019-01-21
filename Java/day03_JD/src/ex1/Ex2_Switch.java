package ex1;

public class Ex2_Switch {
	public static void main(String[] args) {
		//jdk 7부터 String 문자열 비교 지원!
		String s = "B";
		boolean b = true;	//불가
		char ch = 'A';
		float f = 3.14F;	//불가
		byte bb = 10;
		double bn = 10.1;	//불가
		long ll = 10L;		//불가
		
		
		switch (s) {		//case "조건": 실행; break;
		case "A":
			System.out.println("문자열 A");
			break;
		case "B":
			System.out.println("문자열 B");
			break;
		default:
			System.out.println("없는 문자열!");
		}
		//switch문을 만들어서 안되는 조건을 테스트 해보기 바랍니다. 
		
		
		for (int num = 0; num < 3; num++) {

			switch (num) {
			case 0:
				System.out.println("0");
				break;
			case 1:
				System.out.println("1");
				break;

			default:
				System.out.println("없는 숫자");
				break;
			
			}

		}
	}
}
