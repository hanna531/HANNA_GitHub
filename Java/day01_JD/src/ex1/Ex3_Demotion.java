package ex1;

public class Ex3_Demotion {
	
	public static void main(String[] args) {
		/** 4byte ������ ������ JVM ����� �ڵ����� 4byte�� �°��ؼ� ������
		 *  demotion, promotion
		 *  java Ex3_Demotino => JVM�� ���� �� main�޼��带 ȣ�� (����)!
		 */
		
		byte n1 = 10;
		byte n2 = 20;
		byte n3 = (byte) (n1 + n2); // byte �� 1byte �̹Ƿ� �ڵ����� 4byte �� int�� �ٲ���
									// �� ������ ���� 4 byte �� �Ǵµ� �װ��� 1 byte�� �������� 
									// �ϸ� �۾����� �ϱ� ������ demotion �̶���
									// �װ��� ����ϴ°��� �ٷ� casting

		System.out.println(n1+ " + " + n2 +" = "+ n3);
		
		/* ����) short sh1, sh2 �� ���� ���� 100, 200�� ����
		*  short sh3�� ���� ������ �Ŀ� ����� �غ��ô�.
		*/
		
		short sh1 = 100;
		short sh2 = 200;
		short sh3 = (short) (sh1 + sh2);
		System.out.println(sh1+ " + " +sh2+ " = " +sh3);
		
		char c1 = 'A'; //65
		short c2 = 1;
		char c3 = (char) (c1 + c2);
		System.out.println(c3);
	}
	
}

