package exam2;

import java.util.Scanner;

public class Exam5_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �Է�: ");
		int dan = Integer.parseInt(sc.nextLine());
		System.out.println("���� �Է� (3,5,7): ");
		int range = Integer.parseInt(sc.nextLine());
		
		int var = range/2;
		int min = dan - var;
		int max = dan + var;
		
		for (int i = 0; i <= 9; i++) {

			for (int j = min; j <= max; j++) {
			
			if (i==0) {
				System.out.print(j+"��\t\t");
			}
			else {
				System.out.print(j +" X "+ i+ " = " +j*i+";\t");
			}
			}
			System.out.println("");
			
		}
		
	}
}
