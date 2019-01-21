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
//협력회사
public static void main(String[] args) {
        try{
            execute(0);
        } catch (Exception e){
            System.out.println("우리회사 표현식!");
        }
    }
//우리회사 바이트만 코드만 제공!
private static void execute(int num) throws ArithmeticException{
    int nums = 10/num;
    System.out.println("nums: "+nums);
}
    
}
