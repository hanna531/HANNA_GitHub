package ex1;
/*
 * 	Ŭ���� ����
 * 	1. �ش�
 * 	2. ����ʵ�		(�Ӽ�)
 * 	3. ����޼���	(����)
 * 	Ŭ������ ��ü�������� ����(����), ��� ���θ޼���� ���Ե��� �ʴ´�.
 */
public class Ex2_ClassDemo {
	// ***** ����ʵ�� ����� ���ÿ� �ʱ�ȭ ��!
	int pay;
	String team;
	
	/*
	 * 	�޼��带 �ѹ� ����� (������)���鼭 �ǹ̸� �ľ��غ��ô�.
	 * 
	 */
	public void test() { //	Ex2_ClassDemoŬ������ ��ü�� ������ ����
		System.out.println("pay : " + pay +" ;Team : "+ team);	//Pay : 0, Team : null
	}
	
	// �׽�Ʈ �� 18 ~ 21 ������ �ּ� ó���ϰ� Ex2_Main Ŭ������ ���� ����
	
	/*	
	 * 	�ǹ� �ִ� �۾����� �޼��带 ���� �غ��ô�.
	 * 	pay�� � ���� ��������� ������ �� �ֵ��� �����ϴ� �޼��� ����� (����ȭ)
	 *	��ȯ���� ������ �� ����ؾ� �Ұ� : �޼��� ȣ�� �Ŀ� Ư�� ���� ��ȯ ���� ������
	 *	�������� ������ �޼��常 ���� �� ������......
	 * 	���� �ִ� �۾��� ���ؼ� ��ȯ���� ���� �ʿ䰡 ���ٰ� �����ؼ� void��� ��������......
	 */
	
	public void insertPay(int pay) {//	���ڰ� ���� int pay = �������� ���� ������� pay�� �浹 X
									//	��������� �̸��� ������ ���������� �켱������ �۵���
		System.out.println("LOG1: �������� pay : " + pay);
		System.out.println("LOG2: ������� pay : " + this.pay);
	}
	
	public void insertPay2(int p) {
		System.out.println("LOG1: �������� pay : " + p);
		System.out.println("LOG2: ������� pay : " + pay);
	}
	
	public void insertPay3(int p) {
		pay = p;
		System.out.println("LOG1: �������� pay : " + p);
		System.out.println("LOG2: ������� pay : " + pay);
	}
	
	/*
	 * 	�غ���1: �̹����� team�� ���� �����ϴ� �޼��带 ����� ���ô�.
	 * 	�غ���2: �̹����� pay, team�� ���� ���ÿ� �����ϴ� �޼��带 ����� ���ô�.
	 */
	
	public void insertTeam(String t) {
		team = t;
		System.out.println("����� team�� ����: " + team);
	}
	
	public void insertPayTeam(int p, String t) {
		pay = p;
		team = t;
		System.out.println("����� pay�� ����: " + p);
		System.out.println("����� team�� ����: " + team);
	}
	
	public String insertTeam2() {
		return team;
		
	}
}
