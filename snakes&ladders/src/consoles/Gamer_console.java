/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consoles;
import elements.*;
import playgame.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author yeswanth
 */
public class Gamer_console {
    
    Gamesheet g;
    Player p;
    LinkedList<Snake> ls;
    LinkedList<Ladder> ll;
    public void gamerplay()
    {
    Own o;
    try
      {
         FileInputStream fileIn = new FileInputStream("game.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         o= (Own) in.readObject();
         in.close();
         fileIn.close();
      }catch(IOException i)
      {
         i.printStackTrace();
         return;
      }catch(ClassNotFoundException c)
      {
         System.out.println("Own class not found");
         c.printStackTrace();
         return;
      }
       g=o.getG();
       p=o.getP();
       ls=o.getLs();
       ll=o.getLl();
       Play pl=new Play();
       
       pl.play(g, p, ls, ll);
       
       
    }
}
