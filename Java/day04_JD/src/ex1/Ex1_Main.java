package ex1;

public class Ex1_Main {

	public static void main(String[] args) {
		// �̹� ����� Ex1_ClassDemo�� ��ü�� �����ϴ� ����� �˰� �־��.
		Ex1_ClassDemo ref = new Ex1_ClassDemo();
		// ������ . �����ڸ� ����ؼ� ����մϴ�.
		ref.pay = 1000; // ������ Ex1_ClassDemo�� �ּ� (100) ���� �����ؼ� ���� pay�� ���� 1000�� ���
						//	heap �޸𸮿��� �����Ǿ� �ִ� ���� ������ ���°�!
		
		System.out.println("���� pay �� ����: " + ref.pay);
		//Ex1_ClassDemo �� ������ �ִ� �ʵ�ȿ��� team�̶� �Ӽ��� ������ ���� �����ϰ� ��� �غ��ô�.
		ref.team = "���� �̸��� ����?";
		System.out.println("���� team �̸���: " + ref.team);
		
		System.out.println(ref.teamtwo);	//Ex1_ClassDemo���� ����� ���� �״�� �����
		String teamtwo= "�̰��� �ٸ���";			//Ex1_ClassDemo���� ����� ���� �̸��� �����ͼ� ����
		System.out.println(teamtwo);		//���� ���� �̸������� �ٸ� (static)�� ���
		

	}

}
