package com.Uni;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class Login  extends JFrame{

    public static DB obj_DB_Connection;
    private JPanel panel1;
    private JButton signInButton;
    private JButton signUpButton;
    private JTextField uName;
    private JTextField uPass;
    int x = 0;

    JLabel label;
    Login(){

        obj_DB_Connection=new DB();
        Connection connection=null;
        connection=obj_DB_Connection.get_connection();
        System.out.println(connection);


        JFrame frame = new JFrame("Login");
        frame.setContentPane(this.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600,500);
        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                signUpObj o = new signUpObj(uName.getText(),uPass.getText());

                int s = obj_DB_Connection.checkLogin(o);

                System.out.println(s);
                if(s == 1){
                    Home home = new Home();
                    frame.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Your Username and Password incorrect");
                }


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
