package ex2;

public class Ex12_ForFor {
	public static void main(String[] args) {
		/*
		 * ū for ���� i ���� 1�� ���� �� ��
		 * ���� for ���� �׻� (i ���� ���� �� ����) �ʱ�� 2~ ����	
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
