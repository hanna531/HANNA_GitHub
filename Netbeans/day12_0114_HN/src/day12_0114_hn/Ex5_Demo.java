package day12_0114_hn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex5_Demo {

    public static void main(String[] args) throws MalformedURLException {
        BufferedReader br = null;
        String path = "https://news.naver.com/main/read.nhn?oid=052&sid1=103&aid=0001240445&mid=shm&mode=LSD&nh=20190114114615";
        URL url = new URL(path);
        try {
            // 어쩔 수 없이 바이트스트림으로 받아온 객체를
            // 문자스트림으로 변경하려고 할 ?가 있다.
            // InputStreamReader(inputstream, 인코딩)
            // => Scanner로 대체 가능하다. (InputStreamReader x)
            // 연습문제: Scanner의 API 참고해서
            // 똑같은 기능으로 Ex5_ScannerDemo에서 구현하시오.
            // url.openStream(): InputStream
            br = new BufferedReader(
                    new InputStreamReader(url.openStream(), "euc-kr")); //인코딩 타입 선택
            String str = null;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException ex) {
        } finally{
            
        }
    }

}
