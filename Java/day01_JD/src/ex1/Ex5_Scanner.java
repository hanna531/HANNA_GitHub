package ex1;

//�ܺ��� Ŭ������ �ҷ��� �� ���; �ڵ������� �ҷ����� �� ���� ���°� �ƴ�
import java.util.Scanner;

public class Ex5_Scanner {

	public static void main(String[] args) {
		/**
		 *  Ű����� �Է°��� �ޱ� ���� class
		 *  �����ؼ� �ѹ� ��� �غ��ô�. �����ϱ� ......
		 *  ���� �ڷ��� ������ = new ������ class �� ():
		 *  System.out => ���
		 *  System.in  => �Է�
		 *  ������������ ������ ��ü�� �ּҰ��� ���� 100����...
		 *  
		 */
		Scanner sc = new Scanner(System.in); // Scanner ��� class ������
		System.out.print("�Է� :");
		// sc ���� ������ ����ؼ� nextLine()�� ȣ���ؼ� �Էµ� ���� ���ڿ��� ��ȯ �Ѵ�.
		String msg = sc.nextLine(); // ��� (���ٴ����� �Է� �� enter)
		System.out.println("res :"+msg);	

		System.out.print("name :");
		String name = sc.nextLine(); // ��� (���ٴ����� �Է� �� enter)
		System.out.println("name :"+ name);	
				
	}

}
