package ex1;

public class Ex3_ClassDemo {

	/*
	 * Team A: method �� ����ؼ� pay�� �����Ҽ� �ִ� ������ �� (read, write)
	 * Team B: a���� ����� pay���� ������ (read only)
	 * A, B ���̵� pay�� �ڿ��� ���� �������� ���ϵ��� �Ѵ�.
	 */
	
	private int pay;
	
	//this : ���� Ŭ������ �ּҸ� ���� (�ڽ��� �ּҰ�)
	public void insertPay(int pay, String pwd) {
		if (pwd.equals("1")) {
			//����ʵ��� pay = �������� pay
			this.pay = pay;
		} else {
			System.out.println("���޼���!");
		}
		
	}
	
	//��� �ʵ��� pay���� ��ȯ�� �ִ� �Լ�
	public int viewPay() {
		return pay;	//pay�� ������ 
	}
	
	public void viewPay2() {
		System.out.println(pay); //pay ���� print�� �����
	}

}
