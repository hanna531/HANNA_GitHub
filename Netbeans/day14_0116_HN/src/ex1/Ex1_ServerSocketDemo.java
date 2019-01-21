package ex1;
// 가장 기본적인 서버의 

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex1_ServerSocketDemo {
    private ServerSocket ss;// 서버 소켓, 생성자 ss로 선언 
    public Ex1_ServerSocketDemo(int port) { //인자값이 있는 생성자
        try { // try catch 문 = try하다가 문제가 생기면 catch로. 
            //지정된 port값으로 서버 소켓을 생성한다.
            ss = new ServerSocket(port); // 객체 생성
             executeService(); // 메소드를 실행시켜라! 
        } catch (IOException ex) { //예외발생시 실행해라 
            System.out.println("해당 포트는 이미 사용중입니다"); //사용중인 포트
            ex.printStackTrace(); // ex안의 메소드 실행 -> 에러문 모두 실행 
        } finally { // 마지막에는, 무조건 실행
            try {
                if (!ss.isClosed()) { //서버소켓이 열려있으면
                    ss.close(); //닫아라
                }
            } catch (IOException ex) { //예외발생시 실행해라
            }
        }
    }
    private void executeService() throws IOException { // 에러발생해도 버리겠다! 
        while (true) {// 서비스는 지속적으로 대기해야한다.
            Socket s = ss.accept(); //accept = 문의 의미~! 서버의 문을 열어두겠다.
            // 문만 열고, 대기상태일 수 있다. / close할 때 닫힘!
            //블로킹 메소드 (클라이언트소켓이 접속될 때까지 대기 = accept 메소드
            // 접속한 클라이언트의 아이피를 확인
            InetSocketAddress isa = (InetSocketAddress) s.getRemoteSocketAddress();
       //서버소켓의 accept메소드에 있는 getRemoteSocketAddress메소드를 casting해서 isa라는 변수에 저장
        }
    }
    public static void main(String[] args) {
        new Ex1_ServerSocketDemo(9999);
    }
}