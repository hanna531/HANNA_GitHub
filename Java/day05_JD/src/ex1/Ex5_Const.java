package ex1;

public class Ex5_Const {
	public Ex5_Const() {
		//1. �⺻ �����ڸ� �����Ϸ� �Դ��� String �Ű� ������ ���� ������ ȣ��
		this("test");				
		System.out.println("111");
	}
	
	public Ex5_Const(String str) {	
		//2. �⺻ �����ڸ� �����Ϸ� �Դ��� boolean �Ű� ������ ���� ������ ȣ��
		this(true);
		System.out.println("222");
	}
	
	public Ex5_Const(float f) {		
		//4. �⺻ �����ڸ� �����Ϸ� �Դ��� int �Ű� ������ ���� ������ ȣ��
		this(10);
		System.out.println("333");
	}
	
	public Ex5_Const(int n) {		
		//5. 444 ��� �� this(10)�� �θ� �����ڷ� �ǵ��ư�. ���� �ǵ��ư�.
		System.out.println("444");
	}
	
	public Ex5_Const(boolean b) {	
		//3. �⺻ �����ڸ� �����Ϸ� �Դ��� float �Ű� ������ ���� ������ ȣ��
		this(3.14f);
		System.out.println("555");
	}
	
	public static void main(String[] args) {
		new Ex5_Const();	//�⺻ ������ ȣ��
	}
}
