package ex1;

/*
 * overloading: �޼ҵ带 ���� ���� ��Ģ
 * 	������ Ÿ���̳� ������ �޶�� �Ѵ�.
 */
public class Ex1_Overload {
	public void drawCircle(int r) {
		System.out.println("�������� "+r+" �� ���� �׸���.");
	}
	public void drawRec(int w, int h) {
		System.out.println("�ʺ�: "+w+", ����: "+h+"�� �簢���� �׸���.");
	}
	public void lineDraw(int x, int y, int len) {
		System.out.println("��ǥ x: "+x+"��ǥ y: "+y);
		System.out.println("���̰� "+len+"�� ���� �׸���");
	}
	public static void main(String[] args) {
		Ex1_Overload ref = new Ex1_Overload();
		ref.draw(3);
		ref.draw(45, 45, 1);
		ref.draw(3, "5");
		ref.draw("4", 5);
	}
	
	/*
	 * 	�޼ҵ� �����ε�: �޼ҵ��� �̸��� ���� �ص����ν�
	 * 	�޼ҵ��� �������� �ϰ����� �����Ѵ�.
	 */
	public void draw(int r) {
		System.out.println("�������� "+r+" �� ���� �׸���.");
	}
	public void draw(int w, String h) {
		System.out.println("�ʺ�: "+w+", ����: "+h+"�� �簢���� �׸���.");
	}
	public void draw(String h, int w) {
		System.out.println("�ʺ�: "+w+", ����: "+h+"�� �簢���� �׸���.");
	}
	public void draw(int x, int y, int len) {
		System.out.println("��ǥ x: "+x+" ��ǥ y: "+y);
		System.out.println("���̰� "+len+"�� ���� �׸���");
	}
}
