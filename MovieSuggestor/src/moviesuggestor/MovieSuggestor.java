
package moviesuggestor;

import javax.swing.JOptionPane;

// MovieSuggestor class inheriting from greetingmessage class 

public class MovieSuggestor extends greetingmessage{
    
    //This will executed in the starting before main method
    static{
    greetingmessage gt = new greetingmessage();
    String msg = gt.givebackmsg("Welcome Ma'am ");
    System.out.println("Welcome to the project movie suggestor");                   //This will display on the output Screen
    JOptionPane.showMessageDialog(null, msg); //Ths will display on the main  window
    
    };

    public static void main(String[] args) {
        openingpage form = new openingpage();
        form.setVisible(true);    
        
    }


 }
