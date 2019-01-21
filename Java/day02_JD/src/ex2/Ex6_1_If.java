package ex2;

public class Ex6_1_If {
	public static void main(String[] args) {
		/*
		 * 조건에 만족하지 못하면 if문은 실행되지 않는다.
		 * 그러나 else를 정의해두면 그 외의 조건을 모두 실행시킬 수 있다.
		 * if(조건){실행문1;}{실행문2:}
		 */
	
		int num = 30;
		int v;
		if(num ==10) {
			//컴파일러가 if문은 수행이 안될 수도 있다고 인지해서 if에만 초기화 하면 오류남.
			//따라서 else에도 초기화 해줘야함. (default로)
			v = 10;
			System.out.println(num + "월의 꽃");
		}else {
			v = 20;
			System.out.println(num + "월의 꽃");
		}

	System.out.println(v+"");
		
}
}
