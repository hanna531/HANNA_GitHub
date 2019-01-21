package ex1;

public class Ex5_Const_Tst {
	public Ex5_Const_Tst() {
		//1. 기본 생성자를 수행하러 왔더니 String 매개 변수로 갖는 생성자 호출
		this("test");				
		System.out.println("111");
	}
	
	public Ex5_Const_Tst(String str) {	
		//2. 기본 생성자를 수행하러 왔더니 boolean 매개 변수로 갖는 생성자 호출
		this(true);
		System.out.println("222");
	}
	
	public Ex5_Const_Tst(float f) {		
		//4. 기본 생성자를 수행하러 왔더니 int 매개 변수로 갖는 생성자 호출
		this(10);
		System.out.println("333");
	}
	
	public Ex5_Const_Tst(int n) {		
		//5. 444 출력 후 this(10)을 부른 생성자로 되돌아감. 쭉쭉 되돌아감.
		System.out.println("444");
	}
	
	public Ex5_Const_Tst(boolean b) {	
		//3. 기본 생성자를 수행하러 왔더니 float 매개 변수로 갖는 생성자 호출
		this(3.14f);
		System.out.println("555");
	}
	
	public static void main(String[] args) {
		new Ex5_Const_Tst();	//기본 생성자 호출
	}
}

