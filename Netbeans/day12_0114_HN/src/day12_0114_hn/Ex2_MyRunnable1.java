package day12_0114_hn;
//Thread�� ������ Ŭ�����̱� ?���� �߻�޼����� run()�� ������ ����
// ���� getName() �� ����Ϸ��� ���� �������� �ּҸ� �����ͼ� �Ʒ�ó�� �����
public class Ex2_MyRunnable1 implements Runnable{

    @Override
    public void run() {
        // ������ ���ؿ��� run() ȣ��� �������� �ּҰ�
        System.out.println("@---@"+Thread.currentThread().getName());
    }

    
}
