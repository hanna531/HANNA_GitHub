package ex1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class MyCanVasMock extends JFrame {

    private int arcNum = 360;
    private int x, y;

    public MyCanVasMock() {

        Canvas can = new Canvas() {
            //repaint() => JVM => update() => paint()
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.red);
                g.drawArc(x, y, 100, 100, 0, arcNum);

            }

            @Override
            public void update(Graphics g) {
                paint(g);
            }
        };
        add(can);
        can.setBackground(Color.yellow);
        setBounds(100, 100, 300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
        public static void main(String[] args) {
        new MyCanVasMock();
    }
}
