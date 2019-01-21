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
			System.out.println("°ÔÀÓ (1 - È¦,2 - Â¦,3 - Á¾·á)");
			int inNum = Integer.parseInt(sc.nextLine());
			
			if (inNum==3) {
				break;
			}

			else if (inNum == 1) {
				cpu = (int) (Math.random()*2 + 1);
				cpuStr = (cpu %2) == 0 ? "Â¦" : "È¦";
				System.out.println("No: " + no);
				System.out.println("CPU: " + cpuStr);
				System.out.println("YOU: È¦");
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
				cpuStr = (cpu %2) == 0 ? "Â¦" : "È¦";
				System.out.println("No: " + no);
				System.out.println("CPU: " + cpuStr);
				System.out.println("YOU: Â¦");
				if ((inNum + cpu) %2 == 0) {
					System.out.println("WIN");
					System.out.println("-------------------------------");
				}else {
					System.out.println("LOSE");
					System.out.println("-------------------------------");
				}
			}
			
			else {
				System.out.println("¼ýÀÚ¸¦ ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä.");
				no--;
			}
			if ((inNum + cpu) %2 == 0) {
				winNum++;
			}
			
				no++;

			}
		System.out.println("-------------------------------");	
		System.out.println("°ÔÀÓÁ¾·á!!");
		System.out.println("È®·ü: " + ((winNum*100)/no) + "%");
			if (((winNum*100)/no)<70||no<7) {
				prize = "²Î";
			}else if (((winNum*100)/no)<90) {
				prize = "100¸¸¿ø";
			}else {
				prize = "500¸¸¿ø";
			}
	
		System.out.println("»óÇ°: " + prize);
				
			
	}
		
}
			

	


