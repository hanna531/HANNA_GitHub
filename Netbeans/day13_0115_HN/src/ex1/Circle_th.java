package ex1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Circle_th implements Runnable{

    @Override
    public void run() {
        for(int i = 10; i<=360; i+=10){
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Circle_th.class.getName()).log(Level.SEVERE, null, ex);
            }
        System.out.println(i);
        }

    }
    public static void main(String[] args) {
        Thread ct = new Thread(new Circle_th());
        ct.start();
    }
    
}
