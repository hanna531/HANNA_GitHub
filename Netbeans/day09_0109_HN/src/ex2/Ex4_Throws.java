/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 * throws�� ���ܸ� ȣ���� ������ ������ */

public class Ex4_Throws { // pg440 ���� ���ѱ��
    public static void main(String[] args) {
        try{
            execute();
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
    private static void execute() throws InterruptedException{
        Thread.sleep(1000);
        System.out.println("����!");
    }
}
