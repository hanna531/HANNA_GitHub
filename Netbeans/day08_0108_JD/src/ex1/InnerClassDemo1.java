
package ex1;
//  JFrame�� ��ӹ޾Ƽ� GUIȭ���� �����ϴ� Ŭ������ ����

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//  �̺�Ʈ�� �ڵ鸵 �ϴ� �������̽��� ����ؼ� ����
//  �������̽��� ����� �ؼ� ����ؾ� �Ѵ�. ********* alt + enter
//  click �̺�Ʈ ó���� �������ִ� �������̽�

public class InnerClassDemo1 extends JFrame {
    //JFrame �� ������ GUI ����
    private JPanel p1, p2;
    private JButton b1, b2, b3;
    //Alt + insert
    public  InnerClassDemo1() {
        //������ GUI��ü�� �ʱ�ȭ (����)
        p1 = new JPanel();
        p2 = new JPanel();
        b1 = new JButton("red");
        b2 = new JButton("green");
        b3 = new JButton("blue");
        
        b1.setBackground(Color.red);
        b2.setBackground(Color.green);
        b3.setBackground(Color.blue);
        //p1, p2�� ������ ����
        p1.setBackground(Color.WHITE);
        //p2�гο� ��ư�� ��ġ
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        
        //JFrame �� p1, p2 �г��� ��ġ
        add(p1);
        add(p2, BorderLayout.SOUTH);
        
        //ȭ�� Ȱ��ȭ �� ���� ó��
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 450);
        setVisible(true);
        // ��ư�� �̺�Ʈ�� ���� �ϵ��� ����
        // b1.addActionListener(ActionListener �������̽��� ������ ��ü�� �ּҰ�);
        // �͸� ����Ŭ������ ���ڸ� ����
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

//Action Listener �������̽��� �߻� �޼��带 ������ �Ѵ�.
    
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        //shift+del�� ���� ����
//        System.out.println("Click! ");
//        //Ŭ���� ��ư�� �ּҰ��� btn�� �����Ѵ�.
//        JButton btn = (JButton) e.getSource();
//        p1.setBackground(btn.getBackground());
//        
//    }
}
