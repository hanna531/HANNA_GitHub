/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HannaRoh
 */
public class ListExample {

    public static void main(String[] args) {
        List<String> list;

        System.out.println(" <Array = 1, Linked = 2> 원하시는 리스트 번호를 한개 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        int i = Integer.parseInt(sc.nextLine());

        if (i == 1) {
            list = new ArrayList<String>();
            time(list); //부모이기 때문에 변수선언을 새로 하지 않아도 됨!
        } else if (i == 2) {
            list = new LinkedList<String>();
            time(list);
        } else {
            System.out.println("숫자 1 또는 2만 입력해주세요~");
        }
    }

    public static void time(List<String> tm) {
        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for (int j = 0; j < 100000; j++) {
            tm.add(0, String.valueOf(j));
        }
        endTime = System.nanoTime();
        System.out.println(tm.getClass().getSimpleName() + " 걸린시간: " + (endTime - startTime) + "ns");
    }
}
