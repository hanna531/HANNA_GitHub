package exam2;

import java.util.Scanner;

public class Exam6_Quiz {

	public static void main(String[] args) {

		int no = 1;
		int cpu = 0;
		String cpuStr = "";
		int winNum = 0;
		String prize = "";


		for (;;) {
			Scanner sc = new Scanner(System.in);
			System.out.println("���� (1 - Ȧ,2 - ¦,3 - ����)");
			int inNum = Integer.parseInt(sc.nextLine());
			
			if (inNum==3) {
				break;
			}

			else if (inNum == 1) {
				cpu = (int) (Math.random()*2 + 1);
				cpuStr = (cpu %2) == 0 ? "¦" : "Ȧ";
				System.out.println("No: " + no);
				System.out.println("CPU: " + cpuStr);
				System.out.println("YOU: Ȧ");
				if ((inNum + cpu) %2 == 0) {
					System.out.println("WIN");
					System.out.println("-------------------------------");
				}else {
					System.out.println("LOSE");
					System.out.println("-------------------------------");
				}
			}
				
			else if (inNum == 2) {
				cpu = (int) (Math.random()*2 + 1);
				cpuStr = (cpu %2) == 0 ? "¦" : "Ȧ";
				System.out.println("No: " + no);
				System.out.println("CPU: " + cpuStr);
				System.out.println("YOU: ¦");
				if ((inNum + cpu) %2 == 0) {
					System.out.println("WIN");
					System.out.println("-------------------------------");
				}else {
					System.out.println("LOSE");
					System.out.println("-------------------------------");
				}
			}
			
			else {
				System.out.println("���ڸ� �ٽ� �Է����ּ���.");
				no--;
			}
			if ((inNum + cpu) %2 == 0) {
				winNum++;
			}
			
				no++;

			}
		System.out.println("-------------------------------");	
		System.out.println("��������!!");
		System.out.println("Ȯ��: " + ((winNum*100)/no) + "%");
			if (((winNum*100)/no)<70||no<7) {
				prize = "��";
			}else if (((winNum*100)/no)<90) {
				prize = "100����";
			}else {
				prize = "500����";
			}
	
		System.out.println("��ǰ: " + prize);
				
			
	}
		
}
			

	


