package exam2;
	/*
	 * 	���� ���͵� : �������̽� ���� �н�����
	 * 	��� ����Ŭ���� ����!
	 */
public class ServiceCook {
	/*
	 * 	���񽺰� �������̽��� ����ϴ� ���
	 * 	�տ� ���� ����
	 * 	1.	����� UML
	 * 	2.	�ҽ�
	 */
	Inter i;	
	public void printMenu(String s, String n) {

		if (s.equals("1")) {
			i = new KoreaCook();

		} else if (s.equals("2")){
			i = new IndoCook();

		}
		i.order(n);
	}
	
}
