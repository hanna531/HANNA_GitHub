package ex2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1_FileInputStreamDemo {

    public static void main(String[] args) throws IOException {

        String path = "C:\\bigdatastudy\\java\\demo\\message.txt";
        //지역변수로 선언 후 초기화
        // 1차 스트림, 바이트 스트림
        // try 문 scope영역 위에서 선언하는 이유를 생각해봅시다.
        FileInputStream fis = null;
        try {
            //일반적인 예외(컴파일 예외)
            fis = new FileInputStream(path); //try 작성 전, 적고 alt+enter
            int rdv = 0;
            // 파일의 시작점에서 부터 EOF(파일의 끝)까지 읽어들이는
            // 반복문, read(): 1byte씩 읽어오는 메서드, 끝 -1을 반환
            while ((rdv = fis.read()) != -1) {
                System.out.println((char)rdv);
            }
            // 파일이 없으면 발생되는 예외이다.
        } catch (FileNotFoundException ex) {
            System.out.println("파일이 존재하지 않을 경우");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("읽어 들이는 오류");
        } finally {
            if (fis != null) {
                fis.close();
            }
        } 
    }
    }
