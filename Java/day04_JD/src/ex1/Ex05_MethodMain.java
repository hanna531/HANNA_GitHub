package ex1;

public class Ex05_MethodMain {

	public static void main(String[] args) {
		Ex05_MethodDemo ref = new Ex05_MethodDemo();
		Ex05_ColorOffice eo1 = new Ex05_ColorOffice();//A
		Ex05_ColorOffice eo2 = new Ex05_ColorOffice();//B
		Ex05_ColorOffice eo3 = new Ex05_ColorOffice();//C
		
		//�޼��� ���ڰ����� �츮���� �ּҸ� ���� �����Ѵٸ�
		//���� �ּҸ� ���� �ִٴ� ����
		eo1.jobPaint(ref, "�����");
		eo2.jobPaint(ref, "������");
		eo3.jobPaint(ref, "�����");
		//�޸� ������ �׸��鼭 �� ���尡 �������� ����
		System.out.print("����Ȯ��: " + ref.viewColor());
		//���� �ּҸ� �ٶ󺸰� �ִٰ� ��������� ������� ���
	}

}
