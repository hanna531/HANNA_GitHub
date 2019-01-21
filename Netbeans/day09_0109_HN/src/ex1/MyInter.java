/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;
// 익명 내부클래스로 정의될 인터페이스
@FunctionalInterface
//하나의 추상 메서드로 선언된 인터페이스만 람다식의 타겟이 된다.
// 추상메서드가 2개 이상일 경우, 어노테이션에 에러가 생기며, 1개로 만들경우, 에러가 사라진다.

public interface MyInter {
        public void myMethod(); //추상메서드 2개
//      public void myMethod2();
}

