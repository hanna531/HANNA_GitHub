package ex1;

public class Ex1_While {
	public static void main(String[] args) {
		/*
		 *  1) �⺻ ����
		 *  �ʱ��'
		 *	while(���ǽ�) {
		 *    	���๮;
		 *    	������;
		 *    }
		
		 */
		
		//Ȧ���� ¦�� ����ϱ� 1~10���� ���
		
		int i = 1; //�ʱ��
		String msg = ""; //���ڿ� ������ ���� ����
		while (i <= 10) {
			if (i % 2 ==0) {
				msg = "¦��";
			}else {
				msg = "Ȧ��";
			}
			System.out.println(i+ "�� "+ msg +"�Դϴ�.");
			i++; //������
			
		}
	}   
}
