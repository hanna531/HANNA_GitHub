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
	
	//stack : ���������� �޼��尡 ����Ǵ� ����
	//test�Լ� ȣ��: heap �׽�Ʈ �Լ�
	//�Լ��� ���� ���� �� ������ ���, �ű⿡ �ٽ� num1��¹��� ����

	
}
