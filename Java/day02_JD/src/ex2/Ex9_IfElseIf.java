package ex2;

import java.util.Scanner;

public class Ex9_IfElseIf {

	public static void main(String[] args) {
		// 50 이상 고급 30 이상 중급 20 이상 초급 그 이하 등급 없음

		String grade = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요: ");
		int score = Integer.parseInt(sc.nextLine());

		if (score >= 50) {
			grade = "고급";
		}else if (score >=30) {
			grade = "중급";
		}else if (score >=20) {
			grade = "초급";
		}else {
			grade = "없음";
			
		}
		System.out.println("점수: " +score+"\n등급: "+grade);

	}

}
