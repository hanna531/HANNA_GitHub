
package team_ex_0108;

/**
 *
 * @author HannaRoh
 */
public class ServiceCook implements ServiceInter{ // ServiceCook클래스가 ServiceInter를 구현
    
    public String service(int num,String name){ 
        //메소드. num & name을 받아서, 메서드안에서 지역변수로써 사용한다.
        // 중괄호 안에서 선언된 변수는 모두 지역변수
        // 외부에서 값을 가져올 때는, 메소드명 뒤에 소괄호 사용가능
        // 같은 클래스 안에서는 멤버필드에 있는 변수들을 사용할 때,
        // 소괄호 유무 모두 가능; 소괄호가 더 용이함
        
        String msg=""; // 문자열 msg 선언, " "을 저장
        switch(num){ // if문과 동일 변수; 10번 라인에 있는 num을 가지고 와서
            case 1: //case 뒤에 있는 값과 비교 후, 실행 or NOT 결정
                msg= new KoreaCook().order(); //new를 보니, 생성자! 객체 생성
                break; //빠져나오다
            case 2:
                msg= new ChinaCook().order();
                break;
            case 3:
                msg= new IndoCook().order();
                break;
            default: // num이 위에 언급된 값이 아닐 경우
                msg= "에러"; // 변수msg에 "에러" 문자열 저장
        }
        return name+"님이 "+msg+"\n"; // 4개의 문자열을 1개의 문자열로 합쳐서 리턴함
                                        // 1개 이상의 문자열을 + 연산 할때는, 결과값이 "문자열"임
    }
    
    
}
