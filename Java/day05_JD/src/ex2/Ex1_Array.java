package ex2;
/*
 * Ex1_Array
 */

public class Ex1_Array {	//	배열도 객체이다. **********************
	/*
	 * int[] num1:  => 배열을 선언
	 * int[] num1:  = new int[3]: // 생성시 배열의 크기가 필요
	 * 	배열의 선언과 생성과 초기화를 동시에
	 */
	
	private int[ ] num1 = {1,2,3,4,5,6,7,8};

	public Ex1_Array() {
		// 배열의 인덱스는 0부터 시작이됨
		
		System.out.println("배열의 인덱스로 접근:" +num1[0]);
		System.out.println("배열의 길이:" +num1.length);
		System.out.println("-------------------------------");
		for (int i = 0; i < num1.length; i++) {
			System.out.println(num1[i]+"★");
		}
		
//		향상된 for문
		for (int e : num1) {
			System.out.println(e+"♠");
		}
	}
	public static void main(String[] args) {
		
		new Ex1_Array();
	}
}
