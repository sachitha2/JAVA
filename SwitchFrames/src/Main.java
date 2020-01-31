import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JButton nextWindowButton;
    private JPanel panel1;

    public Main() {
        nextWindowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("newxt Screen");

                Secound secound = new Secound();

                secound.setVisible(true);

                secound.setSize(400,400);
                secound.setTitle("My Secound Frame");


            }
        });
    }

    public static void main(String[] args) {
//        JFrame frame = new JFrame("Main");
//        frame.setContentPane(new Main().panel1);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        frame.pack();
//        frame.setVisible(true);
//
//        frame.setSize(400,400);

        Secound secound = new Secound();

        secound.setVisible(true);

        secound.setSize(400,400);
        secound.setTitle("My Secound Frame");
    }
}
