package ex1;
// server: socket --> [bind() -> listen()](�ڹٰ�ĸ��ȭ) -> accept() -> Stream() -> close() //�߿�!!
// bind() "port socket�� ���� ������ �Ҵ�"

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// listen(): Ŭ���̾�Ʈ�� ���ӿ�û�� Ȯ��"
// accept() : Ŭ���̾�Ʈ�� ������ ����
/* Ex1_Server
1. ServerSocket�� �����Ѵ�

2. accept() ȣ���ؼ� ���ӵ� Socket�� ��ȯ�Ѵ�.
2-1. ���� �����ڸ� ó���ϱ� ���ؼ� ArrayList�� ����Ѵ�.
ArrayList�� ������ ����! --> �����尡 ������ ����!

3. Socket���� �����ϴ� Stream���� ����Ѵ�.
3-1. readLine()�� ������� Thread �����Ѵ�.

����/ Ư���� ��û�� ���� ���� GUI�� ������ ���������� �ʴ´�

Server������ ���� �ٸ� 

** Runnable�� ������ �� �ִ� �޼���! --??

** Runnable �ȿ� �ִ� �߿��� run() 
���⼱.. socket.getInputStream() & br.readLine() �� �߿���! �̰��� �����尡 ����!
 */
public class Ex1_Server {

//���ۼ��� 1. ServerSocket�� �����Ѵ�.
    private ServerSocket ss;
    
// 2-1�� ���� ����
    private ArrayList<ServerThread> cList;

// Thread Group�� �����ϱ� ���� pool
    private ExecutorService executorService;

    public Ex1_Server() {

        try {
            //������ ������ �� �ֵ��� port ����
            ss = new ServerSocket(9999);
            System.out.println("Server Start");
            cList = new ArrayList<>();
            executorService = Executors.newFixedThreadPool(3);
        } catch (IOException ex) {
            System.out.println("�̹� ������� port�Դϴ�");
        }
    }
    public void execute(){
        //�����ؼ� Socket�� �޴� ���񽺸� �ؾ��Ѵ�.
        //2. accept() ȣ���ؼ� ���ӵ� Socket�� ��ȯ�Ѵ�.
        
        while(true){
            try{
                //*** Socket�� �ϳ��� ���Ӹ��� ����Ѵ�.
                // ����ڿ��� ������ ������ Thread�� ���� �����ؼ�
                //start()�ϸ鼭, ������� ������ �ּҰ��� ArrqyList�� ������
                Socket s = ss.accept();
                ServerThread ct = new ServerThread(s,this);
                executorService.submit(ct); //�� ���� �־, Thread t = new Thread(); �� t.start();�� ��� ó�� ����
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
        //���ӵ� ����ڴ� ArrayList�� ����Ǿ� �ֱ� ������
        //�� ����ڿ��� ����� �ؼ� �޼����� ���� �����Ѵ�.
        for(ServerThread e:cList){
            e.getPw().println(clientMsg);
        }
    }
}
