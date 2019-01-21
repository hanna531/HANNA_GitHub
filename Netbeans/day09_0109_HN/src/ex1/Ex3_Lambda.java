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
public class Ex3_Lambda {
    public static void main(String[] args) {
        System.out.println("Result: "+new MyInter2() {
            @Override
            public int myMethod(int x, int y) {
                System.out.println("");
                return x+y;
            }
        });
        // 람다식으로 표현해보기 (교재 참조)
        
        // 아래 2가지 표기법은 같다. return문
        MyInter2 myInter2 = (x,y) ->{ return x* y; };
        System.out.println("Result1: "+myInter2.myMethod(100,2));
        //return 문만 있을 땐
        MyInter2 myInter3 = (x,y)->x*y; //리턴문1개만 있을때 . 간략화
        System.out.println("Result2: "+myInter3.myMethod(10,10));
    }
    
}
