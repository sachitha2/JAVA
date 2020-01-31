package com.chata;

import javax.swing.*;
import java.awt.*;

public class ToolBar extends JPanel {
    private JButton helloButton;
    private JButton byeButton;
    public  ToolBar(){
        helloButton = new JButton("Helloo");
        byeButton = new JButton("Bye");


        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(helloButton);

        add(byeButton);
    }
}
