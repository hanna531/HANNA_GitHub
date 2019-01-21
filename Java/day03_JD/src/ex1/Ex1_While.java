package ex1;

public class Ex1_While {
	public static void main(String[] args) {
		/*
		 *  1) 기본 문법
		 *  초기식'
		 *	while(조건식) {
		 *    	실행문;
		 *    	증감식;
		 *    }
		
		 */
		
		//홀수와 짝수 출력하기 1~10까지 출력
		
		int i = 1; //초기식
		String msg = ""; //문자열 지정할 변수 선언
		while (i <= 10) {
			if (i % 2 ==0) {
				msg = "짝수";
			}else {
				msg = "홀수";
			}
			System.out.println(i+ "는 "+ msg +"입니다.");
			i++; //증감식
			
		}
	}   
}
