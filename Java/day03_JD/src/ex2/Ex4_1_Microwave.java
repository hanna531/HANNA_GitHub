package ex2;

import java.util.Scanner;

public class Ex4_1_Microwave {
	public static void main(String[] args) {
		Ex4_Microwave mw = new Ex4_Microwave();
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		do {
			System.out.println("�����ѱ�-1, ��������-2 :");
			num = Integer.parseInt(sc.nextLine());
			
			switch (num) {
			case 1:
				mw.setPower(true);
				System.out.print("�ð��� �Է��ϼ��� (��): ");
				int microTime = Integer.parseInt(sc.nextLine());
				mw.setTime(microTime);
				System.out.print("����� �Է��ϼ��� (1~700W): ");
				int microWatt = Integer.parseInt(sc.nextLine());
				mw.setWatt(microWatt);
				System.out.println(mw.viewControl());
				
				System.out.println("");
				break;
			case 2:
				mw.setPower(false);
				
				break;

			default:
				System.out.println("�߸��� �����Դϴ�. �ý����� ���� �մϴ�.");
}
			
		} while (num == 1);
	}
}
