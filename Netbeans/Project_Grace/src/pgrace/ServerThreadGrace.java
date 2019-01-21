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

    JSONParser parser = new JSONParser(); // �ҷ�����?
    JSONObject memberInfo = new JSONObject(); // ���� ���� ��ü ����

//�������� ��ε�ĳ������ �ϱ� ���ؼ� Ŭ���̾�Ʈ�� ����� ��Ʈ������ ����ϱ� ���� PrintWriter�� �ּҸ� ����
    public PrintWriter getPrintWriter() {
        return printWriter;
    }

    public ServerThreadGrace(Socket socket, ServerGrace server) {
        this.socket = socket;
        this.server = server; //�ʱ�ȭ, A 
        System.out.println("������ IP: " + socket.getInetAddress().getHostAddress());
    }

    @Override
    public void run() {
        try {
            printWriter = new PrintWriter(socket.getOutputStream(), true);

            // readLine() �� ���
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //����� �������κ��� �޼����� ��� �޾ƾ� �Ѵ�.
            while (true) {
                String clientMsg = br.readLine(); //client �޼ҵ� ȣ��

                System.out.println(clientMsg);
                StringTokenizer stz = new StringTokenizer(clientMsg, "/");
                String token = stz.nextToken();

                // ���̵� üũ�ϴ� ����
                if (token.equals("login")) {
                    String id = stz.nextToken();
                    String pw = stz.nextToken();
                    JSONObject members = (JSONObject) parser.parse(new FileReader("C:\\HANNA_GitHub\\HANNA_GitHub\\Netbeans\\Project_Grace\\src\\pgrace\\JsonGrace.json"));

                    JSONObject member_id = (JSONObject) members.get(id);

                    if (member_id == null) {
                        System.out.println("���̵� ����");
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
                        // ȸ�������ϴ� ����
                    }
                }
            }
        } catch (IOException ex) {
        } catch (ParseException ex) {
        }
    }
}
