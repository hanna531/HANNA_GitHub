package pgrace;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerGrace {

//제작순서 1. ServerSocket을 생성한다.
    private ServerSocket ss;

// 2-1을 위한 선언
    private ArrayList<ServerThreadGrace> cList;

// Thread Group을 관리하기 위한 pool
    private ExecutorService executorService;

    public ServerGrace() {

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

    public void execute() {
        //지속해서 Socket을 받는 서비스를 해야한다.
        //2. accept() 호출해서 접속된 Socket을 반환한다.

        while (true) { //무한 루프

            try {
                //*** Socket은 하나의 접속만을 담당한다.
                // 사용자에게 응답을 위임한 Thread를 각각 생성해서
                //start()하면서, 사용자의 소켓의 주소값을 ArrqyList에 저장함
                Socket s = ss.accept(); //소켓 생성 & accept 실행 (접속될때까지 대기)
                ServerThreadGrace ct = new ServerThreadGrace(s, this); // 자기자신을 넣음 -->쓰레드 A로
                executorService.submit(ct); //이 줄이 있어서, Thread t = new Thread(); 와 t.start();가 없어도 처리 가능 /thread pool 이 돌아감 
                // 서버스레드에서 run이 실행됨

                Thread t = new Thread();
                cList.add(ct); // client가 추가
                t.start(); // 
                System.out.println("Current number of Clients:" + cList.size());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ServerGrace server = new ServerGrace();
        server.execute();
    }

    public void sendMessage(String clientMsg) {
        //접속된 사용자는 ArrayList에 저장되어 있기 때문에
        //그 사용자에게 통신을 해서 메세지를 각각 전송한다.
        for (ServerThreadGrace e : cList) { //스레드에서 clientMsg를 끌어와서 전달해줌
            e.getPrintWriter().println(clientMsg);
        }
    }
}
