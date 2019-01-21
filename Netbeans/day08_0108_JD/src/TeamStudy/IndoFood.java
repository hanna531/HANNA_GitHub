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
public class IndoFood extends Food implements Inter{
    //  Food 클래스를 상속하여 출력을 하는 메서드를 재정의
    //  인터페이스를 상속하여 추상메서드를 재정의
    //  원하는 음식의 이름을 만들기 위해 랜덤으로 돌림
    @Override
    public String setfood() {
        
        //  1부터 3 까지의 숫자를 랜덤으로 생성
        int random =(int) ((Math.random()*3)+1);
        String a = new String();
        //  랜덤 음식을 생성후 변수 a 에 저장
            switch (random) {
            case 1:
                a = "카레";
                break;

            case 2:
                a = "난";
                break;
                
            case 3:
                a = "탄도리 치킨";
                break;
            }
        return a;
    }
    
    //  Food 클래스에서 가져온 메서드 재정의
    //  국가 이름과 재정의한 메서드 에서 가져온 음식 이름을 출력
    @Override
    public String sendprint(String name) {
        return printFood(name, "인도요리", setfood());
    }
    
}
