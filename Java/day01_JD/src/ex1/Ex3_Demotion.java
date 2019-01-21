package ex1;

public class Ex3_Demotion {
	
	public static void main(String[] args) {
		/** 4byte 이하의 연산은 JVM 연산시 자동으로 4byte로 승격해서 연산함
		 *  demotion, promotion
		 *  java Ex3_Demotino => JVM이 실행 시 main메서드를 호출 (실행)!
		 */
		
		byte n1 = 10;
		byte n2 = 20;
		byte n3 = (byte) (n1 + n2); // byte 는 1byte 이므로 자동으로 4byte 인 int로 바꿔줌
									// 즉 오른쪽 행은 4 byte 가 되는데 그것을 1 byte로 넣으려고 
									// 하면 작아져야 하기 때문에 demotion 이라함
									// 그것을 상쇄하는것이 바로 casting

		System.out.println(n1+ " + " + n2 +" = "+ n3);
		
		/* 연습) short sh1, sh2 에 값을 각각 100, 200을 대입
		*  short sh3에 값을 저장한 후에 출력을 해봅시다.
		*/
		
		short sh1 = 100;
		short sh2 = 200;
		short sh3 = (short) (sh1 + sh2);
		System.out.println(sh1+ " + " +sh2+ " = " +sh3);
		
		char c1 = 'A'; //65
		short c2 = 1;
		char c3 = (char) (c1 + c2);
		System.out.println(c3);
	}
	
}

