package ex2;

import java.util.StringTokenizer;

public class Ex6_Split_Tokenizer {
	public static void main(String[] args) {
		//	StringTokenizer �� �ǹ̾��� whitespace�� ��ū���� ������� �ʴ´�.
		//	Split�� whitespace�� �ǹ��ִ� ��ū���� ���
		String str = "�ⷯ��#�丶��#�ƴϾ�#####��#";
		StringTokenizer stz = new StringTokenizer(str, "###");
		System.out.println("Total Token: " + stz.countTokens());
//		System.out.println("0. "+stz.nextToken());
//		System.out.println("1. "+stz.nextToken());
//		System.out.println("2. "+stz.nextToken());
//		System.out.println("3. "+stz.nextToken());
		
		while (stz.hasMoreTokens()) {	//	��ū�� �ν��ϸ� true
			System.out.println(stz.nextToken());	//	��ū�� �߶� ���� ��ȯ
		}
		System.out.println("------------------------------");
		String[] arr = str.split("#");
		System.out.println("�迭�� ����: "+arr.length);
		for (String e : arr) {			//	arr�̶�� �迭�� �ּҰ��� �����ͼ� e �� ������
			System.out.println(e);		//	e �ȿ� �ִ� �ּҰ��� ���
		}
	}
}
