/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author HannaRoh
 */
public class Ex4_Set {
    public static void main(String[] args) {
        //Set�������̽�.. ������ ������� �ʴ� �ߺ����� �����ϴ� �÷���
        //�ߺ��� �����ϸ鼭 �ݺ���, ���� for�� �� ����
       // HashSet<String> h1=new HashSet<>();
        //TreeSet<String> h1=new TreeSet<>(); //��������
        LinkedHashSet<String> h1=new LinkedHashSet<>(); //�Է¼�
        h1.add("Z.Test;");
        h1.add("B.Test;");        
        h1.add("A.Test;");
        h1.add("C.Test;");
        h1.add("B.Test;");
        System.out.println("ũ��: "+h1.size());
        for(String e : h1){
            System.out.println(e);
        }
        System.out.println("---------------------");
        Iterator<String> it = h1.iterator();
        while(it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
    }
}
