package ex3;
/*
 * B
 */

public class B {
	private int bb;
	private A aRef;
	//	has ' a����
	
	public B() {
		bb = 2;
		aRef = new A();
	}
	
	public int getBb()	{
		return bb;
	}
	
	public A getaRef() {		//	�ڵ����� �����Ȱ�
		return aRef;
	}
	
	public int getARef() {		//	A Ŭ������ �����Ͽ� getAa()�� ���� aa���� ����Ŵ
		return aRef.getAa();
		
	}
	
}
