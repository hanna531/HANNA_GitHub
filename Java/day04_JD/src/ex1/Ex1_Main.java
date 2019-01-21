package ex1;

public class Ex1_Main {

	public static void main(String[] args) {
		// 이미 설계된 Ex1_ClassDemo를 객체로 생성하는 방법을 알고 있어요.
		Ex1_ClassDemo ref = new Ex1_ClassDemo();
		// 참조는 . 연산자를 사용해서 사용합니다.
		ref.pay = 1000; // 생성된 Ex1_ClassDemo의 주소 (100) 으로 참조해서 변수 pay에 값을 1000을 기억
						//	heap 메모리에서 참조되어 있는 값을 가지고 오는것!
		
		System.out.println("기억된 pay 의 값은: " + ref.pay);
		//Ex1_ClassDemo 이 가지고 있는 필드안에서 team이란 속성에 적당한 값을 저장하고 출력 해봅시다.
		ref.team = "너의 이름은 뭐니?";
		System.out.println("기억된 team 이름은: " + ref.team);
		
		System.out.println(ref.teamtwo);	//Ex1_ClassDemo에서 저장된 값을 그대로 출력함
		String teamtwo= "이것은 다른것";			//Ex1_ClassDemo에서 저장된 같은 이름을 가져와서 저장
		System.out.println(teamtwo);		//같은 변수 이름이지만 다른 (static)을 출력
		

	}

}
