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
public class Ex2_Lambda { //Ex1_Lambda�� �ٸ���, �����ڷ����� ����
    
      //���ٽ�
        public Ex2_Lambda(MyInter1 myInter1){
        myInter1.myMethod(200);
        }
        
    public static void main(String[] args) {
        new MyInter1() {
            @Override
            public void myMethod(int argN) {
                int res = argN * 2;
                System.out.println("Result1: "+res);            
            }
        }.myMethod(100);    
        
        // �͸���Ŭ������ ������ �����ڿ��� ����
        Ex2_Lambda ref = new Ex2_Lambda((argN)->{
                int res = argN * 2;
                System.out.println("Result2: "+res);
        });
        
        // �Ű������� �ϳ��� ���� {}�� ������ �� �ִ�.
        MyInter1 myInter2 = argN ->
                System.out.println("Result3: "+argN*2);
        myInter2.myMethod(1000);
   

    
    
    
    }
    
    
//    @FunctionalInterface
//    (int argN) -> {System.out.println("Result1"+res);
//    public class MyInter myInter{
//        myInter mi = (int res)->{System.out.println("Result1: "+res);

}
