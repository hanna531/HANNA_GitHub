package ex2;

import java.util.Scanner;

public class Ex0_MathRandom {
	public static void main(String[] args) {
		/*
		 *  1 ~ 10 ������ ��ġ�߿��� �ϳ��� �Է��ϼ���: 5
		 *  CPU�� �� : 5 / �Է��� �� : 5 / ��� : �����Դϴ�.
		 *  �񱳿��� : A == B �� ������ true
		 *  1 ~ 10 ������ ��ġ�߿��� �ϳ��� �Է��ϼ���: 5
		 *  CPU�� �� : 8 / �Է��� �� : 5 / ���: Ʋ�Ƚ��ϴ�.
		 *  
		 *  1. Scanner ��ü�� �����Ѵ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		// 2. Scanner ��ü���� nextLine �޼��带 ����ؼ� ����ڿ��� ���� �Է°��� ������ ��ȯ�Ѵ�.
		System.out.println("1 ~ 10������ ������ �ϳ��� �Է��ϼ���: ");
		int userNum = Integer.parseInt(sc.nextLine());
		// 3. �Է°��� ���� �� Math.random()�� ȣ���Ͽ� ������ 1~10 �߻��Ѵ�.
		int cpuNum = (int) (Math.random()*10 + 1);
		System.out.println("-----------------------------------------------------");
		// 4. �Է¹��� userNum���� ������ cpuNum�� �񱳿������� ����� ����Ѵ�.
		System.out.println("CPU�� �� :" +cpuNum+" / �Է��� �� : " 
								+userNum+" / "+(userNum == cpuNum));
		
		String msg = "";
		if(userNum == cpuNum) {
			msg = "�����Դϴ�.";
		}else {
			msg = "Ʋ�� �� �Դϴ�.";
		}
		System.out.println("��� : " + msg);
									
	}

}
