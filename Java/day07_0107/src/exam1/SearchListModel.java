package exam1;

public class SearchListModel implements MyInter{
	

	@Override
	public String view() {
		StringBuffer sb = new StringBuffer();
		sb.append("���̵�: 111, ����: 12 \n");
		sb.append("���̵�: 222, ����: 22 \n");
		sb.append("���̵�: 333, ����: 32 \n");
		return sb.toString();
	}

	public String exec() {
		StringBuffer sb = new StringBuffer();
		sb.append("���̵�: 111, ����: 12 \n");
		sb.append("���̵�: 222, ����: 22 \n");
		sb.append("���̵�: 333, ����: 32 \n");
		return sb.toString();
	}
	
//	String[] arr1 = new String[2];
//	public SearchListModel(String[] arr1) {
//		super();
//		this.arr1 = arr1;
//	}
	
}
