package ex2;
/*
 * Ex1_Array
 */

public class Ex1_Array {	//	�迭�� ��ü�̴�. **********************
	/*
	 * int[] num1:  => �迭�� ����
	 * int[] num1:  = new int[3]: // ������ �迭�� ũ�Ⱑ �ʿ�
	 * 	�迭�� ����� ������ �ʱ�ȭ�� ���ÿ�
	 */
	
	private int[ ] num1 = {1,2,3,4,5,6,7,8};

	public Ex1_Array() {
		// �迭�� �ε����� 0���� �����̵�
		
		System.out.println("�迭�� �ε����� ����:" +num1[0]);
		System.out.println("�迭�� ����:" +num1.length);
		System.out.println("-------------------------------");
		for (int i = 0; i < num1.length; i++) {
			System.out.println(num1[i]+"��");
		}
		
//		���� for��
		for (int e : num1) {
			System.out.println(e+"��");
		}
	}
	public static void main(String[] args) {
		
		new Ex1_Array();
	}
}
