package ex1;

public class Ex4_ReferenceDataType {

	public static void main(String[] args) {
		/** ���ڿ�, �̿ܿ� ��ü�� �����ϴ� �ڷ���
		 *  "" => ���ڿ� ���� ������ ������ �ڷ��� String
		 */
		
		System.out.println("�ȳ��ϼ���.");
		System.out.println(10); // ���ڿ��� ��ȯ
		
		int num1 = 100;
		System.out.println(num1); // ���ڰ��� ���� �ᱹ ���ڿ��� ��ȯ
		
		//String ���ڿ� �����ڷ��� ������ ����
		String str;
		// ������ �����ʹ� ��� ����.
		str = "          hi"; //���鵵 ���ڿ��� �ν�
		System.out.println(str);
		System.out.println("length: " + str.length());
		str = "hi" + "one"; // ���ڿ� + ���ڿ� : ���� �ǹ�
		str = "hi" + 10; //���ڿ� + ���ڿ� => ���ڿ�
		str = true + "hi";
		/** str = 100+200; 4byte int ���� ���� ���� String �ȿ� �����Ϸ��ϱ� ����
		 *  String class : Java API���� �������ִ� class
		 *  ���ڿ��� ������ �� �ִ� char���� �迭�� ������ �Ǿ� �ִ�.
		 *  ������ �׳� ���ڿ��� �����ϴ� �����ڷ�� �������
		 */
		
		

	}

}
