package ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex2_Mock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex2_MemberJoinInter ref = new Ex2_MemberJoin();
        while (true) {
            System.out.println("메뉴 1:입력, 2:출력, 3:종료");
            String menu = sc.nextLine();
            if (menu.equals("1")) {
                //입력값을 Map에 저장
                Map<String, String> map = new HashMap<>();
                System.out.println("아이디"); // id
                map.put("id", sc.nextLine());
                System.out.println("이름");//name
                map.put("name", sc.nextLine());
                System.out.println("나이");//name
                map.put("age", sc.nextLine());
                // Ex2_MEmberJoinInter 에 메뉴중에 메서드 호출해서 입력 처리 => ArrayList에 저장 하는 기능!
                ref.setAddMember(map);
            } else if (menu.equals("2")) {
                //출력메서드 호출 시 Ex2_MemberJoinInter의 주소를 전달
                printList(ref);
            } else {
                System.out.println("종료");
                break;
            }
        }
    }

    private static void printList(Ex2_MemberJoinInter ref) {
        ArrayList<Map<String, String>> map = ref.getList();
        StringBuffer sb = new StringBuffer();
        for (Map<String, String> e : map) {
            sb.append("ID: ").append(e.get("id")).append("Wt");
            sb.append("Name: ").append(e.get("name")).append("Wt");
            sb.append("Age: ").append(e.get("age")).append("Wn");
        }
        System.out.println(sb);
    }
}
