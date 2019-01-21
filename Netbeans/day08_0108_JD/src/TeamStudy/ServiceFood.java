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
public class ServiceFood implements Serviceinter{
    //  음식이름을 
    //  인터페이스 를 가져오기 위한 변수 선언
    Inter in;
    
    //  버튼에 따른 숫자와 사용자 이름을 순서적으로 받아와서
   @Override
    public String selectFood(int i, String name){
        //  버튼값에 따라 원하는 클래스를 생성
        if (i == 1) {
            in = new KoreaFood();
        } else if (i == 2){
            in = new ChinaFood();
        } else if (i == 3){
            in = new IndoFood();
        }
        //  생성한 클래스 에 포함된 메서드 실행
    return in.sendprint(name);
    } 
}
