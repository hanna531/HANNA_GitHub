package ex1;

public class DrawMain {
	public static void main(String[] args) {
		//---------------------�޸� ���� �׸��� �����ϱ�
		Circle cir = new Circle();
		Rect rec = new Rect();
		Triangle tr = new Triangle();
		
		System.out.println("�� : " + 
		cir.drawSomething(cir.getPi(), cir.getRadius(), cir.getRadius()));
		
		System.out.println("�簢�� : " + 
		rec.drawSomething(rec.getWidth(), rec.getHeight(), 1));
		
		System.out.println("�ﰢ�� : " + 
		cir.drawSomething(tr.getHeight(), tr.getWidth(), 0.5f));
	}
}
