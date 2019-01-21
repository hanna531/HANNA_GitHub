package ex1;

public class Ex2_Thread implements Runnable{

    private int value;
    
    @Override
    public void run() {
        int i = 0;
        String name = Thread.currentThread().getName();
        while(i<3){
            System.out.println(name+", 지역변수 i 값: "+(++i));
            System.out.println(name+", 멤버필드 value 값: "+(++value));
            System.out.println("Thread Active Cnt: "+Thread.activeCount());
        }
    }
    
    public static void main(String[] args) {
        Ex2_Thread r = new Ex2_Thread();
        new Thread(r).start();
        new Thread(r).start();
    }
    
}
