package exam1;

public class Exam2_Quiz {

	public static void main(String[] args) {
	/**
	 *  Quiz 1)
	 *  변수 a, b 에 값을 각각 3, 5로 대입한다.
	 *  그값을 출력할 때
	 *  a = 5, b = 3으로 출력 하시오.
	 *  
	 *  Quiz 2) Exam3_Quiz 클래스를 새롭게 만들어서
	 *  name이란 상수에 자신의 이름을 저장하고, 나이는 age랑 변수에 27 저장
	 *  age 의 값은 항상 27세보다 적은 만 으로 출력하시오.
	 *  나의 이름은 김길동 입니다.
	 *  만으로는 26세 입니다.
	 *  
	 *  Quiz 3) Exam4_Quiz 클래스를 새롭게 만들어서
	 *  Scanner로 자신의 프로필 3개를 입력을 받아서 각각 문자역 변수에 저장한 후에 한번에 출력하시오.
	 *  이름 : 김길동 , 나이 :26, 사는곳 : 서울 금천구 가산동
	 */

		int a = 3; 
		int b = 5;
		int c; // 잠시 임시로 저장할 변수 temp에 값을 활용
		
		c = a;
		a = b;
		b = c;
				
		System.out.println("a = "+a+ ", b = " +b);
		
	}

}
