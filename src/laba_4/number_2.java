package laba_4;
import java.awt.*;
import javax.swing.*;

public class number_2 extends JFrame {

    public number_2(String s){
        super(s);
        setLayout(null);
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paintD(Graphics g) throws InterruptedException {

        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, 600, 600);

        g.setColor(Color.BLUE);

        int x1 = 0, y1 = 0;
        int x2 = 600, y2 = 600;
        int c = 50;
        int z = x2 * x2 + y2 * y2;
        int s = c * c + c * c;

        int i = 0;

        while (s * (i + 1) < z) {

            g.setColor(Color.YELLOW);
            g.fillRect(0, 0, 600, 600);
            g.setColor(Color.BLUE);


            g.drawLine(x1, y1, x2, y2);


            for (int j = 0; j <= i; j++) {
                g.fillRect(x1 + (j * c), y1 + (j * c), c, c);
            }


            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
    @Override
    public void paint(Graphics g) {
        try {
            paintD(g);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        number_2 picture = new number_2("dynamic picture");
    }
}

