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
        //  ������� �Է��� ���� ��ĳ�� ��ü ����
        Scanner sc = new Scanner(System.in);
        //  ���� Ŭ���� ����
        ServiceFood sf = new ServiceFood();
        //  ������� �̸��� �޴��� ���� ���� ����
        String name;
        int menu;
        
        //  ������� �̸��� �޴��� �޴� �ڵ�
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("1.�ѱ��丮, 2.�߱��丮, 3.�ε�����");
        menu = Integer.parseInt(sc.nextLine());
        
        //  ���� ���� ���� ����� �̸�, ���� �̸�, ���� �̸��� ���ʴ�� ���
        System.out.println(sf.selectFood(menu, name));
        
    }
}
