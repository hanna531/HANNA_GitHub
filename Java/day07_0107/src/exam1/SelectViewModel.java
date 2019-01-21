package exam1;

public class SelectViewModel implements MyInter{
	
	
	@Override
	public String view() {
		
		return "상세보기 : 아이디: 김길동, 나이 30, 주소: 서울";
	}

	public String execview() {
		return "상세보기 : 아이디: 김길동, 나이 30, 주소: 서울";
	}
}
