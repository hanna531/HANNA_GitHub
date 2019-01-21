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
            ///1차 스트림의 주소를 인자로 전달
            bis = new BufferedInputStream(
                    new FileInputStream(path1));
            bos = new BufferedOutputStream(
                    new FileOutputStream(path2));
            int readV = 0;
            /// bis로부터 버퍼에 담아 읽어 들이면서
            /// box로 읽어온 경로로 버퍼단위로 저장한다.

            //fis로부터 1byte씩 읽어 들이면서 (X)
            //fos로 읽어온 경로로 1byte씩 저장한다 (X)
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
//        System.out.println("복사한 시간" + (end - start));
    }



