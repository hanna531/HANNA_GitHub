package ex2;

public class Ex7_Equals {
	public static void main(String[] args) {
		/*
		 *  str 1 과 str 2는 객체를 가리크므로 참조 자료형이다.
		 *  따라서 str 1 과 str 2 는 주소를 저장하고 있고
		 *  new를 통해 각각 생성되었기 때문에 두 주소는 다르다.
		 *  내용을 비교하고 싶다면 equals를 사용해야 하낟.
		 *  
		 *  암묵적 객체 생성방법은 같은 상수값일때,
		 *  상수풀을 공유하기 때문에
		 *  str2 에서는 더이상 새로운 객체를 생성하지 않고
		 *  이미 생성된 str1이 참조한 주소값을 전달받는다.
		 */
		
		String str1 = "Test";
		String str2 = "Test";
		
		if(str1 == str2) {
			System.out.println("str1, str2는 주소가 같다.");
		}else {
			System.out.println("str1, str2는 주소가 다르다");
		}
		
		/*
		 *  str1, str2는 new를 사용해서 각각 합에 생성되었기 때문에 주소는 다르지만 두 객체가 Test 란 문자열 값을
		 *  동일하게 사용하고 있기 때문에 문자열의 내용이 같은지 비교하기 위해서 
		 *  String 클래스의 자원인 equals 메소드를 사용해서 값을 
		 *  몀시적 (new), 묵시적 이던지 값을 비교
		 */
		
		if(str1.equals(str2)) {
			System.out.println("내용이 같다.");
		}else {
			System.out.println("내용이 다르다");
		}
	
		
	}
}
