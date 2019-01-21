package exam2;

public class IndoCook implements Inter{

	@Override
	public void order(String name) {
		System.out.println(name + " 님이 인도 요리를 주문했습니다.");
	}

}
