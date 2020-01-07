package com.chata;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton btn1;
    private JPanel pannelMain;

    public App() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hellooo world");
            }
        });
    }


    public static void main(String[] args) {
        JFrame jFrame = new JFrame("App");
        jFrame.setContentPane(new App().pannelMain);


        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }


}
