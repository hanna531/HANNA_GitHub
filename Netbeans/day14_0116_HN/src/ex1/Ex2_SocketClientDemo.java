/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;
// printwrite���� flush����� ����
// �ڵ����� 

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
            //�� �� ������ ���ڿ� �����͸� ������ ���� �� � ��Ʈ���� ����ؾ� �ұ��?
            String msg = "�ȳ��ϼ���"; //Client�� ������ �޼���
            //new PrintWriter(new OutputStreamWriter(os)); --> ���⼱ OutputStreamWriter�� �ʿ����! ����Ǿ�����!
            PrintWriter pw = new PrintWriter(os, true);
            // ������ �����͸� ����
            pw.println(msg);

            BufferedReader bis = new BufferedReader(new InputStreamReader(is));
            String servermsg = bis.readLine();
            System.out.println("����: " + servermsg);
            s.close();
        } catch (IOException ex) {
            System.out.println("���ӿ� ������ ������ϴ�.");
        }
    }

    public static void main(String[] args) {
        new Ex2_SocketClientDemo("localhost", 9999);
    }
}
