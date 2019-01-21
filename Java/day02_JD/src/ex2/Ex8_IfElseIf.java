package ex2;

import java.util.Scanner;

public class Ex8_IfElseIf {

	public static void main(String[] args) {
		/*
		 *  작성 할 때 부터 Scanner적용
		 *  하나의 조건을 여러번 팔별 하려고 할 때 자주 사용된다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("과일을 입력하세요: ");
		String val = sc.nextLine();
		String col = "";
		if (val.equals("사과")) {
			col = "Red";
		}else if (val.equals("바나나")) {
			col = "Yellow";
		}else if (val.equals("오렌지")) {
			col = "Orange";
		}else {
			col = "White";
		}
			
		System.out.println(val+"은(는) "+col+"색 입니다.");
		}
		
	}

