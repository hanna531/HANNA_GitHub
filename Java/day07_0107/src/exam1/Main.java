package exam1;

public class Main {
	public static void main(String[] args) {
		MyService ms = new MyService();
		//	1. selectList, 2.selectView
		
		String op = "1";
		ms.service(op);
	}
}
