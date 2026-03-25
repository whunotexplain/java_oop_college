package laba_2;

import java.awt.*;
import java.awt.event.*;

public class number_2 extends Frame{
    number_2 (String str){
        super(str);
        setSize (600,500);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent v) {
                System.exit(0);
            }
        });
    }

    public static void main(String [] args) {
        new number_2 ("Моё первое окно");
    }
}
