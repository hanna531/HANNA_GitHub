package ex1;

public class Ex3_SwitchLabel {
	public static void main(String[] args) {
		ext: for (int i = 0; i < 5; i++) {
			/*
			 * 	���� for��ó�� �ٱ��� for������ Ż���ϰ� ���� ��
			 * 	���� ���� ���� �ٿ��� break���� ǥ�� �� �θ� �ȴ�.
			 * (jdk 5���� ����)
			 */
				for (int j = 0; j < 5; j++) {
					if (j == 3) {
						break ext;
					}
					System.out.println(j + "," + i);
				}
			}
	}
}
