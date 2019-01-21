package exam1;

import java.util.Scanner;

public class Exam_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("범위: ");
		int range = Integer.parseInt(sc.nextLine());
		
		System.out.print("숫자: ");
		int num = Integer.parseInt(sc.nextLine());
		
		int i = 1;

		
		do {

			System.out.print("\t" + i);
			
			if (i % range == 0) {

				System.out.println("");
			}
			i++;	
		} while (i <= num);
	}
}
