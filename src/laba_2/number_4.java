package laba_2;

import java.awt.*;
import javax.swing.*;


public class number_4 extends JFrame {
    number_4(String s) {
        super(s);
        setLayout(null);
        setSize(300,500);
        setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public void paint(Graphics my_picture){
        my_picture.setColor(Color.LIGHT_GRAY);
        my_picture.fillRect(0, 0, 300, 800);
        my_picture.setColor(Color.BLACK);

        my_picture.drawOval(90, 50, 100, 100);
        my_picture.drawLine(140, 150, 140, 300);
        my_picture.drawLine(140, 300, 100, 400);
        my_picture.drawLine(140, 300, 180, 400);
        my_picture.drawLine(140, 200, 75, 250);
        my_picture.drawLine(140, 200, 205, 250);
    }
    public static void main(String[] args) {
        new number_4("PAinting people");
    }
}
