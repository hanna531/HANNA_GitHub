package ex2;

public class Ex5_Oper {

	public static void main(String[] args) {
		int a = 12;		//   0 0 0 0 1 1 0 0 (12)
		int b = 2;		//-> 0 0 0 0 0 0 1 1 (2�� ���������� �̵�����)
						//-------------------
						//   0 0 0 0 0 0 1 1 (�����)
		//a : ��Ʈ ������ ���� (2����), b: �󸶳� ����Ʈ �� ������ (10����)
		//b ��ŭ ����Ʈ �����϶�
		int c = a >> b;
		System.out.println("12>>2 :" +c); //2�� ���������� �̵�
		int d = a << b;
		System.out.println("12<<2 :" +d); //2�� �������� �̵�
		
	}
}
