package ex1;

//외부의 클래스를 불러올 떄 사용; 자동적으로 불러오는 것 이지 적는게 아님
import java.util.Scanner;

public class Ex5_Scanner {

	public static void main(String[] args) {
		/**
		 *  키보드로 입력값을 받기 위한 class
		 *  생성해서 한번 사용 해봅시다. 따라하기 ......
		 *  참조 자료형 변수명 = new 생성할 class 명 ():
		 *  System.out => 출력
		 *  System.in  => 입력
		 *  참조변수에는 생성된 객체의 주소값이 저장 100번지...
		 *  
		 */
		Scanner sc = new Scanner(System.in); // Scanner 라는 class 생성후
		System.out.print("입력 :");
		// sc 참조 변수를 사용해서 nextLine()를 호출해서 입력된 값을 문자열로 반환 한다.
		String msg = sc.nextLine(); // 대기 (한줄단위로 입력 후 enter)
		System.out.println("res :"+msg);	

		System.out.print("name :");
		String name = sc.nextLine(); // 대기 (한줄단위로 입력 후 enter)
		System.out.println("name :"+ name);	
				
	}

}
