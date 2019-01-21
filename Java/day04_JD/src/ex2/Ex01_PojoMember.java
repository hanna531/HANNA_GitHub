package ex2;

import ex1.Ex06_PojoDemo; //다른 패키지 안

public class Ex01_PojoMember {

	//1.회원의 정보를 기억하는 클래스를 멤버로 저장
	private Ex06_PojoDemo ep;
	
	//2. Ex06_PojoDemo의 객체를 생선한 후
	//현재 클래스의 멤버에 저장하는 메서드를 정의
	
	public void setMember(Ex06_PojoDemo ep)
	{
		//들어오는 나이값을 판별해서 성년인지 미성년인지 구분하고
		//미성년이면 데이터를 입력하지 못하도록 구현
		//일을 하기 전부터 걸러내게
		if(ep.getAge() <= 19)
		{
			System.out.println("미성년자는 가입 불가!");
		}
		else
		{
			this.ep = ep;

		}
		//메인 메서드에서 객체 값을 받아오고 이 클래스에 저장
		//예외처리를 통해 미성년자는 가입 불가능하게 만듦
	}
	
	//ep(회원)의 값을 출력하는 메서드
	public void printMember()
	{
		if(ep != null)
		{
			//객체의 기본값이 null이므로 메인 메서드에서 따로 저장?한다면 null은 아님
			System.out.println("회원번호: "+ep.getNum());
			System.out.println("이름: "+ep.getName());
			System.out.println("아이디: "+ep.getId());
			
			if(ep.isAgree() == true)
			{
				System.out.println("수신 동의 했습니다.");
			}
			else
			{
				System.out.println("수신 미동의 했습니다.");
			}
		}
	}
	
	
}
