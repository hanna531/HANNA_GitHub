package ex1;

public class Ex1_ThreadMain {

    public static void main(String[] args) throws InterruptedException {
        Ex1_Thread ref = new Ex1_Thread();
        ref.start();
        ref.join();
        
        Ex1_Thread ref1 = new Ex1_Thread();
        ref1.start();
    }

}
