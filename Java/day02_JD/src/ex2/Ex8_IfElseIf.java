package ex2;

import java.util.Scanner;

public class Ex8_IfElseIf {

	public static void main(String[] args) {
		/*
		 *  �ۼ� �� �� ���� Scanner����
		 *  �ϳ��� ������ ������ �Ⱥ� �Ϸ��� �� �� ���� ���ȴ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���: ");
		String val = sc.nextLine();
		String col = "";
		if (val.equals("���")) {
			col = "Red";
		}else if (val.equals("�ٳ���")) {
			col = "Yellow";
		}else if (val.equals("������")) {
			col = "Orange";
		}else {
			col = "White";
		}
			
		System.out.println(val+"��(��) "+col+"�� �Դϴ�.");
		}
		
	}

