package ex3;

public class MainOld {
	public static void main(String[] args) {
		//	A팀의 자원을 사용해 봅시다.
//		MyTeamOldA ref = new MyTeamOldA();
//		ref.draw();
//		ref.paint();
		
//		아래 코드는 가능하지만 다른 번지의 객체를 생성하기 때문에 좋은 방법은 아님
//		MyColor mc = new MyTeamOldA();
//		mc.paint();
//		MyDraw md = new MyTeamOldA();
//		md.draw();
		
//		아래 코드는 다른 번지의 코드를 같은 주소값으로 만드는 casting 을 하는 방법
//		MyColor ref = new MyTeamOldA();
//		MyDraw ref1 = (MyDraw) ref;
//		ref1.draw();
//		ref.paint();
//		System.out.println(ref == ref1);
		
//		새로운 방식으로 A 와 B 가 MyInter를  implement 하는 방식
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
