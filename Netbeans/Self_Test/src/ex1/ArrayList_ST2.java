package ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_ST2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List list = new ArrayList();

        while (true) {
            System.out.print("[�޴�]" + "\n" + "1.ȸ������ 2.ȸ����� 3.����" + "\n"+"���Ͻô� ��ȣ�� �����ּ���: ");
            String menuNum = sc.nextLine();

            if (menuNum.equals("1")) {
                MemberPJ_ST2 member = new MemberPJ_ST2();

                System.out.print("ID: ");
                member.setId(sc.nextLine());

                System.out.print("�̸�: ");
                member.setName(sc.nextLine());

                System.out.print("����: ");
                member.setAge(Integer.parseInt(sc.nextLine()));

                list.add(member);

            } else if (menuNum.equals("2")) {
                int i = 1;
                for (Object e : list) {
                    System.out.println("--------------------------");
                    MemberPJ_ST2 pojo = new MemberPJ_ST2();
                    System.out.println("[ȸ��" + (i++) + "]");
                    System.out.println("ID: " + pojo.getId());
                    System.out.println("�̸�: " + pojo.getName());
                    System.out.println("����: " + pojo.getAge());
                    System.out.println("--------------------------");
                }
            } else if (menuNum.equals("3")) {
                break;
            
            } else {
                System.out.println("�߸� �Է��ϼ̽��ϴ�.");
            }
        }

    }
}

