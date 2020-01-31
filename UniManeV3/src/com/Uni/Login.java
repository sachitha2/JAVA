package com.Uni;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login  extends JFrame{
    private JPanel panel1;
    private JButton signInButton;
    private JButton signUpButton;
    private JTextField textField1;
    private JTextField textField2;
    int x = 0;

    JLabel label;
    Login(){


        JFrame frame = new JFrame("Login");
        frame.setContentPane(this.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600,500);
        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("helloo sam"+x++);


            }
        });

        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //intent to signup form
                RegisterForm registerForm = new RegisterForm();
                frame.setVisible(false);
            }
        });
    }



}
