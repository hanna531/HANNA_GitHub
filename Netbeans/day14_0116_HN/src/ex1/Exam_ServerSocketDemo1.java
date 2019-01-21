package ex1;

// msg.propertise������ �ۼ��Ѵ�. 
//������ �����͸� key=value���� ����
//��) hi=hello
//bye=goodbye!
//Ŭ���̾�ƮGUI�κ��� msg�� ������  ������ msg.properties�� �޾Ƽ�
//Ŭ���̾�Ʈ�� �����ϸ�, Ŭ���̾�Ʈ�� ������ ����޼����� �޾Ƽ� jTestArea�� ���

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.Scanner;



public class Exam_ServerSocketDemo1 {
    
    Properties properties; 
    private ServerSocket ss;

    public Exam_ServerSocketDemo1(int port) {
        try {
            ss = new ServerSocket(port); // ��Ʈ ���!
            System.out.println("running");
            executeService();
            
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
        while (true) {
            Socket s = ss.accept(); 
            System.out.println("socket start");
            properties = new Properties() ;
            properties.load(new FileReader("C:\\HANNA_GitHub\\HANNA_GitHub\\Netbeans\\day14_0116_HN\\src\\ex1\\message.properties"));
            
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            PrintWriter pw = new PrintWriter(os,true);
            
            BufferedReader bis = new BufferedReader(new InputStreamReader(is));
            String key = bis.readLine();
            String value = properties.getProperty(key);
            pw.println(value);
            System.out.println("����: "+value);
            
//          String value = properties.getProperty(readLine());
    
            s.close();
            
            InetSocketAddress isa = (InetSocketAddress) s.getRemoteSocketAddress();

//            InputStream is = s.getInputStream();
//            OutputStream os = s.getOutputStream();

//            Scanner sc = new Scanner(is);
//            String msg = "";
//            while (sc.hasNext()) {
//                msg += sc.nextLine();
//                System.out.println("Clinet Message Log" + sc.nextLine());
//            }
//            System.out.println("Client Message Log: " + msg);
            System.out.println("������IP: " + isa);
            s.close();
        }
    }

    public static void main(String[] args) {
        new Exam_ServerSocketDemo1(9999);
    }
}
