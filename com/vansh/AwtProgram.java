package com.vansh;
import java.awt.*;

public class AwtProgram {
    public AwtProgram()
    {
        Frame f = new Frame();
        Button btn = new Button("Hello World");
        btn.setBounds(80,80,100,150);
        f.add(btn);
        f.setSize(300,250);
        f.setTitle("Java AWT Demo");
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        AwtProgram awt = new AwtProgram();
    }
}
