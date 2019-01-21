package day12_0114_hn;
//Thread를 구현한 클래스이기 ?문에 추상메서드인 run()만 가지고 있음
// 따라서 getName() 을 사용하려면 현재 스레드의 주소를 가져와서 아래처럼 사용함
public class Ex2_MyRunnable1 implements Runnable{

    @Override
    public void run() {
        // 스레스 스텍에서 run() 호출된 스레드의 주소값
        System.out.println("@---@"+Thread.currentThread().getName());
    }

    
}
