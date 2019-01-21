package exam2;

import java.util.Scanner;

public class Exam1_Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//입력값을 받는 Class
		
		System.out.println("숫자를 입력하시오: ");
		String num_text = sc.nextLine();		//받은 입력값을 money_text 저장
		int num = Integer.parseInt(num_text);	//int 숫자로 형 변환
		
		System.out.println((num%2==0)?"짝수":"홀수");
		
	}
}
