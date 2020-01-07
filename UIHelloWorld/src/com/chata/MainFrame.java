package com.chata;

import javax.swing.*;
import java.awt.*;

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

        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
}
