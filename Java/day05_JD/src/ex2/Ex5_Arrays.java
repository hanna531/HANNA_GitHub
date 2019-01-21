package ex2;

import java.util.Arrays;
import java.util.Collections;

public class Ex5_Arrays {
	private String[] arr = {"Z", "X", "A", "C", "B"};
	private Integer[] number = {10,3,11,40,22,12};
	public Ex5_Arrays() {
		//	오름 차순 정렬, 내림차순
		Arrays.sort(arr, Collections.reverseOrder());
		for (String e : arr) {
			System.out.print(e+ " ");
		}
		System.out.println(" ");
		//	내림차순
//		Arrays.sort(number);
		Arrays.sort(number, Collections.reverseOrder());
		for (int e : number) {
			System.out.print(e+ " ");
	}
	}
	public static void main(String[] args) {
		new Ex5_Arrays();
	}
}
