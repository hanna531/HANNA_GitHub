package ex2;

import ex1.Ex06_PojoDemo; //�ٸ� ��Ű�� ��

public class Ex01_PojoMember {

	//1.ȸ���� ������ ����ϴ� Ŭ������ ����� ����
	private Ex06_PojoDemo ep;
	
	//2. Ex06_PojoDemo�� ��ü�� ������ ��
	//���� Ŭ������ ����� �����ϴ� �޼��带 ����
	
	public void setMember(Ex06_PojoDemo ep)
	{
		//������ ���̰��� �Ǻ��ؼ� �������� �̼������� �����ϰ�
		//�̼����̸� �����͸� �Է����� ���ϵ��� ����
		//���� �ϱ� ������ �ɷ�����
		if(ep.getAge() <= 19)
		{
			System.out.println("�̼����ڴ� ���� �Ұ�!");
		}
		else
		{
			this.ep = ep;

		}
		//���� �޼��忡�� ��ü ���� �޾ƿ��� �� Ŭ������ ����
		//����ó���� ���� �̼����ڴ� ���� �Ұ����ϰ� ����
	}
	
	//ep(ȸ��)�� ���� ����ϴ� �޼���
	public void printMember()
	{
		if(ep != null)
		{
			//��ü�� �⺻���� null�̹Ƿ� ���� �޼��忡�� ���� ����?�Ѵٸ� null�� �ƴ�
			System.out.println("ȸ����ȣ: "+ep.getNum());
			System.out.println("�̸�: "+ep.getName());
			System.out.println("���̵�: "+ep.getId());
			
			if(ep.isAgree() == true)
			{
				System.out.println("���� ���� �߽��ϴ�.");
			}
			else
			{
				System.out.println("���� �̵��� �߽��ϴ�.");
			}
		}
	}
	
	
}
