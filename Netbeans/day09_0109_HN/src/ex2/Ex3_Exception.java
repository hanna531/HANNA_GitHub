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
            //향상된 for문 for(int e : var) 
            for (int i = 0; i <= var.length; i++) {
                System.out.println(i + " " + var[i]);
            }
        } catch (Exception e) {
            // 예외의 메세지를 출력
            e.printStackTrace();
            System.out.println("배열의 범위를 넘었습니다.");
            return;
        }finally{
            //예외처리와 상관없이 무조건 수행이 되는 영역!
            System.out.println("실행 종료! finally 마무리영역");
        }
        System.out.println("실행 종료! 마무리 영역");
    }
}
