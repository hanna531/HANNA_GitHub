package ex3;
//인터페이스는 다중 구현도 가능하다.
public class MyTeamOldA implements MyColor, MyDraw{

	@Override
	public void draw() {
		System.out.println("A팀이 그림을 그립니다.");
		
	}

	@Override
	public void paint() {
		System.out.println("A팀이 노란색을 칠합니다.");
		
	}

}
