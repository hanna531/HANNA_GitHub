package ex3;

public class MainOld {
	public static void main(String[] args) {
		//	A���� �ڿ��� ����� ���ô�.
//		MyTeamOldA ref = new MyTeamOldA();
//		ref.draw();
//		ref.paint();
		
//		�Ʒ� �ڵ�� ���������� �ٸ� ������ ��ü�� �����ϱ� ������ ���� ����� �ƴ�
//		MyColor mc = new MyTeamOldA();
//		mc.paint();
//		MyDraw md = new MyTeamOldA();
//		md.draw();
		
//		�Ʒ� �ڵ�� �ٸ� ������ �ڵ带 ���� �ּҰ����� ����� casting �� �ϴ� ���
//		MyColor ref = new MyTeamOldA();
//		MyDraw ref1 = (MyDraw) ref;
//		ref1.draw();
//		ref.paint();
//		System.out.println(ref == ref1);
		
//		���ο� ������� A �� B �� MyInter��  implement �ϴ� ���
//		MyInter i = new MyTeamNewA();
//		i.draw();
//		i.paint();
		
		MyInter[] mi = new MyInter[2];
		mi [0] = new MyTeamNewA();
		mi [1] = new MyTeamNewB2();
		
		for (MyInter a : mi) {
			a.draw();
			a.paint();
		}
		
		MyInter[] my = {new MyTeamNewA(), new MyTeamNewB2()};
		
		for (MyInter a : my) {
			a.draw();
			a.paint();
		}
	}
}
