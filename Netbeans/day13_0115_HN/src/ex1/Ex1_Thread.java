package ex1;

public class Ex1_Thread extends Thread{

    @Override
    public void run() {
        for(int i=0; i<=10; i++){
            System.out.println(i);
        }

    }
}    
