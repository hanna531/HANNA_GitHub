package ex1;
// ���� �⺻���� ������ 

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex1_ServerSocketDemo {
    private ServerSocket ss;// ���� ����, ������ ss�� ���� 
    public Ex1_ServerSocketDemo(int port) { //���ڰ��� �ִ� ������
        try { // try catch �� = try�ϴٰ� ������ ����� catch��. 
            //������ port������ ���� ������ �����Ѵ�.
            ss = new ServerSocket(port); // ��ü ����
             executeService(); // �޼ҵ带 ������Ѷ�! 
        } catch (IOException ex) { //���ܹ߻��� �����ض� 
            System.out.println("�ش� ��Ʈ�� �̹� ������Դϴ�"); //������� ��Ʈ
            ex.printStackTrace(); // ex���� �޼ҵ� ���� -> ������ ��� ���� 
        } finally { // ����������, ������ ����
            try {
                if (!ss.isClosed()) { //���������� ����������
                    ss.close(); //�ݾƶ�
                }
            } catch (IOException ex) { //���ܹ߻��� �����ض�
            }
        }
    }
    private void executeService() throws IOException { // �����߻��ص� �����ڴ�! 
        while (true) {// ���񽺴� ���������� ����ؾ��Ѵ�.
            Socket s = ss.accept(); //accept = ���� �ǹ�~! ������ ���� ����ΰڴ�.
            // ���� ����, �������� �� �ִ�. / close�� �� ����!
            //���ŷ �޼ҵ� (Ŭ���̾�Ʈ������ ���ӵ� ������ ��� = accept �޼ҵ�
            // ������ Ŭ���̾�Ʈ�� �����Ǹ� Ȯ��
            InetSocketAddress isa = (InetSocketAddress) s.getRemoteSocketAddress();
       //���������� accept�޼ҵ忡 �ִ� getRemoteSocketAddress�޼ҵ带 casting�ؼ� isa��� ������ ����
        }
    }
    public static void main(String[] args) {
        new Ex1_ServerSocketDemo(9999);
    }
}