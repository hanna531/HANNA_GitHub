package ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ex2_ServerSocketDemo {

    private ServerSocket ss;

    public Ex2_ServerSocketDemo(int port) { //port�� �� �ִ°�?? 
        try {
            //������ port������ ���� ������ �����Ѵ�.
            ss = new ServerSocket(port); // ���� ���� /ServerSocket ��ü ����
            System.out.println("Server Start!"); //Server Start ���
            executeService(); //
        } catch (IOException ex) {
            System.out.println("�ش� ��Ʈ�� �̹� ������Դϴ�");
            ex.printStackTrace();
        } finally {
            try {
                if (!ss.isClosed()) {
//                    pw.close();
                    ss.close();
                }
            } catch (IOException ex) {
            }
        }
    }

    private void executeService() throws IOException {
        while (true) {// ���񽺴� ���������� ����ؾ��Ѵ�.
            Socket s = ss.accept(); //���ŷ �޼ҵ� (Ŭ���̾�Ʈ������ ���ӵ� ������ ��� = accept �޼ҵ�
            // getRemoteSocketAddress = ������ Ŭ���̾�Ʈ�� �����Ǹ� Ȯ��
            InetSocketAddress isa = (InetSocketAddress) s.getRemoteSocketAddress();
            System.out.println("isa"+isa.getHostName());
            // Ŭ���̾�Ʈ�������κ��� ��û�� �޾Ƽ� �����ϴ� ����
            InputStream is = s.getInputStream(); // inputStream ����
            OutputStream os = s.getOutputStream(); // OutputStream ����

            PrintWriter pw = new PrintWriter(os,true); //�긴����Ʈ���� flush��� ����
            //Scanner sc = new Scanner(is);
            //String msg = "";
            //if (sc.hasNext()) {
             //   msg = sc.nextLine();
            //    System.out.println("Clinet Message Log" + sc.nextLine());
            //}

            BufferedReader bis = new BufferedReader(new InputStreamReader(is)); 
//Scanner�� ���� ����
            String msg = bis.readLine();
            // Ŭ���̾�Ʈ�� ����
            pw.println(msg);
            System.out.println("Client Message Log: " + msg);
            System.out.println("������IP: " + isa);
            s.close();
        }
    }

    public static void main(String[] args) {
        new Ex2_ServerSocketDemo(9999);
    }
}
