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

	
	//	函荐 积己
	SearchListModel sm;
	SelectViewModel	sv;
	
	//	积己磊
	public MyService() {
	}
	
	//	皋家靛
	
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
