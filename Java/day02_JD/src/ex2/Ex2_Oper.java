package ex2;

public class Ex2_Oper {

	public static void main(String[] args) {
		/*
		 * 논리연산자: && 논리곱 , || 논리함, !부정
		 * true && true -> true / false && true 일때 true 는 실행되지 않는다.
		 * ||는 false || true가 되더라도 true까지 실행한다.
		 */
		
		int a = 10;
		int b = 20;
		
		boolean c = ((a += 12)>b || (a == (b+=2)));
		System.out.println("c=" +c);
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		System.out.println("------------------------------");

	}

}
