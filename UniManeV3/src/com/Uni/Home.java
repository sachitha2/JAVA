package com.Uni;

import javax.swing.*;
import java.awt.*;

public class Home {
    private JPanel panel1;
    private JButton lecturerButton;
    private JButton studentButton;


    Home(){
        JFrame frame = new JFrame("Home");
        frame.setContentPane(this.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width,screenSize.height);
    }


}
