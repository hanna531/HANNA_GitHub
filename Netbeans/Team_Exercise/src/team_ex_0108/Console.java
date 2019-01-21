
package team_ex_0108;

import java.util.Scanner;

/**
 *
 * @author HannaRoh
 */
public class Console { //클래스 정의
        public static void main(String[] args) { //메인메소드 정의
        Scanner sc=new Scanner(System.in); //Scanner 호출해서 선언/초기화
        
        //이름과 나라를 입력받음
        System.out.println("이름 :");
        String name=sc.nextLine();
        System.out.println("1.한국 2.중국 3.인도 :");
        int num=Integer.parseInt(sc.nextLine());
        
        //숫자에 따라 한국,중국,인도 음식 결정. 
        //각 case별로 randomOrder에 의해 랜덤한 해당 나라의 음식을 포함한 결과 String이리턴됨
        
        ServiceInter service=new ServiceCook(); // ServiceInter라는 객체를 변수 service에 생성
        String msg = service.service(num, name); // 변수 msg에 return된 문자열을 저장
        System.out.println(msg); // 변수 msg에 저장된 문자열을 출력
        
    }
    
}
