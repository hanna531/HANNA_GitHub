package ex3;
/*
 * B
 */

public class B {
	private int bb;
	private A aRef;
	//	has ' a관계
	
	public B() {
		bb = 2;
		aRef = new A();
	}
	
	public int getBb()	{
		return bb;
	}
	
	public A getaRef() {		//	자동으로 생성된것
		return aRef;
	}
	
	public int getARef() {		//	A 클래스를 참조하여 getAa()를 통해 aa값을 가르킴
		return aRef.getAa();
		
	}
	
}
