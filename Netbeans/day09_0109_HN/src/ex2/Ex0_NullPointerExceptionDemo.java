package ex2;

import ex1.MyInter;

public class Ex0_NullPointerExceptionDemo {
    private MyInter myInter;
    public Ex0_NullPointerExceptionDemo(MyInter inter){
        myInter = inter;
    }
    public void execute(){
        // ���� �߻� ��ġ!
        myInter.myMethod();
    }
    public static void main(String[] args) {
        MyInter inter = null;
        new Ex0_NullPointerExceptionDemo(inter).execute();
    }
            
}
