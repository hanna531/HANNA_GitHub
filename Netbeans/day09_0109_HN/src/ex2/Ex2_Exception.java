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
            //�����Ͻ� ���ܴ� �ַ� ��ġ��, �ܺ� ����̹� ����
            //�����Ϸ��� �����ϴ� �����̴�.
            Thread.sleep(5000);
            System.out.println("Test");
        } catch(InterruptedException ex){
            //���ܰ� �߻����� �� �����ڰ� Ȯ���� �� �ִ� �޼���
            ex.printStackTrace();
        }
    }
}
