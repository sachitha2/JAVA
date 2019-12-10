import javax.swing.*;

public class TicketCounter {

    public static void main(String args[])
    {
          int age;

          int limit = 5;

          int entry = 0;
          int noEntry = 0;


          while(limit > 0){

               age = Integer.parseInt(JOptionPane.showInputDialog("What is your age"));

               if(age > 18){
                    System.out.println(age+" : Entry");
                    entry++;
               }else{
                   System.out.println(age+" : No Entry");
                   noEntry++;
               }
               limit--;
          }

          System.out.println("Entry : "+entry);
          System.out.println("No Entry : "+noEntry);
          System.out.println("Entry percentage : "+(entry * 20)+"%");
    }
}
