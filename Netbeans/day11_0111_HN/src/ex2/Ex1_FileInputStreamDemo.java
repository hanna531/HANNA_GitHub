package ex2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1_FileInputStreamDemo {

    public static void main(String[] args) throws IOException {

        String path = "C:\\bigdatastudy\\java\\demo\\message.txt";
        //���������� ���� �� �ʱ�ȭ
        // 1�� ��Ʈ��, ����Ʈ ��Ʈ��
        // try �� scope���� ������ �����ϴ� ������ �����غ��ô�.
        FileInputStream fis = null;
        try {
            //�Ϲ����� ����(������ ����)
            fis = new FileInputStream(path); //try �ۼ� ��, ���� alt+enter
            int rdv = 0;
            // ������ ���������� ���� EOF(������ ��)���� �о���̴�
            // �ݺ���, read(): 1byte�� �о���� �޼���, �� -1�� ��ȯ
            while ((rdv = fis.read()) != -1) {
                System.out.println((char)rdv);
            }
            // ������ ������ �߻��Ǵ� �����̴�.
        } catch (FileNotFoundException ex) {
            System.out.println("������ �������� ���� ���");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("�о� ���̴� ����");
        } finally {
            if (fis != null) {
                fis.close();
            }
        } 
    }
    }
