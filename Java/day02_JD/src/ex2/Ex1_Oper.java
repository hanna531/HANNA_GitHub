package ex2;

public class Ex1_Oper {

	public static void main(String[] args) {
			//�Ϲ� �ڷ����� ��� ���� ������
		
		int a = 0;
		a += 10;	// a = a + 10;
		System.out.println("1) " + (a-=5));
		System.out.println("2) " + (a*=5));
		System.out.println("3) " + (a/=5));
		System.out.println("4) " + (a%=5));
		/*
		 * String  class �� �Һ����� Ư¡�� �ֱ� ������ ++ �����ϸ�
		 * ������ ���ڿ� ��ü�� �������÷����� ��� �����ϴ�
		 * ���ʿ��� �޸𸮰� �����! => �ڷ��������� �������� ���� (class �� ��ä (object))
		 */
		
		String msg = "ABC";
		msg += "DEF";
		msg += "ZZZ";
		System.out.println(msg);
		
		/*
		 * Buffer�� ������ ����ؼ� ���ڿ��� �����ϰ� �����ؼ� (append() ȣ���ؼ� ���ۿ� ����)
		 * ����� �� �ִ�.
		 */
		
		StringBuffer sb = new StringBuffer();
		sb.append("ABC").append("DEF").append("ZZZ");
		System.out.println(sb);
		
	}

}
