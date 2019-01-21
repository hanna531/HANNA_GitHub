/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeamStudy;
    
import java.util.Scanner;

/**
 *
 * @author KOSTA
 */
public class Console {
    public static void main(String[] args) {
        //  사용자의 입력을 받을 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        //  서비스 클래스 생성
        ServiceFood sf = new ServiceFood();
        //  사용자의 이름과 메뉴를 받을 변수 생성
        String name;
        int menu;
        
        //  사용자의 이름과 메뉴를 받는 코드
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("1.한국요리, 2.중국요리, 3.인도음식");
        menu = Integer.parseInt(sc.nextLine());
        
        //  받은 값에 따라 사용자 이름, 국가 이름, 음식 이름이 차례대로 출력
        System.out.println(sf.selectFood(menu, name));
        
    }
}
