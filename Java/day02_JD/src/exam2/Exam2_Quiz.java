package exam2;

import java.util.Scanner;

public class Exam2_Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//�Է°��� �޴� Class
		
		System.out.println("�ݾ��� �����ÿ�: ");
		String money_text = sc.nextLine();		//���� �Է°��� money_text ����
		int money = Integer.parseInt(money_text);//int ���ڷ� �� ��ȯ
		

		int five_hundred = money / 500;
		money -= five_hundred*500;
		int one_hundred = money / 100;
		money -= one_hundred*100;
		int fifty = money / 50;
		money -= fifty*50;
		int ten = money / 10;
		money -= ten*10;
				
		
		// coin%500/100
		
		System.out.println("500��¥�� : " +five_hundred+ "��"); //����� ����
		System.out.println("100��¥�� : " +one_hundred+ "��"); //����� ����
		System.out.println("50��¥�� : " +fifty+ "��"); //����� ����
		System.out.println("10��¥�� : " +ten+ "��"); //����� ����

		
		
		
		
		
		
	}
}
