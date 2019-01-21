package ex1;

import java.io.IOException;
import java.net.Socket;

public class Ex1_SocketClientDemo {
    private Socket s; // �����ڸ� ����� ����? ��� �޼ҵ带 �����ͼ� ������!
    // import�� �ϴ� ����
    public Ex1_SocketClientDemo(String host, int port){ //host�� port �Ű�����or���ڰ� �ִ� ������
        try{ //try catch ��
            s = new Socket(host, port);// ��ü���� -> �����ڿ� �ִ� ���ڰ� ������
        } catch(IOException ex) // ���� �߻��� ������!
        {
            System.out.println("���� ���ӿ� ������ �߻��߽��ϴ�. ");
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Ex1_SocketClientDemo("192.168.0.50", 9999); // host = IP, port
    }
    
}
