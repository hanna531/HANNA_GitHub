package exam1;

import java.util.Scanner;

public class Exam4_Quiz {

	public static void main(String[] args) {
		/*
		 * Quiz 3) Exam4_Quiz Ŭ������ ���Ӱ� ����
		 *  Scanner�� �ڽ��� ������ 3���� �Է��� �޾Ƽ� ���� ���ڿ� ������ ������ �Ŀ� �ѹ��� ����Ͻÿ�.
		 *  �̸� : ��浿 , ���� :26, ��°� : ���� ��õ�� ���굿
		 */

		Scanner sc = new Scanner(System.in);
		// UI
		System.out.print("�̸� :");
		String name = sc.nextLine();
		System.out.print("���� :");
		String age = sc.nextLine();
		System.out.print("��°� :");
		String address = sc.nextLine();
		// ������ ���ڿ� 26 ���� ������ �����ϴ� �޼��带 ȣ��
		int ageNum = Integer.parseInt(age);
		int age2 = ageNum -1;
		
		// output
		System.out.print("�̸� : " + name);
		System.out.print(" , ���� : " + age2);
		System.out.print(" , ��°� : " + address);
	}

}
