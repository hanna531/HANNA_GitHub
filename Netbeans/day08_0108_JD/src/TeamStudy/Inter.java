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
public interface Inter {
    //  인터페이스 생성
    
    //  추상 메서드 생성
    //  반환하는 값은 스트링 객체로
    //  음식 이름을 정해주는 메서드 setfood();
    //  사용자 이름의 인자값을 가진 채 출력을 담당하는 sendprint();
    public String setfood();
    public String sendprint(String name);
}
