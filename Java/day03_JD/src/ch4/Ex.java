package ch4;

import java.util.Scanner;

public class Ex {
	
	public static void num3() {
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 합:" + sum);
	}
	public static void num4() {


		while (true) {
			int dice1 = (int) (Math.random()*6) +1;
			int dice2 = (int) (Math.random()*6) +1;
			
			if (dice1 + dice2 == 5) {
				System.out.println("총합이 5 입니다. (" +dice1+", "+dice2+ ")");
				break;
			} else {
				System.out.println("(" +dice1+", "+dice2+ ")");
			}
			
		}
		
	}
	public static void num5() {
		for (int i = 0; i <= 10; i++) {
			
			for (int j = 0; j <= 10; j++) {
				if ((4*i)+(5*j)==60) {
					System.out.println("("+i+", "+j+")");
				} 
				
			}
		}
		
	}
	public static void num7() {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 1000000;
		
		while (run) {
			System.out.println("------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("------------------------");
			System.out.print("선택> ");
			
			int num = Integer.parseInt(sc.nextLine());
			
			 if (num == 4) {
				System.out.println("");
				break;
			} else if (num == 1) {
				System.out.print("예금액>");
				int amount = Integer.parseInt(sc.nextLine());
				balance += amount;
				System.out.println(balance);
				
			} else if (num == 2) {
				System.out.print("출금액>");
				int amount = Integer.parseInt(sc.nextLine());
				balance -= amount;
				System.out.println(balance);
				
			} else if (num == 3) {
				System.out.print("잔고>" + balance +"");		
			}	
			
		}
		System.out.println("프로그램 종료");
	}
	public static void main(String[] args) {
		num3();
		num4();
		num5();
		num7();

	}
}
