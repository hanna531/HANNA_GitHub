package exam1;

import java.util.Scanner;

public class Exam_3_For {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		int range = Integer.parseInt(sc.nextLine());
		
		System.out.print("����: ");
		int num = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= num; i++) {
			System.out.print("\t"+i);
			
			if (i % range == 0) {
				System.out.println("");
			}
		}
	}
}
