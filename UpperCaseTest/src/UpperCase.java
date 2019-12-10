import javax.swing.*;

public class UpperCase {

    public static void main(String args[])
    {
        String word = JOptionPane.showInputDialog("Enter a text");
        System.out.println(word.toUpperCase());
        //sub string
        System.out.println(word.substring(5));
        //index of
        String sente = "Sachitha hirushan";
        System.out.println("index of s "+sente.indexOf('S'));
        System.out.println("last index of i "+sente.indexOf('i'));


    }
}
