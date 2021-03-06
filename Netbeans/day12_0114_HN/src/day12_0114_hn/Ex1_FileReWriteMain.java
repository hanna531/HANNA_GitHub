package day12_0114_hn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex1_FileReWriteMain {

    private Ex1_FileReWrDemo efr;

    public Ex1_FileReWriteMain() {
        efr = new Ex1_FileReWrDemo();
    }

    public void execWriter(String memo) {
        efr.writeMemo(memo);

    }

    public void execReader() {
        try {
            ArrayList<String> arlist = efr.getMemo();
            
            for (String e : arlist) {
                System.out.println(e);
            }
        } catch (IOException ex) {
            ex.printStackTrace();

        }
    
    }
    public static void main(String[] args) {
        Ex1_FileReWriteMain mains = new Ex1_FileReWriteMain();
        Scanner sc = new Scanner(System.in);
        System.out.println("memo: ");
        mains.execWriter(sc.nextLine());
        mains.execReader();
                
    }
}
