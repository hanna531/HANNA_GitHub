package ex1;
// 1. ������ ������ ������ ��ü
//�м� -> ����(��������ų�, ����)
//2. �����ͺ��̽� ����� ��ƼƼ�� �ٷ� ���۰���!
//�������Q �����������, �׻� ���� ����.
public class Ex06_PojoDemo {
	//ȸ���� ������ ����
	private int num; //ȸ����ȣ
	private String name,id;//ȸ���� ������
	private boolean agree;//���ǿ���
	private int age;
	//setter/getter�� �޼��带 �����Ѵ�.
	//alt + shift + s
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	//boolean�� is�� ����(get/set�ƴ�)
	public boolean isAgree() {
		return agree;
	}
	public void setAgree(boolean agree) {
		this.agree = agree;
	}
	//�Ʊ� ����Ű�� ���� ����/���� ������ ����Ʈ ���� ���� �ڵ����� ����
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	//���� �߰�
}
