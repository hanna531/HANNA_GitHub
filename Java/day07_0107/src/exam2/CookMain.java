package exam2;

import java.util.Scanner;

public class CookMain {
	public static void main(String[] args) {
		//	scanner ����
		Scanner sc = new Scanner(System.in);
//		
//		//	����� input 
		System.out.println("�ֹ����̸� :");
		String name = sc.nextLine();
		System.out.println("1.�ѱ��丮, 2.�ε��丮");
		String menu = sc.nextLine();
//		
//		//	����� input�� ���� ��°�
		if (menu.equals("1")) {
			KoreaCook kr = new KoreaCook();
			kr.order(name);
		} else if (menu.equals("2")){
			IndoCook indo = new IndoCook();
			indo.order(name);
		}
	}
}
