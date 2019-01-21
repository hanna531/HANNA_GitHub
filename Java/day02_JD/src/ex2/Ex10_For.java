package ex2;

public class Ex10_For {

	public static void main(String[] args) {
		// 1 부터 100까지 합을 출력
		
		int sum = 0;
		
		for(int i = 1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~100 합 :" +sum);

	}

}
