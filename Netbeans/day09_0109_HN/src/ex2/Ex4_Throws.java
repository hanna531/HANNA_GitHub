/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 * throws는 예외를 호출한 쪽으로 위임함 */

public class Ex4_Throws { // pg440 예외 떠넘기기
    public static void main(String[] args) {
        try{
            execute();
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
    private static void execute() throws InterruptedException{
        Thread.sleep(1000);
        System.out.println("실행!");
    }
}
