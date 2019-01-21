
package ex3;

import java.util.Scanner;

public class Team_ex_Holjjack {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String[] msg={"","홀","짝"};
                int win = 0;
                int comWin;
                comWin = 0;
                int total = 0;
                double winRate = win/(double)total;
                        
                for(;;){
                    System.out.println("-------------------------------------------");
                    System.out.println(total+"번째 게임입니다.");
                    System.out.println("홀짝 게임을 시작합니다. 현재 승률은"+winRate+"입니다.");
                    System.out.println("홀=1 짝=2 게임종료=3 // 도전자의 선택은 : ");
                    System.out.println("-------------------------------------------");
                      
                    int comnum= (int)(Math.random()*2)+1; //둘중하나의 범위를 정하고 0부터 시작하기때문에 +1설정
                    int i=Integer.parseInt(sc.nextLine());
                    total++;
                    
                    
                    if (i==1){
                        if(i==comnum){
                        System.out.println("상대 : "+comnum);
                        System.out.println("도전자 : "+i);
                        System.out.println("승리!");
                        }
                        else{
                        System.out.println("상대 : "+comnum);
                        System.out.println("도전자 : "+i);
                        System.out.println("패배!");
                        }
                        }
                        
                    else if(i==2) {
                        
                        if(i==comnum){
                        System.out.println("상대 : "+comnum);
                        System.out.println("도전자 : "+i);
                        System.out.println("승리!");
                        }
                        else{
                        System.out.println("상대 : "+comnum);
                        System.out.println("도전자 : "+i);
                        System.out.println("패배!");
                        }
                    }else if(i==3){
                        System.out.println("도전자의 승률은 "+winRate+"% 입니다.");
                        break;
                    }
                    else {System.out.println("오류!! 홀=1 짝=2 ; 게임종료=3 중 한개를 입력해주세요!");}
                }
              
      
    }
}
