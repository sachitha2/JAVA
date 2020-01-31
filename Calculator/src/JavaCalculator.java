import javafx.application.Application;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator  extends Application {

    private  double total1 = 0.0;

    private JPanel JavaCalculator;
    private JTextField txtDisplay;
    private JButton btnDiv;
    private JButton btn1;
    private JButton btn2;
    private JButton btn4;
    private JButton btn7;
    private JButton btn0;
    private JButton btn3;
    private JButton btn5;
    private JButton btn8;
    private JButton btnDot;
    private JButton btnPlus;
    private JButton btn6;
    private JButton btn9;
    private JButton CLButton;
    private JButton btnMinus;
    private JButton btnMul;
    private JButton btnEq;


    public JavaCalculator() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = txtDisplay.getText()+btn1.getText();
                txtDisplay.setText(btnOneText);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn2Text = txtDisplay.getText()+btn2.getText();
                txtDisplay.setText(btn2Text);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn3Text = txtDisplay.getText()+btn3.getText();
                txtDisplay.setText(btn3Text);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn4Text = txtDisplay.getText()+btn4.getText();
                txtDisplay.setText(btn4Text);
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn5Text = txtDisplay.getText()+btn5.getText();
                txtDisplay.setText(btn5Text);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn6Text = txtDisplay.getText()+btn6.getText();
                txtDisplay.setText(btn6Text);
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn7Text = txtDisplay.getText()+btn7.getText();
                txtDisplay.setText(btn7Text);
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn8Text = txtDisplay.getText()+btn8.getText();
                txtDisplay.setText(btn8Text);
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn9Text = txtDisplay.getText()+btn9.getText();
                txtDisplay.setText(btn9Text);
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn0Text = txtDisplay.getText()+btn0.getText();
                txtDisplay.setText(btn0Text);
            }
        });
        CLButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Secound secound = new Secound();
            }
        });
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
