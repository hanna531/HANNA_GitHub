package ex2;

import java.io.File;
import java.io.IOException;

public class Ex1_File {
    public static void main(String[] args) {
        // 첫번째 경우
        String path = "C:\\bigdatastudy\\java\\demo";
        // 파일 객체를 생성: 해당 파일이나 경로가 없어도 추상적인 경로 가능
        File f = new File(path);
        // 주요 메소드 연습
        System.out.println("demo1.txt가 존재하는가?"+f.exists());
        if(f.exists()){
            System.out.println("존재합니다.");
        }
        System.out.println("demo1.txt.가 파일인가?"+f.isFile());
        System.out.println("실행이 가능한가?"+f.canExecute());
        System.out.println("작성이 가능한가?"+f.canWrite());
        System.out.println("절대경로"+f.getAbsolutePath());
        System.out.println("파일 이름"+f.getName());
        System.out.println("디렉토리입니까?"+f.isDirectory());
        System.out.println("?"+f.isDirectory());
                
        
        //경로 존재하지 않아도 오류안남
        File f2 = new File("C:\\bigdatastudy\\java\\demo\\aa2.txt");
        if(!f2.exists()){
            try{
                System.out.println("존재 aa를 만들겠습니다.");
                //0byte짜리 파일을 만들어 준다. unix에서 touch명령어 
                f2.createNewFile(); //새로운 파일을 만든다.
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else{
            System.out.println("이미 존재 합니다.");
        }
        
        //f3이란 파일객체로
        //폴더를 한번에 만들고 싶다.
        //mkdirs  -  추상정인 하위 디렉토리까지 생성
        File f3 = new File("C:\\bigdatastudy\\java\\demo\\works\\work1");
        if(!f3.exists()){
            f3.mkdirs();
        } else{
            System.out.println("이미 존재 합니다." +f3.getAbsolutePath());
        }
    }
    
}
