package ex2;
/*
 * 	Ex1_Parent : �߻� �޼��带 ���� Ŭ������ �ݵ�� �߻� Ŭ�����̴�.
 */
public abstract class Ex1_Parent {			//	abstract class ������.
	//	��� ���� �ڿ�
	private final int pay = 1000000;
	//	�߻� �޼��� : �̼�!
	public abstract void moveMountain();	//	abstract method�̱� ������ abstract class
											//	�� �ʼ������� ������!
	//	public void moveMountain() {}
	
	public int getPay() {
		return pay;
	}
	
}
