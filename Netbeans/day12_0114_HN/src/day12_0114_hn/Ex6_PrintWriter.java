package day12_0114_hn;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Ex6_PrintWriter {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = null;
        try {
            String path = "C:\\bigdatastudy\\java\\demo\\memo3.txt";
            // �ι�° ���� : autoFlush (�ڵ����� ������ ����ش�.)
            // new FileWriter(path)
            /// FileOutputStream�� ����Ǿ� �ֱ⿡, Buffer ���ʿ�
            pw = new PrintWriter(
                    new FileOutputStream(path),
                    true);
            pw.println("���� �ݰ�����! 2");
            // pw.flush();
        } catch (Exception e) {

        } finally {
            pw.close();
        }

    }

}
