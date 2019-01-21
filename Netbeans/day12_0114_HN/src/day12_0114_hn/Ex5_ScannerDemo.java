package day12_0114_hn;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Ex5_ScannerDemo {
    public static void main(String[] args) throws MalformedURLException {
        String path = "https://news.naver.com/main/read.nhn?oid=052&sid1=103&aid=0001240445&mid=shm&mode=LSD&nh=20190114114615";
        URL url = new URL(path);
        //implements Iterator<String>, �ݺ��ڸ� ����� �� �ִ�.****
        //InputStreamReader �긴��, ���۸� ���������� ĸ��ȭ
        try(Scanner sc = new Scanner(url.openStream(), "euc-kr")){
            String rdv = null;
            while(sc.hasNext()){ //hasNext() : �ݺ��� �����Ͱ� ������ true / ���� ����!!
                System.out.println(sc.nextLine());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
