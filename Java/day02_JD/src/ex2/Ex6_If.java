package ex2;

import java.util.Scanner;

public class Ex6_If {
	public static void main(String[] args) {
		/*
		int n=0;
		if(true) {
			int n = 10; // if�� �����ȿ��� ������ ����
		}else {
			System.out.println(n);
		}
		
		 * ������ true �� �� ���๮�� �����Ѵ�.
		 */
		
		Scanner s = new Scanner(System.in);
		System.out.println("���̸� �Է����ּ���:");
		int num = Integer.parseInt(s.nextLine());
			if (num <= 19) {
				System.out.println("������ �� �����ϴ�.");
				System.exit(0);	//�ý��� ����
			}
		System.out.println("�����մϴ�^^!");
	
		
	}

}