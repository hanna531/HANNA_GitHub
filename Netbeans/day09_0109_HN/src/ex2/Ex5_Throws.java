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
public class Ex5_Throws {
//����ȸ��
public static void main(String[] args) {
        try{
            execute(0);
        } catch (Exception e){
            System.out.println("�츮ȸ�� ǥ����!");
        }
    }
//�츮ȸ�� ����Ʈ�� �ڵ常 ����!
private static void execute(int num) throws ArithmeticException{
    int nums = 10/num;
    System.out.println("nums: "+nums);
}
    
}
