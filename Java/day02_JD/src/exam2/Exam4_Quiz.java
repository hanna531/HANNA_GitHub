package exam2;

import java.util.Scanner;

public class Exam4_Quiz {

	public static void main(String[] args) {
		
		//입력받은 숫자 3개값에서 최대값을 출력하라
		
		exam();
		

	}
	
	private static void exam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("num1: ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("num2: ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("num3: ");
		int num3 = Integer.parseInt(sc.nextLine());
		
		int max;
		
		if (num1>num2 & num1>num3) {
			max = num1;
		} else if (num2>num1 & num2>num3) {
			max = num2;
		} else {
			max = num3;
		}
		System.out.println("최대값: "+max);
	}

}
