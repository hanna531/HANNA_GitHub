package ex2;

import java.util.Scanner;

import ex1.Ex06_PojoDemo;

public class Ex01_PojoMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//UI만들기
		System.out.println("번호: ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("이름: ");
		String name = sc.nextLine();
		System.out.println("아이디: ");
		String id = sc.nextLine();
		System.out.println("나이: ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("이메일 수신 동의여부: 1.동의, 2.거부 : ");
		int agree = Integer.parseInt(sc.nextLine());
		
		//Pojo에 입력받은 값을 setter로 저장
		Ex06_PojoDemo ep = new Ex06_PojoDemo();
		ep.setNum(num);
		ep.setName(name);
		ep.setId(id);
		ep.setAge(age);
		
		if(agree == 1)
		{
			ep.setAgree(true);
		}
		else if(agree == 2)
		{
			ep.setAgree(false);
		}
		
		System.out.println("검사");
		System.out.println("회원id: " + ep.getId());
		
		//비즈니스 로직을 갖춘 클래스를 통해서 (기능 사용)
		//Pojo멤버 클래스 객체를 생성
		
		Ex01_PojoMember em = new Ex01_PojoMember();
		em.setMember(ep);//입력한 회원 중 성인만 저장!
		em.printMember();//입력된 회원의 정보 출력
		//성년가입만으로 하면 재사용성이 떨어지므로 
		//setAge와 검사함수를 쪼개야함
		//순수 값만을 넣어야 Pojo-> 비즈니스 로직까지 넣지 말자
		
	}

}
