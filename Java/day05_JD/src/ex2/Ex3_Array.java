package ex2;

public class Ex3_Array {
	private int[] num1 = {100, 200};
	private int[] num2 = {1000, 2000, 3000};
	private int[][] test;
	public Ex3_Array() {
		//������ �迭���� 1���� �迭�� ���� ���������� ������ �� �ִ�.
		test = new int[2][];
		test[0] = num1;
		test[1] = num2;
	}
	
	public String getData() {
		StringBuffer mysb = new StringBuffer();
//		for (int i = 0; i < test.length; i++) {
//			for (int j = 0; j < test[i].length; j++) {
//				mysb.append("test[").append("][").append(j);
//				mysb.append("]:").append("test[i][j]").append("\n");
//			}
//		}
//		
		//	1���� �迭�� ����: : 2
		for (int out[] : test) {		//	2���� �迭 ��ġ	num2 = {1000, 2000, 3000};
			//	�ּҸ� ���ؼ� 1���� �迭�� �����ؼ� �о��
			for (int in : out) {		//	1���� �迭 ��ġ	num1 = {100, 200};
				mysb.append(in).append("\n");
			}
		}
		return mysb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(new Ex3_Array().getData());
	}
	
	
	//�޸� ����
}
