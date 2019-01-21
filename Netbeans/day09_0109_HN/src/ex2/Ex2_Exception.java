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
public class Ex2_Exception {
    public static void main(String[] args) throws InterruptedException {
        try{
            //컴파일시 예외는 주로 장치나, 외부 드라이버 관련
            //컴파일러가 인지하는 예외이다.
            Thread.sleep(5000);
            System.out.println("Test");
        } catch(InterruptedException ex){
            //예외가 발생했을 때 개발자가 확인할 수 있는 메세지
            ex.printStackTrace();
        }
    }
}
