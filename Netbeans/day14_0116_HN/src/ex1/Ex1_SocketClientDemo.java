package ex1;

import java.io.IOException;
import java.net.Socket;

public class Ex1_SocketClientDemo {
    private Socket s; // 생성자를 만드는 이유? 모든 메소드를 가져와서 쓰려고!
    // import를 하는 이유
    public Ex1_SocketClientDemo(String host, int port){ //host와 port 매개변수or인자가 있는 생성자
        try{ //try catch 문
            s = new Socket(host, port);// 객체생성 -> 생성자에 있는 인자값 가져옴
        } catch(IOException ex) // 예외 발생시 버려라!
        {
            System.out.println("서버 접속에 문제가 발생했습니다. ");
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Ex1_SocketClientDemo("192.168.0.50", 9999); // host = IP, port
    }
    
}
