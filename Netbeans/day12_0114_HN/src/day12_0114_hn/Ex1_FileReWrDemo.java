package day12_0114_hn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/** documentation�ּ�
 */

// Buffered ==> ���� ���. writer/reader
// String�̱⿡, '-1'�� �ƴ�'null
public class Ex1_FileReWrDemo {
    private String path;
    /** @see �⺻ ������, �����δ� window�� c....
     */
    
    public Ex1_FileReWrDemo (){
        path = "C:\\bigdatastudy\\java\\demo\\memo.txt";
    }
    /**  @param msg�� memo.txt�� BufferedWriter�� ����ؼ� ���ڿ��� ����Ǳ� ���� ��Ʈ�� **/
    
    public void writeMemo(String msg){ //���ڿ� ����, ���ڿ��� append���� �Ǿ�� ��. 
        //Buffered����� ���� 1�� ��Ʈ���� ����
        // ���� ����� ���� ���� ��Ʈ�� (2�� ��Ʈ��)
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter(path, true));
            // ���� ��Ʈ���� ����ؼ� �ش� ����� ������ �ۼ�
            bw.write(msg);
            bw.newLine(); // ����
            bw.flush(); // ���۸� ����ִ� ���
        } catch (IOException ex){
        } finally {
            if(bw != null){     //3) if�� 
                try{            // 2) try �����ְ�
                    bw.close(); // 1) ���� Ÿ���� �ϰ�
                } catch(IOException ex){
            }
            }
        }
    }
               /** @return ArrayList<String>
                * �޸����� 
                */
               public ArrayList<String> getMemo() throws FileNotFoundException, IOException{
                   ArrayList<String> ar = new ArrayList<>();
                   BufferedReader br = null;
                   br = new BufferedReader(new FileReader(path));
                   String rdv = null;
                   //readLine()�� ��Ʈ���� ���ؼ� �����ڿ��� ���� ������ �о�´�.
                   //�������� null
                   while((rdv= br.readLine()) != null){
                       //�о�� ���ڿ��� �� �� �� ArrayList�� ����
                       ar.add(rdv);
                   }
                   br.close();
                   return ar;
               }
        }