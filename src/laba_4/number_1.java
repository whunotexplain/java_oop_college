package laba_4;

import javax.swing.*;
import java.awt.*;

public class number_1 extends JFrame {
    public number_1(String s){
        super(s);

        setLayout(null);
        setSize(600,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void paintS(Graphics g){
        g.setColor(Color.YELLOW);
        g.fillRect(0,0,600,600);

        g.setColor(Color.BLUE);

        int x1 = 0;
        int y1 = 0;
        int x2 = 600;
        int y2 = 600;


        g.drawLine(x1,y1,x2,y2);

        int c = 50;
        int z = x2 * x2 + y2 * y2;
        int s = c * c + c * c;

        int i = 0;
        g.fillRect(x1, y1, c, c);

        while (s * (i + 1) < z) {
            i++;
            g.fillRect(x1 + (i * c), y1 + (i * c), c, c);
        }

    }

    @Override
    public void paint(Graphics g) {
        paintS(g);
    }


    public static void main(String[] args) {
        number_1 picture = new number_1("Picture");
    }
}
