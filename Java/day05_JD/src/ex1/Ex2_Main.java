package ex1;

public class Ex2_Main {
	public static void testaa() {
		
	}
	public static void main(String[] args) {
		testaa();  // static�̱� ������ �������� 
		
		//	������ ȣ��!
		Ex2_Static ref1 = new Ex2_Static();
		Ex2_Static ref2 = new Ex2_Static();
		Ex2_Static ref3 = new Ex2_Static();
		Ex2_Static ref4 = new Ex2_Static();
		//	�� ��ü�� �޼ҵ� ȣ��
		
		System.out.println(Ex2_Static.num1); //	num1�� ���� �ּҰ��� ���� ������ 0
		
		ref1.startTest();	//num1  -1 ���ʷ� num1++ (0+1)�� �ǹǷ� 1�� ��
		ref2.startTest();	//num1  -2 	heap���� �ȿ� �ִ� ���ο� ��ü�� Ex2_Static(���� ref2)
							//		�� ���� ���� heap ���� �ȿ� ������ �ٸ� ��ü�� Ex2_Static(���� ref1)
							//		�� �����ϴ� num1�� �������� �Ǵµ� �̹� num1�� ����� ���� 1 �� 1�� ����
		ref3.startTest();	//num1  -3
		ref4.startTest();	//num1  -4

		//	���a

		System.out.println("static num1: " + ref1.getNum1());
		System.out.println("static num1: " + Ex2_Static.getNum1());
		System.out.println("non static num2: "+ ref1.getNum2());
		System.out.println("-----------------------------------");
		System.out.println("static num1: " + ref2.getNum1());
		System.out.println("non static num2: "+ ref2.getNum2());
		System.out.println(Ex2_Static.getNum1());
		System.out.println(Ex2_Static.num1); //	static ����
		
	}
}
