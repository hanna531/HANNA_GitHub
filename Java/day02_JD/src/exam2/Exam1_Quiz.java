package exam2;

import java.util.Scanner;

public class Exam1_Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//�Է°��� �޴� Class
		
		System.out.println("���ڸ� �Է��Ͻÿ�: ");
		String num_text = sc.nextLine();		//���� �Է°��� money_text ����
		int num = Integer.parseInt(num_text);	//int ���ڷ� �� ��ȯ
		
		System.out.println((num%2==0)?"¦��":"Ȧ��");
		
	}
}
