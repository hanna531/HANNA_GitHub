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
        //익명 내부 클래스
        MyInter myInter = new MyInter() {
            @Override
            public void myMethod() {
                System.out.println("MyTest");           
            }
                };
    myInter.myMethod();
        System.out.println("----------------------------");
//        매개변수(메서드를 실행할때, 괄호 안에 있는 인자값) 와 리턴값이 없는 void일 경우의 람다식
    MyInter myInter1 = ()->{ // 람다식
        System.out.println("myTest"); //람다식
    };
    myInter1.myMethod();
}
}