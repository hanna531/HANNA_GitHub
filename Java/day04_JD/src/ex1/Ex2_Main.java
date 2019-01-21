package ex1;

public class Ex2_Main {

	public static void main(String[] args) {	//main = stack
		Ex2_ClassDemo ref = new Ex2_ClassDemo();	//ref = stack
		/*
		 * 	왼쪽 항은 = stack
		 * 	오른쪽 항은 (100번지)의 주소값을 가진채 test(), insertPay()같은 메서드를 heap영역으로 생성
		 * 	" = " 를 통해서 새로 생성된 ref 안에 heap에서 가져온 정보들을 static 영역안에 저장
		 */
		ref.test();
		ref.insertPay(10000);
		ref.insertPay2(10000);
		ref.insertPay3(1000);
		
		ref.insertTeam("이것이 팀이다");
		ref.insertPayTeam(10000, "이름이뭐냐");
		ref.insertTeam2();
		System.out.println(ref.team);
		System.out.println(ref.pay);
	}

}
