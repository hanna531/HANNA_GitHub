package ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_ST2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List list = new ArrayList();

        while (true) {
            System.out.print("[메뉴]" + "\n" + "1.회원가입 2.회원출력 3.종료" + "\n"+"원하시는 번호를 적어주세요: ");
            String menuNum = sc.nextLine();

            if (menuNum.equals("1")) {
                MemberPJ_ST2 member = new MemberPJ_ST2();

                System.out.print("ID: ");
                member.setId(sc.nextLine());

                System.out.print("이름: ");
                member.setName(sc.nextLine());

                System.out.print("나이: ");
                member.setAge(Integer.parseInt(sc.nextLine()));

                list.add(member);

            } else if (menuNum.equals("2")) {
                int i = 1;
                for (Object e : list) {
                    System.out.println("--------------------------");
                    MemberPJ_ST2 pojo = new MemberPJ_ST2();
                    System.out.println("[회원" + (i++) + "]");
                    System.out.println("ID: " + pojo.getId());
                    System.out.println("이름: " + pojo.getName());
                    System.out.println("나이: " + pojo.getAge());
                    System.out.println("--------------------------");
                }
            } else if (menuNum.equals("3")) {
                break;
            
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }

    }
}

