import javax.swing.*;

public class Secound {
    private JButton TWOButton;
    private JPanel panel1;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Secound");
        frame.setContentPane(new Secound().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
