package ex2;

import java.util.Scanner;

public class Ex6_If {
	public static void main(String[] args) {
		/*
		int n=0;
		if(true) {
			int n = 10; // if문 영역안에서 선언한 변수
		}else {
			System.out.println(n);
		}
		
		 * 조건이 true 일 때 실행문을 실행한다.
		 */
		
		Scanner s = new Scanner(System.in);
		System.out.println("나이를 입력해주세요:");
		int num = Integer.parseInt(s.nextLine());
			if (num <= 19) {
				System.out.println("접근할 수 없습니다.");
				System.exit(0);	//시스템 종료
			}
		System.out.println("축하합니다^^!");
	
		
	}

}