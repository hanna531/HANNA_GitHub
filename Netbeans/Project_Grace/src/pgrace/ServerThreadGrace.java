package pgrace;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ServerThreadGrace implements Runnable {

    private Socket socket;
    private ServerGrace server; //
    private BufferedReader br;
    private PrintWriter printWriter;

    JSONParser parser = new JSONParser(); // 불러오기?
    JSONObject memberInfo = new JSONObject(); // 값에 대한 객체 생성

//서버에서 브로드캐스팅을 하기 위해서 클라이언트와 연결된 스트림으로 통신하기 위한 PrintWriter의 주소를 제공
    public PrintWriter getPrintWriter() {
        return printWriter;
    }

    public ServerThreadGrace(Socket socket, ServerGrace server) {
        this.socket = socket;
        this.server = server; //초기화, A 
        System.out.println("접속자 IP: " + socket.getInetAddress().getHostAddress());
    }

    @Override
    public void run() {
        try {
            printWriter = new PrintWriter(socket.getOutputStream(), true);

            // readLine() 을 담당
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //사용자 소켓으로부터 메세지를 계속 받아야 한다.
            while (true) {
                String clientMsg = br.readLine(); //client 메소드 호출

                System.out.println(clientMsg);
                StringTokenizer stz = new StringTokenizer(clientMsg, "/");
                String token = stz.nextToken();

                // 아이디 체크하는 로직
                if (token.equals("login")) {
                    String id = stz.nextToken();
                    String pw = stz.nextToken();
                    JSONObject members = (JSONObject) parser.parse(new FileReader("C:\\HANNA_GitHub\\HANNA_GitHub\\Netbeans\\Project_Grace\\src\\pgrace\\JsonGrace.json"));

                    JSONObject member_id = (JSONObject) members.get(id);

                    if (member_id == null) {
                        System.out.println("아이디 없음");
                        printWriter.println("id/none/");
                    } else {

                        System.out.println("member_id");

                        try {
                            String member_pw = (String) member_id.get("PW");

                            System.out.println(member_pw);
                            if (pw.equals(member_pw)) {
                                printWriter.println("login/true/");
                            } else {
                                printWriter.println("login/false/");
                            }
                        } catch (NullPointerException e) {
                            printWriter.println("login/false/");
                        }
                        // 회원가입하는 로직
                    }
                }
            }
        } catch (IOException ex) {
        } catch (ParseException ex) {
        }
    }
}
