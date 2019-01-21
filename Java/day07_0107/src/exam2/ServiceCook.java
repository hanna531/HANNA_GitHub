package exam2;
	/*
	 * 	오늘 스터디 : 인터페이스 팀별 학습문제
	 * 	멤버 내부클래스 복습!
	 */
public class ServiceCook {
	/*
	 * 	서비스가 인터페이스를 사용하는 방식
	 * 	앞에 예문 참조
	 * 	1.	결과물 UML
	 * 	2.	소스
	 */
	Inter i;	
	public void printMenu(String s, String n) {

		if (s.equals("1")) {
			i = new KoreaCook();

		} else if (s.equals("2")){
			i = new IndoCook();

		}
		i.order(n);
	}
	
}
