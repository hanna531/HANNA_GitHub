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

    public Ex2_ServerSocketDemo(int port) { //port는 왜 있는가?? 
        try {
            //지정된 port값으로 서버 소켓을 생성한다.
            ss = new ServerSocket(port); // 가게 만듦 /ServerSocket 객체 생성
            System.out.println("Server Start!"); //Server Start 출력
            executeService(); //
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
        while (true) {// 서비스는 지속적으로 대기해야한다.
            Socket s = ss.accept(); //블로킹 메소드 (클라이언트소켓이 접속될 때까지 대기 = accept 메소드
            // getRemoteSocketAddress = 접속한 클라이언트의 아이피를 확인
            InetSocketAddress isa = (InetSocketAddress) s.getRemoteSocketAddress();
            System.out.println("isa"+isa.getHostName());
            // 클라이언트소켓으로부터 요청을 받아서 응답하는 구조
            InputStream is = s.getInputStream(); // inputStream 선언
            OutputStream os = s.getOutputStream(); // OutputStream 선언

            PrintWriter pw = new PrintWriter(os,true); //브릿지스트림과 flush기능 내재
            //Scanner sc = new Scanner(is);
            //String msg = "";
            //if (sc.hasNext()) {
             //   msg = sc.nextLine();
            //    System.out.println("Clinet Message Log" + sc.nextLine());
            //}

            BufferedReader bis = new BufferedReader(new InputStreamReader(is)); 
//Scanner로 변경 가능
            String msg = bis.readLine();
            // 클라이언트로 전송
            pw.println(msg);
            System.out.println("Client Message Log: " + msg);
            System.out.println("접속자IP: " + isa);
            s.close();
        }
    }

    public static void main(String[] args) {
        new Ex2_ServerSocketDemo(9999);
    }
}
