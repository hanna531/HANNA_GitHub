package ex1;

public class Ex2_Main {

	public static void main(String[] args) {	//main = stack
		Ex2_ClassDemo ref = new Ex2_ClassDemo();	//ref = stack
		/*
		 * 	���� ���� = stack
		 * 	������ ���� (100����)�� �ּҰ��� ����ä test(), insertPay()���� �޼��带 heap�������� ����
		 * 	" = " �� ���ؼ� ���� ������ ref �ȿ� heap���� ������ �������� static �����ȿ� ����
		 */
		ref.test();
		ref.insertPay(10000);
		ref.insertPay2(10000);
		ref.insertPay3(1000);
		
		ref.insertTeam("�̰��� ���̴�");
		ref.insertPayTeam(10000, "�̸��̹���");
		ref.insertTeam2();
		System.out.println(ref.team);
		System.out.println(ref.pay);
	}

}
