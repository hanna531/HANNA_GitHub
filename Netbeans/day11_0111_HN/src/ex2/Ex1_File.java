package ex2;

import java.io.File;
import java.io.IOException;

public class Ex1_File {
    public static void main(String[] args) {
        // ù��° ���
        String path = "C:\\bigdatastudy\\java\\demo";
        // ���� ��ü�� ����: �ش� �����̳� ��ΰ� ��� �߻����� ��� ����
        File f = new File(path);
        // �ֿ� �޼ҵ� ����
        System.out.println("demo1.txt�� �����ϴ°�?"+f.exists());
        if(f.exists()){
            System.out.println("�����մϴ�.");
        }
        System.out.println("demo1.txt.�� �����ΰ�?"+f.isFile());
        System.out.println("������ �����Ѱ�?"+f.canExecute());
        System.out.println("�ۼ��� �����Ѱ�?"+f.canWrite());
        System.out.println("������"+f.getAbsolutePath());
        System.out.println("���� �̸�"+f.getName());
        System.out.println("���丮�Դϱ�?"+f.isDirectory());
        System.out.println("?"+f.isDirectory());
                
        
        //��� �������� �ʾƵ� �����ȳ�
        File f2 = new File("C:\\bigdatastudy\\java\\demo\\aa2.txt");
        if(!f2.exists()){
            try{
                System.out.println("���� aa�� ����ڽ��ϴ�.");
                //0byte¥�� ������ ����� �ش�. unix���� touch��ɾ� 
                f2.createNewFile(); //���ο� ������ �����.
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else{
            System.out.println("�̹� ���� �մϴ�.");
        }
        
        //f3�̶� ���ϰ�ü��
        //������ �ѹ��� ����� �ʹ�.
        //mkdirs  -  �߻����� ���� ���丮���� ����
        File f3 = new File("C:\\bigdatastudy\\java\\demo\\works\\work1");
        if(!f3.exists()){
            f3.mkdirs();
        } else{
            System.out.println("�̹� ���� �մϴ�." +f3.getAbsolutePath());
        }
    }
    
}
