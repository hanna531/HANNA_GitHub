package exam2;

import java.util.Scanner;

public class CookMain {
	public static void main(String[] args) {
		//	scanner 생성
		Scanner sc = new Scanner(System.in);
//		
//		//	사용자 input 
		System.out.println("주문자이름 :");
		String name = sc.nextLine();
		System.out.println("1.한국요리, 2.인도요리");
		String menu = sc.nextLine();
//		
//		//	사용자 input에 따라 출력값
		if (menu.equals("1")) {
			KoreaCook kr = new KoreaCook();
			kr.order(name);
		} else if (menu.equals("2")){
			IndoCook indo = new IndoCook();
			indo.order(name);
		}
	}
}
