package ex2;

public class Ex4_Microwave {

	boolean power; // true: on/false:off
	int time; //���ڷ������� �۵� �ð�
	int watt; //���ڷ������� ��������
	//setPower �� ȣ�� �� �� ���� ������ boolean ���� �޾Ƽ�
	//��� �ʵ� power �� �����ϰ� �� ���� �Ǻ��� �� ������ ����� ���.
	public void setPower(boolean p) {
		//��������� ����
		power = p;
		if (p == true) { //���α׷����� ����!
			System.out.println("���ڷ������� �������ϴ�.");
		} else {
			System.out.println("���ڷ������� �������ϴ�.");
		}
	}
	//��� �ʵ� time�� ���ý�Ŵ
	public void setTime(int t) {
		time = t;
	}
	//��� �ʵ� watt�� ���ý�Ŵ
	public void setWatt(int w) {
		watt = w;
	}
	public String viewControl() {
		int m = time/60;
		int s = time%60;

		return "���ڷ����� ����: �����ð� "+m+"��"+s+"��, ����:"+watt+ "W �Դϴ�.";
	}
}
