package ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread implements Runnable {

    private Socket socket;
    private Ex1_Server server;
    private BufferedReader br;
    private PrintWriter pw;

    //�������� ��ε�ĳ������ �ϱ� ���ؼ� Ŭ���̾�Ʈ�� ����� ��Ʈ������ ����ϱ� ���� PrintWriter�� �ּҸ� ����
    public PrintWriter getPw() {
        return pw;
    }

    public ServerThread(Socket socket, Ex1_Server server) {
        this.socket = socket;
        this.server = server;
        System.out.println("������ IP: " + socket.getInetAddress().getHostAddress());
    }

    @Override
    public void run() {
        try {
            pw = new PrintWriter(socket.getOutputStream(), true);
            
            // readLine() �� ���
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //����� �������κ��� �޼����� ��� �޾ƾ� �Ѵ�.
            while (true) {
                String clientMsg = br.readLine();
//                server.sendMessage(clientMsg);
                
                if(!clientMsg.equals(null)){
                    server.sendMessage(clientMsg);
                }
            }
        } catch (IOException ex) {
        }

    }
}