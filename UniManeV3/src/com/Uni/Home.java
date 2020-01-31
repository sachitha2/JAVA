package com.Uni;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home {
    private JPanel panel1;
    private JButton lecBtn;
    private JButton stdBtn;


    Home(){
        JFrame frame = new JFrame("Home");
        frame.setContentPane(this.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width,screenSize.height);
        stdBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You clicked student button");
                StudentUI studentUI = new StudentUI();
                frame.setVisible(false);
            }
        });
        lecBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You clicked lec btn");
                LecturerUI lecturerUI = new LecturerUI();
                frame.setVisible(false);

            }

        });
    }


}
