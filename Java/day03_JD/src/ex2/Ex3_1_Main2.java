package ex2;

import java.util.Scanner;

public class Ex3_1_Main2 {
	//1. ���� �޼����� ���� (JVM�� ����)
	public static void main(String[] args) {
		/*2.Ex3_Remocon Ŭ������ ��ü�� ��������.
		*	�����ڷ��� �������� = new �����Ұ�ü();
		*	stack���� ����� Ex3_Remocon�� �����ڷ������� ��
		*	���� er ���� Heap ������ new �����ڷ� ������ ��ü�� �ּ� (100) ��
		*	���� �Ǿ� �ִ�. �׷��Ƿ� er ������ Ex3_Remocon��ü�� �����ؼ� ����� �� �ִ�.
		*/
		Ex3_Remocon er = new Ex3_Remocon();
		//3.UI
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("�����ѱ� 1, �������� 2 :");
			String powerMsg = sc.nextLine();
			if (powerMsg.equals("1")) {
				System.out.println("���� ä�ΰ���: " + er.viewControl());
				er.setPower(true);
				System.out.println("ä�� �� :");
				int chNumber = Integer.parseInt(sc.nextLine());
				er.setChNum(chNumber);
				System.out.println("����� ä�ΰ���: "+ er.viewControl());
			} else if (powerMsg.equals("2")){
				er.setPower(false);
				System.out.println(er.viewControl()+" ä���� ����մϴ�.");
				break;
			} else {
				System.out.println("�߸��� ��ȣ �Դϴ�.");
			}
		}
		
	}
}
