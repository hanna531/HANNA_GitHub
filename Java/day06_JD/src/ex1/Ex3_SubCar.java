package ex1;
/*
 * 
 */
public class Ex3_SubCar extends Ex3_SuperCar{
	//	�ڽ�Ŭ������ �޼��带 �߰�
	public void testsub() {
		System.out.println("�ڽ� Ŭ������ �޼��� ȣ��!");
	}

	@Override	
	//	���� ������ �ּ�
	public void carColor() {
		//	super �θ�Ŭ������ �ּ�!
		//	super.carColor();
		System.out.println("�ڽ��� ����ī: Ȳ�ݻ�");
	}
	
	public static void main(String[] args) {
		Ex3_SubCar ref = new Ex3_SubCar();
		System.out.println(ref instanceof Ex3_SubCar);
		ref.carColor();
		ref.testSuper();
		//ref.testsub(); ���� �ڷ����� �θ�Ŭ���� �̱� ������ ���� �� �� ����. (but ������ �Ǿ�����.....)
	}
}
