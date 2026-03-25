package laba_2;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class number_3 extends Frame {
    number_3(String str) {
        super(str);
        setSize(600, 500);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent v) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g){
        Color initColor = g.getColor();
        g.setColor(new Color(0,0,255));
        g.fillRect(0,0,getSize().width - 1, getSize().height - 1);
        g.setColor(initColor);
    }

    public static void main(String[] args) {
        Frame fr = new number_3("My first window");
        fr.setSize(400, 400);
        fr.setVisible(true);
    }
}