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

        System.out.println(" <Array = 1, Linked = 2> ���Ͻô� ����Ʈ ��ȣ�� �Ѱ� �Է����ּ���.");
        Scanner sc = new Scanner(System.in);
        int i = Integer.parseInt(sc.nextLine());

        if (i == 1) {
            list = new ArrayList<String>();
            time(list); //�θ��̱� ������ ���������� ���� ���� �ʾƵ� ��!
        } else if (i == 2) {
            list = new LinkedList<String>();
            time(list);
        } else {
            System.out.println("���� 1 �Ǵ� 2�� �Է����ּ���~");
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
        System.out.println(tm.getClass().getSimpleName() + " �ɸ��ð�: " + (endTime - startTime) + "ns");
    }
}
