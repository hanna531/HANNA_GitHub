package ex2;

/*
 * Ex2_RefArray
 */
public class Ex2_RefArray {
	//	���� �ڷ��� �迭 ����
	private String[] str;
	private int[] num;	//	�Ϲ� �ڷ���
	public Ex2_RefArray() {
		//	�迭 ����
		str = new String[5];
		str[0]="Kosta188";
		str[1]=new String("Kosta188");
		str[2]=new String("Kosta188");
		str[3]="Kosta188";
		str[4]="Test";
	
	
	for(String e : str) {
		System.out.println(e);
		}
	System.out.println("------------------------");
	System.out.println("Length: "+str.length);
	System.out.println("------------------------");
	System.out.println("�ּҰ� ��1: "+ (str[0]==str[3]));
	System.out.println("�ּҰ� ��2: "+ (str[1]==str[2]));
	}
	
	public static void main(String[] args) {
		new Ex2_RefArray();
	}
	
	
}
