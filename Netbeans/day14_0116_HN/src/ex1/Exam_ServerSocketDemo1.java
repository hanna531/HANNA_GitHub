package ex1;

// msg.propertise파일을 작성한다. 
//응답할 데이터를 key=value으로 저장
//예) hi=hello
//bye=goodbye!
//클라이언트GUI로부터 msg를 받으면  서버는 msg.properties를 받아서
//클라이언트로 전송하면, 클라이언트는 서버의 응답메세지를 받아서 jTestArea에 출력

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
            ss = new ServerSocket(port); // 포트 명시!
            System.out.println("running");
            executeService();
            
        } catch (IOException ex) {
            System.out.println("해당 포트는 이미 사용중입니다");
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
            System.out.println("응답: "+value);
            
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
            System.out.println("접속자IP: " + isa);
            s.close();
        }
    }

    public static void main(String[] args) {
        new Exam_ServerSocketDemo1(9999);
    }
}
