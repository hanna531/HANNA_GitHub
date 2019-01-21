
package team_ex_0108;

/**
 *
 * @author HannaRoh
 */
public interface OrderInter { //interface 정의 = 상수, 추상메서드만 있음
    //나라 이름을 저장할 필드멤버
    String[] order={"요리입력"}; // "요리입력"을 문자열 배열인 상수order에 저장. 
    String nation="나라입력"; // "나라입력"을 문자열 상수nation에 저장
    
    //숫자를 한개 입력받아 해당 숫자에 해당하는 나라의 음식을 한개 리턴한다.
    public String order(); // 추상메서드 선언
}
