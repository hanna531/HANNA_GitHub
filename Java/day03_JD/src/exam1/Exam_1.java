package exam1;

public class Exam_1 {
	public static void main(String[] args) throws InterruptedException {
		int i = 10;
		do {
			System.out.print("ī��Ʈ�ٿ�: " + i +"! ");
			// 1�ʾ� ��� ���α׷��� ���ߴ� ����� �Ѵ�.
			Thread.sleep(1000); //Thread �� java.lang ��Ű���� �����Ѵ�
			i--;
		} while (i>=0);
		
		System.out.println("");
		i = 10;
		
		while (i >= 0) {
			System.out.print("ī��Ʈ�ٿ�: " + i +"! ");
			i--;
		}
		
		System.out.println("");
		
		for (int j = 10; j >= 0; j--) {
			System.out.print("ī��Ʈ�ٿ�: " + j + "! ");
		}
				
	}
}
