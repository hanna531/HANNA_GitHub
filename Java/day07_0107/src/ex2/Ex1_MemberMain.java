package ex2;

public class Ex1_MemberMain {
	public static void main(String[] args) {
		/*
		 * 	�ٽ�����Ʈ *************************************
		 * 	���� Ŭ������ �����Ϸ��� �� ����
		 * 	�ܺ� Ŭ������ ������ �� �� �ּҸ� �����ؼ�
		 * 	�ٽ� ���� Ŭ������ �����ϴ� ����̴�.
		 * 	1. �ܺ� Ŭ���� ����
		 */
		Ex1_MemberInner outer = new Ex1_MemberInner();
		
		/*
		 * 	2. �ܺ� Ŭ������ �ּҰ��� ������ ���� ���� outer��
		 * 	���� Ŭ������ ����
		 */
		outer.superA();					//	SuperA���� ���ǵ� �޼��带 ȣ��
		Ex1_MemberInner.Inner inner;	//	���� Ŭ������ ���¸� ���� ���� inner����
		inner = outer.new Inner();		//	���ǵ� ������ 
		inner.printData();
		inner.superB();
		System.out.println("====================================");
		
		/*
		 * 	��������)
		 * 	�ܺ�Ŭ���� ���� �� ���� Ŭ���� �����ϰ��� �Ҷ�
		 * ���ٷ� �����ϰ� �ٷ� printData()
		 */
		
		new Ex1_MemberInner().new Inner().printData();
	}
}
