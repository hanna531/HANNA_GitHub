package exam2;

import java.util.Scanner;

public class Exam2_Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//입력값을 받는 Class
		
		System.out.println("금액을 넣으시오: ");
		String money_text = sc.nextLine();		//받은 입력값을 money_text 저장
		int money = Integer.parseInt(money_text);//int 숫자로 형 변환
		

		int five_hundred = money / 500;
		money -= five_hundred*500;
		int one_hundred = money / 100;
		money -= one_hundred*100;
		int fifty = money / 50;
		money -= fifty*50;
		int ten = money / 10;
		money -= ten*10;
				
		
		// coin%500/100
		
		System.out.println("500원짜리 : " +five_hundred+ "개"); //결과물 제출
		System.out.println("100원짜리 : " +one_hundred+ "개"); //결과물 제출
		System.out.println("50원짜리 : " +fifty+ "개"); //결과물 제출
		System.out.println("10원짜리 : " +ten+ "개"); //결과물 제출

		
		
		
		
		
		
	}
}
