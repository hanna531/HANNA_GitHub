package ex2;

import java.util.Scanner;

import ex1.Ex06_PojoDemo;

public class Ex01_PojoMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//UI�����
		System.out.println("��ȣ: ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("�̸�: ");
		String name = sc.nextLine();
		System.out.println("���̵�: ");
		String id = sc.nextLine();
		System.out.println("����: ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("�̸��� ���� ���ǿ���: 1.����, 2.�ź� : ");
		int agree = Integer.parseInt(sc.nextLine());
		
		//Pojo�� �Է¹��� ���� setter�� ����
		Ex06_PojoDemo ep = new Ex06_PojoDemo();
		ep.setNum(num);
		ep.setName(name);
		ep.setId(id);
		ep.setAge(age);
		
		if(agree == 1)
		{
			ep.setAgree(true);
		}
		else if(agree == 2)
		{
			ep.setAgree(false);
		}
		
		System.out.println("�˻�");
		System.out.println("ȸ��id: " + ep.getId());
		
		//����Ͻ� ������ ���� Ŭ������ ���ؼ� (��� ���)
		//Pojo��� Ŭ���� ��ü�� ����
		
		Ex01_PojoMember em = new Ex01_PojoMember();
		em.setMember(ep);//�Է��� ȸ�� �� ���θ� ����!
		em.printMember();//�Էµ� ȸ���� ���� ���
		//���Ⱑ�Ը����� �ϸ� ���뼺�� �������Ƿ� 
		//setAge�� �˻��Լ��� �ɰ�����
		//���� ������ �־�� Pojo-> ����Ͻ� �������� ���� ����
		
	}

}
