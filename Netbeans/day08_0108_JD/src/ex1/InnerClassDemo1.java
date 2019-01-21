
package ex1;
//  JFrame을 상속받아서 GUI화면을 구성하는 클래스를 정의

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//  이벤트를 핸들링 하는 인터페이스를 사용해서 제어
//  인터페이스는 재엉의 해서 사용해야 한다. ********* alt + enter
//  click 이벤트 처리를 지원해주는 인터페이스

public class InnerClassDemo1 extends JFrame {
    //JFrame 에 구성된 GUI 결정
    private JPanel p1, p2;
    private JButton b1, b2, b3;
    //Alt + insert
    public  InnerClassDemo1() {
        //선언한 GUI객체를 초기화 (생성)
        p1 = new JPanel();
        p2 = new JPanel();
        b1 = new JButton("red");
        b2 = new JButton("green");
        b3 = new JButton("blue");
        
        b1.setBackground(Color.red);
        b2.setBackground(Color.green);
        b3.setBackground(Color.blue);
        //p1, p2에 배경색을 적용
        p1.setBackground(Color.WHITE);
        //p2패널에 버튼을 배치
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        
        //JFrame 에 p1, p2 패널을 배치
        add(p1);
        add(p2, BorderLayout.SOUTH);
        
        //화면 활성화 및 종료 처리
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 450);
        setVisible(true);
        // 버튼에 이벤트를 감지 하도록 설정
        // b1.addActionListener(ActionListener 인터페이스를 구현한 객체의 주소값);
        // 익명 내부클래스로 인자를 전달
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
//        b1.addActionListener(this);
    }
    
    public static void main(String[] args) {
    new InnerClassDemo1();
    }

//Action Listener 인터페이스의 추상 메서드를 재정의 한다.
    
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        //shift+del로 한줄 삭제
//        System.out.println("Click! ");
//        //클릭한 버튼의 주소값을 btn에 저장한다.
//        JButton btn = (JButton) e.getSource();
//        p1.setBackground(btn.getBackground());
//        
//    }
}
