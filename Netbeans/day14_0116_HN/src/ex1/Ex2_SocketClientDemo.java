/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;
// printwrite에는 flush기능이 있음
// 자동으로 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Ex2_SocketClientDemo {

    private Socket s;

    public Ex2_SocketClientDemo(String host, int port) {
        try {
            s = new Socket(host, port);
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            //한 줄 단위로 문자열 데이터를 보내고 싶을 때 어떤 스트림을 사용해야 할까요?
            String msg = "안녕하세요"; //Client가 보내는 메세지
            //new PrintWriter(new OutputStreamWriter(os)); --> 여기선 OutputStreamWriter가 필요없음! 내장되어있음!
            PrintWriter pw = new PrintWriter(os, true);
            // 서버로 데이터를 전송
            pw.println(msg);

            BufferedReader bis = new BufferedReader(new InputStreamReader(is));
            String servermsg = bis.readLine();
            System.out.println("응답: " + servermsg);
            s.close();
        } catch (IOException ex) {
            System.out.println("접속에 오류가 생겼습니다.");
        }
    }

    public static void main(String[] args) {
        new Ex2_SocketClientDemo("localhost", 9999);
    }
}
