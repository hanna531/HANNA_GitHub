package day12_0114_hn;

import java.awt.Toolkit;

public class BeepPrintExample2 {

    public static void main(String[] args) {
        // �����带 �͸� ����Ŭ������ �����ϴ� ���
        Thread thread = new Thread() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                
                    } catch (Exception e) {
                    }
                }
            }

        };
        thread.start();        
        for(int i = 0; i<5; i++){
            System.out.println("��");
            try{
                Thread.sleep(500);
            }catch (Exception e){
                
            }
        }
    }

}
