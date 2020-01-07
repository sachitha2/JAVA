package com.chata;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {


    private JTextArea jTextArea;
    private JButton jButton;

    public MainFrame(){
        super("Hello world");

        setLayout(new BorderLayout());


        jTextArea = new JTextArea();

        jButton = new JButton("Click Me");


        add(jTextArea,BorderLayout.CENTER);

        add(jButton,BorderLayout.SOUTH);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append("hello sam\n");
            }
        });

        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
}
