
package team_ex_0108;

import java.util.Scanner;

/**
 *
 * @author HannaRoh
 */
public class Console { //Ŭ���� ����
        public static void main(String[] args) { //���θ޼ҵ� ����
        Scanner sc=new Scanner(System.in); //Scanner ȣ���ؼ� ����/�ʱ�ȭ
        
        //�̸��� ���� �Է¹���
        System.out.println("�̸� :");
        String name=sc.nextLine();
        System.out.println("1.�ѱ� 2.�߱� 3.�ε� :");
        int num=Integer.parseInt(sc.nextLine());
        
        //���ڿ� ���� �ѱ�,�߱�,�ε� ���� ����. 
        //�� case���� randomOrder�� ���� ������ �ش� ������ ������ ������ ��� String�̸��ϵ�
        
        ServiceInter service=new ServiceCook(); // ServiceInter��� ��ü�� ���� service�� ����
        String msg = service.service(num, name); // ���� msg�� return�� ���ڿ��� ����
        System.out.println(msg); // ���� msg�� ����� ���ڿ��� ���
        
    }
    
}
