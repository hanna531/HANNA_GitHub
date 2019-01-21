package day12_0114_hn;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Ex6_PrintWriter {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = null;
        try {
            String path = "C:\\bigdatastudy\\java\\demo\\memo3.txt";
            // 두번째 인자 : autoFlush (자동으로 버프를 비워준다.)
            // new FileWriter(path)
            /// FileOutputStream에 내장되어 있기에, Buffer 불필요
            pw = new PrintWriter(
                    new FileOutputStream(path),
                    true);
            pw.println("하이 반가워요! 2");
            // pw.flush();
        } catch (Exception e) {

        } finally {
            pw.close();
        }

    }

}
