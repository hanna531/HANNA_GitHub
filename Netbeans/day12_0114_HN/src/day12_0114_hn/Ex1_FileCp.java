package day12_0114_hn;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex1_FileCp {

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        String path1 = "";
        String path2 = "";
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
//            fis = new FileInputStream(path1); (X)
//            fos = new FileOutputStream(path2); (X)
            ///1�� ��Ʈ���� �ּҸ� ���ڷ� ����
            bis = new BufferedInputStream(
                    new FileInputStream(path1));
            bos = new BufferedOutputStream(
                    new FileOutputStream(path2));
            int readV = 0;
            /// bis�κ��� ���ۿ� ��� �о� ���̸鼭
            /// box�� �о�� ��η� ���۴����� �����Ѵ�.

            //fis�κ��� 1byte�� �о� ���̸鼭 (X)
            //fos�� �о�� ��η� 1byte�� �����Ѵ� (X)
            while ((readV = bis.read()) != -1) {
                bos.write(readV);
            }
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        } finally {
            if (bis != null) bis.close();
            if (bos != null) bos.close();
            }
        }
        long end = System.currentTimeMillis();
//        System.out.println("������ �ð�" + (end - start));
    }



