package ex3;
/*
 * 	�⺻ : interface ����: ����� �߻�޼���� �����Ǿ� �ִ�.
 * 	jdk 7 ���� �̻����default, static�� �߰���!
 */
public interface Ex1_Inter {
	public static final int num1 = 10;	//	���
	abstract public void test();	//	�߻�޼���
	
	//	�����!
	//	�Ʒ��ڵ�� �� �ڵ�� ����. ���� �κе��� �˾Ƽ� ���� ������.
	//	interface �̱� ������ ����� ����� �ִ°���.
	public int num2 = 20;	//	���
	public void test2();	//	�߻�޼���
}
