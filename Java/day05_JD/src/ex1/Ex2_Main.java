package ex1;

public class Ex2_Main {
	public static void testaa() {
		
	}
	public static void main(String[] args) {
		testaa();  // static이기 때문에 생성없이 
		
		//	생성자 호출!
		Ex2_Static ref1 = new Ex2_Static();
		Ex2_Static ref2 = new Ex2_Static();
		Ex2_Static ref3 = new Ex2_Static();
		Ex2_Static ref4 = new Ex2_Static();
		//	각 객체의 메소드 호출
		
		System.out.println(Ex2_Static.num1); //	num1의 대한 주소값이 없기 때문에 0
		
		ref1.startTest();	//num1  -1 최초로 num1++ (0+1)이 되므로 1이 됨
		ref2.startTest();	//num1  -2 	heap영역 안에 있는 새로운 객체인 Ex2_Static(변수 ref2)
							//		에 대해 같은 heap 영역 안에 있으며 다른 객체인 Ex2_Static(변수 ref1)
							//		에 존재하는 num1을 가져오게 되는데 이미 num1에 저장된 숫자 1 에 1을 더함
		ref3.startTest();	//num1  -3
		ref4.startTest();	//num1  -4

		//	출력a

		System.out.println("static num1: " + ref1.getNum1());
		System.out.println("static num1: " + Ex2_Static.getNum1());
		System.out.println("non static num2: "+ ref1.getNum2());
		System.out.println("-----------------------------------");
		System.out.println("static num1: " + ref2.getNum1());
		System.out.println("non static num2: "+ ref2.getNum2());
		System.out.println(Ex2_Static.getNum1());
		System.out.println(Ex2_Static.num1); //	static 접근
		
	}
}
