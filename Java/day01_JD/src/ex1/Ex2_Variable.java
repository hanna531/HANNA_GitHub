package ex1;

import org.omg.CORBA.SystemException;

public class Ex2_Variable {

	public static void main(String[] args) {
		/**변수 구분 : 기본형 타입 (8가지), 참조 타입 (그외)
		*  복습 포인트) 교재 38page!
		*  정수형 : byte(1), short(2), int(4), long(8)
		*  실수형 : float(4), double(8)
		*  논리형 : boolean(1) (참/거짓) true/false
		*  2) 변수를 선언하고 값을 저장하는 방법 *****************************************
		*/
		
		int a = 3; // 변수를 선언 3이란 상수를 a에 (=) 대입한다.
		int b; // 변수를 선언, 값은 할당 (초기화) 이 안된 상태!
		b = 3; // 선언한 변수 b에 3 값을 대임
		// int a; 변수는 {} 영역안에서 한번만 선언할 수 있다.
		
		// short 타입의 c 값에는 50을 저장 할 수 있습니다.
		short c = 50;
		// byte 타입의 d 에는 100값을 저장 할 수 있습니다. -128 ~ 127 범위
		byte d = 100;
		
		// All 값을 문자열로 모니터로 출력을 하는 함수
		// 3) 저장한 변수를 출력하기 위한 방법 *****************************************
		System.out.println("변수 a의 값:");
		System.out.println(a);
		System.out.println("-------------------");
		// "asdf" => 문자열을 의미하고 참조 자료형으로 생각
		// 문자열 연결연산자 => +
		System.out.println("변수 b의 값: \t" + b);
		
		long e = 2147483648L; //L ~ 1 리터럴 접미사
		System.out.println(e);
		
		System.out.println("------------------------");
		// 예) long형 8byte -> int 4byte 형으로 강제로 형을 변환
		// int형의 자료형의 범위를 넘어서는 값이라면 overflow 가 발생해서 정확한 값이 안나온다. 
		
		int times = (int) System.currentTimeMillis(); //long 값을 가짐
		//casting 이라고 해서 long의 값을 억지로 int로 넣는것 
		System.out.println("Times: "+times); 
		
		/** 변수 명명규칙
		 *  1. 대소문자 구분을 한다. 길이의 제한이 없다.
		 *  2. 숫자로 시작 안된다.
		 *  3. 특수문자 _ , $ 두가지만 가능하다.
		 *  4. 예약어는 변수명으로 사용 불가.
		 *  5. 변수는 무조건 소문자로 시작해야한다. (필수)
		 *  	int x; int X;
		 *  6. 숫자로 시작은 안되지만 혼용 가능
		 *  	int num1; int num2;
		 *  
		 *  4) 변수와 상수의 차이 ****************************************************
		 */
		
		int num2 = 10;
		System.out.println(num2); //10
		num2 = 20; //마지막에 저장된 값만 기억 합니다. 
		System.out.println(num2); //20
		System.out.println("------------------------");
		/* 변수 : 변하는 수
		*  상수 : 일정한 수. final - 키워드를 사용하면 프로그램이 종료시까지 변경이 불가능
		*/
		final int SIZE = 8; //상수값
		System.out.println(SIZE);
		
		//3.14 => double 이고, float(4) => F,f 리터럴 표기
		//5). 실수형, 문자, 논리 ***************************************************
		float g = 3.14f; //float
		double h = 3.14d; // double , 3.14d 가능
		// boolean(1)
		boolean i = true;
		// java 에서는 한문자를 유니코드 (2byte) 로 인식
		// '문자' => "A"는 문자열 (참조자료형)
		char j = 'A';
		System.out.println("boolean: "+i +" \nchar : " +j);
		
	}
	

}
