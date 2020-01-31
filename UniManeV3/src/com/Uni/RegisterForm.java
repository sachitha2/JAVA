package com.Uni;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class RegisterForm extends JFrame{
    private JPanel panel1;
    private JButton loginButton;
    private JButton signUpButton;
    private JTextField uName;
    private JTextField pass;
    private JTextField pass2;


    public static DB obj_DB_Connection;
    RegisterForm(){



        obj_DB_Connection=new DB();
        Connection connection=null;
        connection=obj_DB_Connection.get_connection();
        System.out.println(connection);

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

                if(pass.getText().equals(pass2.getText())){

                    System.out.println("password match");

                    signUpObj o = new signUpObj(uName.getText(),pass.getText());

                    int states = obj_DB_Connection.signUp(o);

                    frame.setVisible(false);

                }else {
                    JOptionPane.showMessageDialog(null, "Password does not match");
                }






            }
        });
    }

}
