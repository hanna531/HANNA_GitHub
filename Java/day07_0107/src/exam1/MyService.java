package exam1;

public class MyService {
	
//	SearchListModel sm = new SearchListModel();
	
//	MyInter mi;
//	
//		if (cmd.equals("1")) {
//			mi = new SearchListModel();
//	} else {
//			mi = new SelectViewModel();
//	}

	
	//	���� ����
	SearchListModel sm;
	SelectViewModel	sv;
	
	//	������
	public MyService() {
	}
	
	//	�޼ҵ�
	
	public String service() {
		
		return "String"; 
	}
	
	public void service(String cmd) {
		if (cmd.equals("1")) {
			sm = new SearchListModel();
			System.out.println(sm.exec());
		} else {
			sv = new SelectViewModel();
			System.out.println(sv.execview());
		}
	}
}
