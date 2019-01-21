package exam1;

public class Exam_1 {
	public static void main(String[] args) throws InterruptedException {
		int i = 10;
		do {
			System.out.print("카운트다운: " + i +"! ");
			// 1초씩 잠시 프로그램을 멈추는 기능을 한다.
			Thread.sleep(1000); //Thread 는 java.lang 패키지에 존재한다
			i--;
		} while (i>=0);
		
		System.out.println("");
		i = 10;
		
		while (i >= 0) {
			System.out.print("카운트다운: " + i +"! ");
			i--;
		}
		
		System.out.println("");
		
		for (int j = 10; j >= 0; j--) {
			System.out.print("카운트다운: " + j + "! ");
		}
				
	}
}
