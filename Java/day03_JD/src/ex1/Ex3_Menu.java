package ex1;

import java.util.Scanner;

public interface Ex3_Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		exit: while (true) {	//���� �ݺ�
			System.out.println("�޴���å:1-�Է�, 2-���, 3-����: ");
			int menuNum = Integer.parseInt(sc.nextLine());
			//switch������ ����
			switch (menuNum) {
			case 1:
				System.out.println("�Է� ó��!");
				break;
			case 2:
				System.out.println("��� ó��!");
				break;
			case 3:
				System.out.println("���� ó��!");
				break exit;

			}
			i++;	//�⺻ while ������ ����Ǵ°�
		}
	}
}
