package ex3;

public class ABMain {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.getBb());			//	2	�� ��� (==B)
		System.out.println(b.getaRef().getAa());//	10	�� ��� (==A)
		System.out.println(b.getARef());
	}
}
