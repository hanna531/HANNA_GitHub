package exam2;

import java.util.Scanner;

public class Exam3_Quiz {

	public static void main(String[] args) {

		exam();
		
	}
	private static void exam() {
			Scanner sc = new Scanner(System.in);	//�Է°��� �޴� Class
			
			System.out.println("�ʿ��� ����� ����: ");
			int numOfApples = Integer.parseInt(sc.nextLine());//double�� ���ڷ� �� ��ȯ
			System.out.println("�ٱ��� ũ��� 10�� �����Դϴ�.");
			int sizeOfBucket = 10;
			
			int numOfBucket =
					numOfApples / sizeOfBucket +
					(numOfApples % sizeOfBucket == 0 ? 0 : 1);
			
			System.out.println("�ʿ��� �ٱ����� ���� " + numOfBucket + " �� �Դϴ�");
			
		}

		
	}
