package ex2;

public class Ex2_JavaContinue {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0 || i % 5 == 0) {
				continue;	//i가 2 또는 5의 배수일 경우 다음 반복문으로 넘어간다.
			}
			System.out.print(i +" ");
		}
		System.out.println("");
		
		
		ex:	for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (j ==3) {
						continue ex;
					}
					System.out.println("i:" + i + " , j " + j);
				}
				
			}
		
	}
}
