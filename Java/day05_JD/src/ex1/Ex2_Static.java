package ex1;

public class Ex2_Static {
	/*
	 * static �� ����
	 * 	���� �ϳ��� �����ؼ� ���� ��ü�� �����ؼ� ����� �� �ִ� �ڿ�
	 * static ������ ���� �ǰ� �ֱ� ������ ���� ���� ���� �� ���ȴ�.
	 * static �� ������ ���� ��� �ڿ��� JVM�� ���� �߿� static������ ��ġ�Ѵ�.
	 */
	static int num1;			//	static ���� (��� �ʵ�) - 
	private int num2;			//	�ν��Ͻ� ���� (��� �ʵ�)
	public void startTest() {
		num1++;
		num2++;
	}
	public static int getNum1() {	//	static ������ static �޼ҵ�
		return num1;
	}
	public int getNum2() {			//	�ν��Ͻ� �޼ҵ�
		return	num2;
	}
	
	
	
	/*
	 * 
	 */
}
