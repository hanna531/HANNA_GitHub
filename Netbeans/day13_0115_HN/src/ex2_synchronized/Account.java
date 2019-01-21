package ex2_synchronized;

public class Account {

    private int balance; //초기값을 가질 확률이 높음

    // 동기화 처리를 수향할 수 있다.
    
    public synchronized void withdraw(int money) { //lock pool에서, 먼저 도착한 스레드가 일을 마칠 때까지 다음스레드를 실행하지 않음(간섭x)
        synchronized(this){ //동기화 블록
        if (balance >= money) {
            try {
                Thread.sleep(1000); // 왜 sleep? 특정 프로그램 환경이라면, 지연될 경우너무 빠를 경우, 첫번째 스레드가 수행할때, 
                balance -= money;
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
        System.out.println("검사 :" +balance);
    }
}
