package ex2;

public class Ex6_1_If {
	public static void main(String[] args) {
		/*
		 * ���ǿ� �������� ���ϸ� if���� ������� �ʴ´�.
		 * �׷��� else�� �����صθ� �� ���� ������ ��� �����ų �� �ִ�.
		 * if(����){���๮1;}{���๮2:}
		 */
	
		int num = 30;
		int v;
		if(num ==10) {
			//�����Ϸ��� if���� ������ �ȵ� ���� �ִٰ� �����ؼ� if���� �ʱ�ȭ �ϸ� ������.
			//���� else���� �ʱ�ȭ �������. (default��)
			v = 10;
			System.out.println(num + "���� ��");
		}else {
			v = 20;
			System.out.println(num + "���� ��");
		}

	System.out.println(v+"");
		
}
}
