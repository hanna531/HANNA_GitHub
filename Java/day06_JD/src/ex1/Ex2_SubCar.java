package ex1;

public class Ex2_SubCar extends Ex3_SuperCar {
	public void carColor() {
		System.out.println("�ڽ��� ����ī: Ȳ�ݻ�");
	}

	public void testsub() {
		System.out.println("�ڽ� Ŭ������ �޼��� ȣ��!");
	}

	public static void main(String[] args) {
		// �θ� ���� �ڷ������� �ڽ� Ŭ������ ��ü�� ����
		// �θ��� �ڿ��� ������ �����ϰ�
		// �ڽİ�ü�� Ex3_SubCar() �ڿ��� ������ �Ұ����ϴ�.
		Ex3_SuperCar ref = new Ex2_SubCar();
		System.out.println(ref instanceof Ex2_SubCar);
		ref.carColor(); // �ڽ��� �޼��尡 ���� (�������̵�)
		ref.testSuper();
		// ref.testsub(); //--> �����ڷ����� �θ�Ŭ�����̱� ������
		// ������ �� ����. (but ������ �Ǿ�����..)
	}
}