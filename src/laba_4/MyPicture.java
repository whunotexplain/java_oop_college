import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

public class MyPicture extends JFrame {

    private int choice = 1;

    public MyPicture(String s) {
        super(s);
        setLayout(null);
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paintS(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, 600, 600);
        g.setColor(Color.BLUE);

        int x1 = 0, y1 = 0;
        int x2 = 600, y2 = 600;
        int c = 50;
        int z = x2 * x2 + y2 * y2;
        int s = c * c + c * c;

        g.drawLine(x1, y1, x2, y2);

        int i = 0;
        g.fillRect(x1, y1, c, c);

        while (s * (i + 1) < z) {
            i++;
            g.fillRect(x1 + (i * c), y1 + (i * c), c, c);
        }
    }

    public void paintD(Graphics g) {
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
        if (choice == 1) {
            paintS(g);
        } else if (choice == 2) {
            paintD(g);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1 для статической картинки или 2 для динамической картинки: ");
        int userChoice = in.nextInt();
        in.close();


        MyPicture myPicture = new MyPicture("Мой рисунок");
        myPicture.choice = userChoice;

        myPicture.repaint();
    }
}