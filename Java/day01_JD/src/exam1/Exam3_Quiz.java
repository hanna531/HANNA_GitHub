package exam1;

public class Exam3_Quiz {

	public static void main(String[] args) {
		/*
		 * Quiz 2) Exam3_Quiz 클래스를 새롭게 만들어서
		 *  name이란 상수에 자신의 이름을 저장하고, 나이는 age랑 변수에 27 저장
		 *  age 의 값은 항상 27세보다 적은 만 으로 출력하시오.
		 *  나의 이름은 김길동 입니다.
		 *  만으로는 26세 입니다.
		 */

		final String NAME = "김길동";
		int age = 27;
		age = age - 1;
				
		System.out.println("나의 이름은 "+ NAME +" 입니다.");
		System.out.println("만으로는 "+ age +"세 입니다.");
		
	}

}
