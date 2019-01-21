package ex2;

public class Ex12_ForFor {
	public static void main(String[] args) {
		/*
		 * 큰 for 문의 i 값이 1씩 증가 할 때
		 * 작은 for 문은 항상 (i 값이 끝날 때 까지) 초기식 2~ 증가	
		 */
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j +" X "+ i+ " = " +j*i+"; ");
				
			}
			System.out.println("");
			
		}
		System.out.println("---------------------");
	}
}
