package exam2;

import java.util.Scanner;

public class CookFinal {

	
	public static void main(String[] args) {
		ServiceCook serviceCook = new ServiceCook();
		Scanner sc = new Scanner(System.in);
		String name;
		String menu;
		
//		����� input 
		System.out.println("�ֹ����̸� :");
		name = sc.nextLine();
		System.out.println("1.�ѱ��丮, 2.�ε��丮");
		menu = sc.nextLine();
		
		serviceCook.printMenu(menu, name);
	}
}
