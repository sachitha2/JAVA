package com.Uni;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterForm extends JFrame{
    private JPanel panel1;
    private JButton loginButton;
    private JButton signUpButton;
    private JTextField textField1;
    private JTextField textField2;

    RegisterForm(){

        JFrame frame = new JFrame("RegisterForm");
        frame.setContentPane(this.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600,400);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login login = new Login();
                frame.setVisible(false);
            }
        });
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //create sign up part and intent to home
            }
        });
    }

}
