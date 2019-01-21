package exam1;

public class Exam_2 {
	public static void main(String[] args) {
		//1~10 까지의 합 구하기. do while로
		int i = 1;
		int sum = 0;
		
		do {
			sum += i;
			i++;
		} while (i <= 10);
		
		System.out.println("1부터 10까지의 합: " + sum);
		
	}
}
