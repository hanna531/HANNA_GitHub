package ex2;

import java.util.Scanner;

public class Ex9_IfElseIf {

	public static void main(String[] args) {
		// 50 �̻� ��� 30 �̻� �߱� 20 �̻� �ʱ� �� ���� ��� ����

		String grade = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���: ");
		int score = Integer.parseInt(sc.nextLine());

		if (score >= 50) {
			grade = "���";
		}else if (score >=30) {
			grade = "�߱�";
		}else if (score >=20) {
			grade = "�ʱ�";
		}else {
			grade = "����";
			
		}
		System.out.println("����: " +score+"\n���: "+grade);

	}

}
