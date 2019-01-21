package ex3;
/*
 * 	기본 : interface 정의: 상수와 추상메서드로 구성되어 있다.
 * 	jdk 7 버전 이상부터default, static이 추가됨!
 */
public interface Ex1_Inter {
	public static final int num1 = 10;	//	상수
	abstract public void test();	//	추상메서드
	
	//	축양형!
	//	아래코드는 위 코드와 같음. 없는 부분들은 알아서 생성 시켜줌.
	//	interface 이기 때문에 상수로 만들어 주는것임.
	public int num2 = 20;	//	상수
	public void test2();	//	추상메서드
}
