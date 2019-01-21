package ex2;

public class Ex5_Oper {

	public static void main(String[] args) {
		int a = 12;		//   0 0 0 0 1 1 0 0 (12)
		int b = 2;		//-> 0 0 0 0 0 0 1 1 (2번 오른쪽으로 이동했음)
						//-------------------
						//   0 0 0 0 0 0 1 1 (결과물)
		//a : 비트 연산할 변수 (2진수), b: 얼마나 쉬프트 할 것인지 (10진수)
		//b 만큼 쉬프트 연산하라
		int c = a >> b;
		System.out.println("12>>2 :" +c); //2번 오른쪽으로 이동
		int d = a << b;
		System.out.println("12<<2 :" +d); //2번 왼쪽으로 이동
		
	}
}
