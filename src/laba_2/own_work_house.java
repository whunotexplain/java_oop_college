package laba_2;

import javax.swing.*;
import java.awt.*;

public class own_work_house extends JFrame {
    own_work_house (String s) {
        super(s);
        setLayout(null);
        setSize(600,600);
        setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public void paint(Graphics my_picture){
        my_picture.drawRect(80, 160, 140, 120);


        int[] xPoints = {70, 150, 230};
        int[] yPoints = {160, 100, 160};
        my_picture.drawPolygon(xPoints, yPoints, 3);

        my_picture.drawRect(200, 110, 20, 40);
        my_picture.drawRect(100, 180, 40, 40);



        my_picture.drawLine(335, 300, 335, 250);
        my_picture.drawLine(365, 300, 365, 250);
        my_picture.drawOval(275, 50, 150, 200);
    }

    public static void main(String[] args) {
        new own_work_house("Home and tree");
    }

}
