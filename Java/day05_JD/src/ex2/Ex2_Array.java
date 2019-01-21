package ex2;

import java.util.Scanner;

public class Ex2_Array {
	private String[][] arr1;
	private String msg = "A";
	private Scanner sc;
	private int count;
	
	public Ex2_Array() {
		sc = new Scanner(System.in);
		arr1 = new String[3][2];	//	가로로 2번 에 세로로 3번
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.println("문자열 입력[" +i+"]"+"["+j+"] ");
				msg = sc.nextLine();
				arr1[i][j] = msg;
				count++;
			}
		}	
	}
	
	//+= ""
	public String getData() {
		StringBuffer mysb = new StringBuffer();
		/*
		 * for (int i = 0; i < arr1.length; i++) { for (int j = 0; j < arr1.length; j++)
		 * { mysb.append("arr1[").append(i).append("][").append(j);
		 * mysb.append("]:").append(arr1[i][j]).append("\n");
		 * 
		 * } }
		 */
		
		for (String[] out : arr1) {
			for (String in : out)
				mysb.append(in).append("\n");
		}
		
		return mysb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(new Ex2_Array().getData());

	}
}
