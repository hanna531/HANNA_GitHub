package ex1;
/*
 * 	클래스 구성
 * 	1. 해더
 * 	2. 멤버필드
 * 	3.멤버메서드
 * 	접근제한자 : private < default < protected < public
 * private : 가장 범위가 좁은 접근제한자
 * 	클래스안에 멤버필드(멤버변수, 인스턴스변수, 속성)에 지정했을 경우 모든 자원은 클래스 영역 안에서만 접근해서 사용이 가능하다.
 * default : 클래스가 정의된 현재 패키지에 속해 있는 모든 외부 클래스들이 접근 할 수 있다.
 *	표기는 하지 않아도 된다.
 * protected : 다른 패키지에 있는 상속관계의 클래스들만 접근할 수 있다.
 * public : 가장 넓은 의미의 접근제한자. (멤버필드는 인터페이스이외에는 모두 public으로 지정하지 않는다.)
 */
public class Ex1_ClassDemo {
	int pay; // 멤버필드 (멤버변수, 인스턴스변수, 속성)
			//	선언되지는 않았다는것은 자동으로 default 타입!
	String team;
	String teamtwo = "과연 출력될까?";
}
