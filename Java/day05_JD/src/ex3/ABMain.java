package ex3;

public class ABMain {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.getBb());			//	2	가 출력 (==B)
		System.out.println(b.getaRef().getAa());//	10	가 출력 (==A)
		System.out.println(b.getARef());
	}
}
