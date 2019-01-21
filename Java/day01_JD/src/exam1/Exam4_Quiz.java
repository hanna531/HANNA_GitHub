package exam1;

import java.util.Scanner;

public class Exam4_Quiz {

	public static void main(String[] args) {
		/*
		 * Quiz 3) Exam4_Quiz 클래스를 새롭게 만들어서
		 *  Scanner로 자신의 프로필 3개를 입력을 받아서 각각 문자역 변수에 저장한 후에 한번에 출력하시오.
		 *  이름 : 김길동 , 나이 :26, 사는곳 : 서울 금천구 가산동
		 */

		Scanner sc = new Scanner(System.in);
		// UI
		System.out.print("이름 :");
		String name = sc.nextLine();
		System.out.print("나이 :");
		String age = sc.nextLine();
		System.out.print("사는곳 :");
		String address = sc.nextLine();
		// 숫자형 문자열 26 값을 정수로 변경하는 메서드를 호출
		int ageNum = Integer.parseInt(age);
		int age2 = ageNum -1;
		
		// output
		System.out.print("이름 : " + name);
		System.out.print(" , 나이 : " + age2);
		System.out.print(" , 사는곳 : " + address);
	}

}
