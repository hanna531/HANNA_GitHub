package ex2;
/*
 * 	Ex1_Child
 */
public class Ex1_Child extends Ex1_Parent{
	
	//2. Object �� �޼��带 ������ �Ѱ�
	
	@Override
	public String toString() {
		return String.valueOf("��� ���� �ݾ�:" + getPay());
	}
	
	//1. �����Ǹ� �ؾ߸� Ex_Parent �� ��ӹ��� �� �ִ�.
	@Override
	public void moveMountain() {
		System.out.println("���� ���������� �ű� �� " + toString()+ "�޾Ҵ�");
		
	}	
}
