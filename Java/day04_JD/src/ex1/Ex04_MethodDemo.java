package ex1;

public class Ex04_MethodDemo {

	public static void test(int num) {
		num = num*2;
		System.out.println("num2: "+ num);
	}
	
	public static void main(String[] args) {
		int num = 100;
		test(num);
		System.out.println("num1: "+ num);
	}
	
	//stack : 지역변수와 메서드가 실행되는 영역
	//test함수 호출: heap 테스트 함수
	//함수를 빠져 나온 뒤 스택이 비고, 거기에 다시 num1출력문을 실행

	
}
