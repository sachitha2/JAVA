package com.chata;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {


    private TextPanel textPanel;
    private JButton jButton;
    private ToolBar toolBar;

    public MainFrame(){
        super("Hello world");

        setLayout(new BorderLayout());

        toolBar = new ToolBar();


        textPanel = new TextPanel();



        jButton = new JButton("Click Me");

        add(toolBar,BorderLayout.NORTH);
        add(textPanel,BorderLayout.CENTER);

        add(jButton,BorderLayout.SOUTH);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textPanel.appendText("Hello sam\n");

            }
        });

        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
}
