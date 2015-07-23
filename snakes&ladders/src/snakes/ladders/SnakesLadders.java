/*
 * 
 * This class contains the main method.
 * we can run two consoles i.e master console and gamer console from this main method
 *  
 *
 */
package snakes.ladders;

/**
 *
 * @author yeswanth
 */
import consoles.Gamer_console;
import elements.Gamesheet;
import elements.Dice;
import java.io.*;
import ui.*;
import consoles.Master_console;
public class SnakesLadders {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException
    {
        // TODO code application logic here
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        Welcome_screen ws=new Welcome_screen();
        Master_ui m=new Master_ui();
        String input="";
        boolean flag=true;
        m.instructions();
        while(flag)
        {
            ws.display();
            input=in.readLine();
        switch(input)
        {
          
            case "1": 
                       System.out.println("you have chose master console");
                         // intialsising master console //
                         Master_console master_console=new Master_console();
                         /// running master console//
                         master_console.runConsole(); // This will take to another screen //
                         flag=false;
                         break;
                         
                         
                     
                      
            case "2": 
                       System.out.println("you have chose gamer console");
                       Gamer_console gm=new Gamer_console();
                       gm.gamerplay();
                       flag=false;
                       break;
                       
            case "3": 
                      m.howtoplay();
                      System.out.println();
                      break;
                
            case "4": System.exit(0);
             
            default: System.out.println(" Sorry!!! wrong option !!! ");
                      System.out.println("please Re-Enter your option");
                
        }
        
        }
    }
    
}
