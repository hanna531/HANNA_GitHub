/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author HannaRoh
 */
public class Ex3_Lambda {
    public static void main(String[] args) {
        System.out.println("Result: "+new MyInter2() {
            @Override
            public int myMethod(int x, int y) {
                System.out.println("");
                return x+y;
            }
        });
        // ���ٽ����� ǥ���غ��� (���� ����)
        
        // �Ʒ� 2���� ǥ����� ����. return��
        MyInter2 myInter2 = (x,y) ->{ return x* y; };
        System.out.println("Result1: "+myInter2.myMethod(100,2));
        //return ���� ���� ��
        MyInter2 myInter3 = (x,y)->x*y; //���Ϲ�1���� ������ . ����ȭ
        System.out.println("Result2: "+myInter3.myMethod(10,10));
    }
    
}
