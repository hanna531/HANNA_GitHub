
package team_ex_0108;

/**
 *
 * @author HannaRoh
 */

//public class ChinaCook { 
//
//    String order() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
////클래스 생성
//
//    String order(){
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

public class ChinaCook extends Cook implements OrderInter { //Cook확장, OrderInter구현
    
    String[] order={"훠궈","마라탕","팔보채"}; //String 배열에 3가지 음식이름 저장
    String nation="중국"; // "중국" 문자열을 String 변수인 nation에 저장
    
    public String order(){ // 메서드 정의
       return randomOrder(order,nation); 
       // 메서드 內 실행문 --> randomOrder라는 메서드를 
       // 호출해서 return 받은 값을 return해줌
    }
 }

