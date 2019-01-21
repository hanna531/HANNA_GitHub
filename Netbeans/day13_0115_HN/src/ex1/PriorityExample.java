package ex1;
// 여러 스레드가 하나의 일/목적을 위해 실행되는 것 = 동시성 (p588)
// 여러 스레드가 다른 일을 실행하는 것 = 병렬성

public class PriorityExample {
//스레드 우선순위 테스트를 위해서 10개 생성한 코드
    // 확률적으로 10이 먼저 실행될 경우가 많다 (하지만 순위가 낮아질 수 있따)
public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            //우선순위 1~10까지임. 1이 가장 낮은 값
            Thread thread =new CalcThread("thread: "+i);
            if(i != 10){
                thread.setPriority(Thread.MIN_PRIORITY); // 1
            } else{
                thread.setPriority(Thread.MAX_PRIORITY); // 10 가장 높음
            }
            thread.start();
        }
    }
    
}
