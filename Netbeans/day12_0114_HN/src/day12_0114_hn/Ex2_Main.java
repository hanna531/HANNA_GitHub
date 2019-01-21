package day12_0114_hn;
        
public class Ex2_Main {
    public static void main(String[] args) {
        Ex2_MyThread1 em = new Ex2_MyThread1();
        em.start();
        //스레드는 생명주기가 있어서 두번 Start를 호출할 수 없다.
        // em.start();
        // Runnable 인터페이스를 구현한 클래스
        Thread t1 = new Thread(new Ex2_MyRunnable1());
        t1.start();
        //메인메서드에게 지연시간을 주기 위해서 반복
        for(int i=0; i<10; i++){
        System.out.println(i+"\t");
        }
    }
}
