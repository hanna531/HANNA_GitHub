package ex2_synchronized;

public class Account {

    private int balance; //�ʱⰪ�� ���� Ȯ���� ����

    // ����ȭ ó���� ������ �� �ִ�.
    
    public synchronized void withdraw(int money) { //lock pool����, ���� ������ �����尡 ���� ��ĥ ������ ���������带 �������� ����(����x)
        synchronized(this){ //����ȭ ���
        if (balance >= money) {
            try {
                Thread.sleep(1000); // �� sleep? Ư�� ���α׷� ȯ���̶��, ������ ���ʹ� ���� ���, ù��° �����尡 �����Ҷ�, 
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
        System.out.println("�˻� :" +balance);
    }
}
