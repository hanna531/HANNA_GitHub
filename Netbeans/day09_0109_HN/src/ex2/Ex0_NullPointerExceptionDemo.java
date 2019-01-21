package ex2;

import ex1.MyInter;

public class Ex0_NullPointerExceptionDemo {
    private MyInter myInter;
    public Ex0_NullPointerExceptionDemo(MyInter inter){
        myInter = inter;
    }
    public void execute(){
        // 예외 발생 위치!
        myInter.myMethod();
    }
    public static void main(String[] args) {
        MyInter inter = null;
        new Ex0_NullPointerExceptionDemo(inter).execute();
    }
            
}
