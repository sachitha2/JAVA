package com.Uni;

import javax.swing.*;
import java.awt.*;

public class StudentUI {
    private JPanel panel1;
    private JButton myCoursesButton;
    private JButton myProfileButton;


    StudentUI() {
        JFrame frame = new JFrame("StudentUI");
        frame.setContentPane(this.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width,screenSize.height);
    }
}
