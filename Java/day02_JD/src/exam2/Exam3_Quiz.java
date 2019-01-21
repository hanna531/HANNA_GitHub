package exam2;

import java.util.Scanner;

public class Exam3_Quiz {

	public static void main(String[] args) {

		exam();
		
	}
	private static void exam() {
			Scanner sc = new Scanner(System.in);	//입력값을 받는 Class
			
			System.out.println("필요한 사과의 수는: ");
			int numOfApples = Integer.parseInt(sc.nextLine());//double로 숫자로 형 변환
			System.out.println("바구니 크기는 10개 고정입니다.");
			int sizeOfBucket = 10;
			
			int numOfBucket =
					numOfApples / sizeOfBucket +
					(numOfApples % sizeOfBucket == 0 ? 0 : 1);
			
			System.out.println("필요한 바구니의 수는 " + numOfBucket + " 개 입니다");
			
		}

		
	}
