package ex2;

public class Ex7_Equals {
	public static void main(String[] args) {
		/*
		 *  str 1 �� str 2�� ��ü�� ����ũ�Ƿ� ���� �ڷ����̴�.
		 *  ���� str 1 �� str 2 �� �ּҸ� �����ϰ� �ְ�
		 *  new�� ���� ���� �����Ǿ��� ������ �� �ּҴ� �ٸ���.
		 *  ������ ���ϰ� �ʹٸ� equals�� ����ؾ� �ϳ�.
		 *  
		 *  �Ϲ��� ��ü ��������� ���� ������϶�,
		 *  ���Ǯ�� �����ϱ� ������
		 *  str2 ������ ���̻� ���ο� ��ü�� �������� �ʰ�
		 *  �̹� ������ str1�� ������ �ּҰ��� ���޹޴´�.
		 */
		
		String str1 = "Test";
		String str2 = "Test";
		
		if(str1 == str2) {
			System.out.println("str1, str2�� �ּҰ� ����.");
		}else {
			System.out.println("str1, str2�� �ּҰ� �ٸ���");
		}
		
		/*
		 *  str1, str2�� new�� ����ؼ� ���� �տ� �����Ǿ��� ������ �ּҴ� �ٸ����� �� ��ü�� Test �� ���ڿ� ����
		 *  �����ϰ� ����ϰ� �ֱ� ������ ���ڿ��� ������ ������ ���ϱ� ���ؼ� 
		 *  String Ŭ������ �ڿ��� equals �޼ҵ带 ����ؼ� ���� 
		 *  �m���� (new), ������ �̴��� ���� ��
		 */
		
		if(str1.equals(str2)) {
			System.out.println("������ ����.");
		}else {
			System.out.println("������ �ٸ���");
		}
	
		
	}
}
