/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author HannaRoh
 */
public class Ex3_Exception {

    private int[] var = {100, 200, 300};

    public Ex3_Exception() {
        try {
            //���� for�� for(int e : var) 
            for (int i = 0; i <= var.length; i++) {
                System.out.println(i + " " + var[i]);
            }
        } catch (Exception e) {
            // ������ �޼����� ���
            e.printStackTrace();
            System.out.println("�迭�� ������ �Ѿ����ϴ�.");
            return;
        }finally{
            //����ó���� ������� ������ ������ �Ǵ� ����!
            System.out.println("���� ����! finally ����������");
        }
        System.out.println("���� ����! ������ ����");
    }
}
