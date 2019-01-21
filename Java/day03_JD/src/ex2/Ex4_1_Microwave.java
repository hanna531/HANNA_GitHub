package ex2;

import java.util.Scanner;

public class Ex4_1_Microwave {
	public static void main(String[] args) {
		Ex4_Microwave mw = new Ex4_Microwave();
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		do {
			System.out.println("전원켜기-1, 전원끄기-2 :");
			num = Integer.parseInt(sc.nextLine());
			
			switch (num) {
			case 1:
				mw.setPower(true);
				System.out.print("시간을 입력하세요 (초): ");
				int microTime = Integer.parseInt(sc.nextLine());
				mw.setTime(microTime);
				System.out.print("출력을 입력하세요 (1~700W): ");
				int microWatt = Integer.parseInt(sc.nextLine());
				mw.setWatt(microWatt);
				System.out.println(mw.viewControl());
				
				System.out.println("");
				break;
			case 2:
				mw.setPower(false);
				
				break;

			default:
				System.out.println("잘못된 숫자입니다. 시스템을 종료 합니다.");
}
			
		} while (num == 1);
	}
}
