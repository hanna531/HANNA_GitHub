package ex2;

public class Ex1_DoWhile {
	public static void main(String[] args) {
		/*
		 * 	do���� while�� ���ǽİ� ���þ���
		 *	������ �ѹ��� ������ �� �� while�� ���ǿ� ���� �ݺ��ϴ� ����
		 */
		int i = 0;
		do {
			if (i % 2 == 0) {
				System.out.println("¦: " +i);
			}else {
				System.out.println("Ȧ: " +i);	
				}
			i++;
		} while (i <= 10);
		System.out.println("-------------------");
	}

}


//10���� �Ʒ��� countdown exam 1