package exam2;

import java.util.Scanner;

public class CookFinal {

	
	public static void main(String[] args) {
		ServiceCook serviceCook = new ServiceCook();
		Scanner sc = new Scanner(System.in);
		String name;
		String menu;
		
//		사용자 input 
		System.out.println("주문자이름 :");
		name = sc.nextLine();
		System.out.println("1.한국요리, 2.인도요리");
		menu = sc.nextLine();
		
		serviceCook.printMenu(menu, name);
	}
}
