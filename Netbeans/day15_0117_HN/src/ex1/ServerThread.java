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

    //서버에서 브로드캐스팅을 하기 위해서 클라이언트와 연결된 스트림으로 통신하기 위한 PrintWriter의 주소를 제공
    public PrintWriter getPw() {
        return pw;
    }

    public ServerThread(Socket socket, Ex1_Server server) {
        this.socket = socket;
        this.server = server;
        System.out.println("접속자 IP: " + socket.getInetAddress().getHostAddress());
    }

    @Override
    public void run() {
        try {
            pw = new PrintWriter(socket.getOutputStream(), true);
            
            // readLine() 을 담당
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //사용자 소켓으로부터 메세지를 계속 받아야 한다.
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