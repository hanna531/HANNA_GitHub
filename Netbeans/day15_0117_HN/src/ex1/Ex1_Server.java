package ex1;
// server: socket --> [bind() -> listen()](자바가캡슐화) -> accept() -> Stream() -> close() //중요!!
// bind() "port socket에 대한 정보를 할당"

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// listen(): 클라이언트의 접속요청을 확인"
// accept() : 클라이언트의 소켓을 생성
/* Ex1_Server
1. ServerSocket을 생성한다

2. accept() 호출해서 접속된 Socket을 반환한다.
2-1. 다중 접속자를 처리하기 위해서 ArrayList를 사용한다.
ArrayList에 들어오는 소켓! --> 스레드가 관리를 해줌!

3. Socket에서 제공하는 Stream으로 통신한다.
3-1. readLine()을 담당해줄 Thread 제작한다.

참고/ 특별한 요청이 없을 때는 GUI로 서버를 제작하지는 않는다

Server관리에 따른 다른 

** Runnable만 구현할 수 있는 메서드! --??

** Runnable 안에 있는 중요한 run() 
여기선.. socket.getInputStream() & br.readLine() 이 중요함! 이것이 스레드가 할일!
 */
public class Ex1_Server {

//제작순서 1. ServerSocket을 생성한다.
    private ServerSocket ss;
    
// 2-1을 위한 선언
    private ArrayList<ServerThread> cList;

// Thread Group을 관리하기 위한 pool
    private ExecutorService executorService;

    public Ex1_Server() {

        try {
            //서버가 접속할 수 있도록 port 오픈
            ss = new ServerSocket(9999);
            System.out.println("Server Start");
            cList = new ArrayList<>();
            executorService = Executors.newFixedThreadPool(3);
        } catch (IOException ex) {
            System.out.println("이미 사용중인 port입니다");
        }
    }
    public void execute(){
        //지속해서 Socket을 받는 서비스를 해야한다.
        //2. accept() 호출해서 접속된 Socket을 반환한다.
        
        while(true){
            try{
                //*** Socket은 하나의 접속만을 담당한다.
                // 사용자에게 응답을 위임한 Thread를 각각 생성해서
                //start()하면서, 사용자의 소켓의 주소값을 ArrqyList에 저장함
                Socket s = ss.accept();
                ServerThread ct = new ServerThread(s,this);
                executorService.submit(ct); //이 줄이 있어서, Thread t = new Thread(); 와 t.start();가 없어도 처리 가능
                // Thread t = new Thread();
                cList.add(ct);
                // t.start();
                System.out.println("Current number of Clients:" +cList.size());
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Ex1_Server server = new Ex1_Server();
        server.execute();
    }
    public void sendMessage(String clientMsg){
        //접속된 사용자는 ArrayList에 저장되어 있기 때문에
        //그 사용자에게 통신을 해서 메세지를 각각 전송한다.
        for(ServerThread e:cList){
            e.getPw().println(clientMsg);
        }
    }
}
