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
public class Ex1_Lambda {
    public static void main(String[] args) {
        //�͸� ���� Ŭ����
        MyInter myInter = new MyInter() {
            @Override
            public void myMethod() {
                System.out.println("MyTest");           
            }
                };
    myInter.myMethod();
        System.out.println("----------------------------");
//        �Ű�����(�޼��带 �����Ҷ�, ��ȣ �ȿ� �ִ� ���ڰ�) �� ���ϰ��� ���� void�� ����� ���ٽ�
    MyInter myInter1 = ()->{ // ���ٽ�
        System.out.println("myTest"); //���ٽ�
    };
    myInter1.myMethod();
}
}