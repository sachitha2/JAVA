package com.Uni;

import javax.swing.*;
import java.awt.*;

public class LecturerUI {
    private JPanel panel1;
    private JButton addCoursesButton;
    private JButton lecturerProfileButton;

    LecturerUI() {
        JFrame frame = new JFrame("LecturerUI");
        frame.setContentPane(this.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width,screenSize.height);
    }
}
