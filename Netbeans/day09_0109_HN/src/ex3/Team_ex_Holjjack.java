
package ex3;

import java.util.Scanner;

public class Team_ex_Holjjack {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String[] msg={"","Ȧ","¦"};
                int win = 0;
                int comWin;
                comWin = 0;
                int total = 0;
                double winRate = win/(double)total;
                        
                for(;;){
                    System.out.println("-------------------------------------------");
                    System.out.println(total+"��° �����Դϴ�.");
                    System.out.println("Ȧ¦ ������ �����մϴ�. ���� �·���"+winRate+"�Դϴ�.");
                    System.out.println("Ȧ=1 ¦=2 ��������=3 // �������� ������ : ");
                    System.out.println("-------------------------------------------");
                      
                    int comnum= (int)(Math.random()*2)+1; //�����ϳ��� ������ ���ϰ� 0���� �����ϱ⶧���� +1����
                    int i=Integer.parseInt(sc.nextLine());
                    total++;
                    
                    
                    if (i==1){
                        if(i==comnum){
                        System.out.println("��� : "+comnum);
                        System.out.println("������ : "+i);
                        System.out.println("�¸�!");
                        }
                        else{
                        System.out.println("��� : "+comnum);
                        System.out.println("������ : "+i);
                        System.out.println("�й�!");
                        }
                        }
                        
                    else if(i==2) {
                        
                        if(i==comnum){
                        System.out.println("��� : "+comnum);
                        System.out.println("������ : "+i);
                        System.out.println("�¸�!");
                        }
                        else{
                        System.out.println("��� : "+comnum);
                        System.out.println("������ : "+i);
                        System.out.println("�й�!");
                        }
                    }else if(i==3){
                        System.out.println("�������� �·��� "+winRate+"% �Դϴ�.");
                        break;
                    }
                    else {System.out.println("����!! Ȧ=1 ¦=2 ; ��������=3 �� �Ѱ��� �Է����ּ���!");}
                }
              
      
    }
}
