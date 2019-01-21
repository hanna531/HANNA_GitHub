package ex2;

import java.util.StringTokenizer;

public class Ex6_Split_Tokenizer {
	public static void main(String[] args) {
		//	StringTokenizer 는 의미없는 whitespace를 토큰으로 취급하지 않는다.
		//	Split는 whitespace도 의미있는 토큰으로 취급
		String str = "기러기#토마토#아니야#####응#";
		StringTokenizer stz = new StringTokenizer(str, "###");
		System.out.println("Total Token: " + stz.countTokens());
//		System.out.println("0. "+stz.nextToken());
//		System.out.println("1. "+stz.nextToken());
//		System.out.println("2. "+stz.nextToken());
//		System.out.println("3. "+stz.nextToken());
		
		while (stz.hasMoreTokens()) {	//	토큰을 인식하면 true
			System.out.println(stz.nextToken());	//	토큰을 잘라서 값을 변환
		}
		System.out.println("------------------------------");
		String[] arr = str.split("#");
		System.out.println("배열의 길이: "+arr.length);
		for (String e : arr) {			//	arr이라는 배열의 주소값은 가져와서 e 에 대입함
			System.out.println(e);		//	e 안에 있는 주소값을 출력
		}
	}
}
