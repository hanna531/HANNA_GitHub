package ex1;

public class Ex2_Switch {
	public static void main(String[] args) {
		//jdk 7���� String ���ڿ� �� ����!
		String s = "B";
		boolean b = true;	//�Ұ�
		char ch = 'A';
		float f = 3.14F;	//�Ұ�
		byte bb = 10;
		double bn = 10.1;	//�Ұ�
		long ll = 10L;		//�Ұ�
		
		
		switch (s) {		//case "����": ����; break;
		case "A":
			System.out.println("���ڿ� A");
			break;
		case "B":
			System.out.println("���ڿ� B");
			break;
		default:
			System.out.println("���� ���ڿ�!");
		}
		//switch���� ���� �ȵǴ� ������ �׽�Ʈ �غ��� �ٶ��ϴ�. 
		
		
		for (int num = 0; num < 3; num++) {

			switch (num) {
			case 0:
				System.out.println("0");
				break;
			case 1:
				System.out.println("1");
				break;

			default:
				System.out.println("���� ����");
				break;
			
			}

		}
	}
}
