/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeamStudy;

/**
 *
 * @author KOSTA
 */
public abstract class Food {
    //  사용자 이름, 요청한 요리의 국가 이름, 그리고 요리 이름을 출력하는 메서드  
    
    public String printFood(String name, String country, String foodname){
        StringBuffer sb = new StringBuffer();
    //  입력받은 이름, 메서드실행후 가져온 값들을 한줄에 정리
        sb.append(name).append(" 님이 주문하신 ").append(country).append("\n").append(foodname).append(" 가 나왔습니다.");
    //  정리한  줄을 문자열로 반환   
    return sb.toString();
    }

}
