package ex3;
//	인터페이스는 다중 구현도 가능하다.
public class MyTeamOldB2 implements MyColor, MyDraw{

	@Override
	public void draw() {
		System.out.println("B팀이 그림을 그립니다.");
		
	}

	@Override
	public void paint() {
		System.out.println("B팀이 초록색을 칠합니다.");
		
	}

}
