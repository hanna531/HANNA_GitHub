package ex1;
// ���� �����尡 �ϳ��� ��/������ ���� ����Ǵ� �� = ���ü� (p588)
// ���� �����尡 �ٸ� ���� �����ϴ� �� = ���ļ�

public class PriorityExample {
//������ �켱���� �׽�Ʈ�� ���ؼ� 10�� ������ �ڵ�
    // Ȯ�������� 10�� ���� ����� ��찡 ���� (������ ������ ������ �� �ֵ�)
public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            //�켱���� 1~10������. 1�� ���� ���� ��
            Thread thread =new CalcThread("thread: "+i);
            if(i != 10){
                thread.setPriority(Thread.MIN_PRIORITY); // 1
            } else{
                thread.setPriority(Thread.MAX_PRIORITY); // 10 ���� ����
            }
            thread.start();
        }
    }
    
}
