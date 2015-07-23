/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elements;

/**
 *
 * @author yeswanth
 */
import java.io.*;
import java.util.LinkedList;
public class Ladder implements java.io.Serializable{
    
    private int top;
    private int bottom;
    Helper h=new Helper();
    public Ladder(int top,int bottom)
    {
        this.top=top;
        this.bottom=bottom;
    }
    public Ladder()
    {
        
    }
    public int getBottom()
    {
        return bottom;
    }
    public int getTop()
    {
        return top;
    }
    public void getLadderproprties()
    {
        System.out.println();
         System.out.println("The top is at position "+top);
         System.out.println("The bottom is at position "+bottom);
        System.out.println();
    }
    public Ladder setLadder(int number,Gamesheet g) throws IOException
    {
        int top;
        int bottom;
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            try
            {
              System.out.println("Please enter the Ladder top : ");
              String input=in.readLine();
               top=Integer.parseInt(input);
              if(top>=20&&top<=number)
              {
                  
                  break;
              }
                System.out.println("Ladder top position is not valid");
            }
            catch(Exception e)
            {
                System.out.println("Please enter a valid input!!!Eg:25");
            }
            
        }
        while(true)
        {
            try
            {
              System.out.println("Please enter the Ladder bottom : ");
              String input=in.readLine();
               bottom=Integer.parseInt(input);
              if(bottom>=5&& bottom<=number && top-bottom>=10 && g.getgadi(bottom).isSnakeheadpos()==false)
              {
                  g.getgadi(bottom).setladderbotpos(true);
                  break;
              }
                System.out.println("ladder bottom is not valid");
            }
            catch(Exception e)
            {
                System.out.println("Please enter a valid input!!!Eg:25");
            }
            
        }
        return new Ladder(top,bottom);
    }
    public Ladder containsLadder(LinkedList<Ladder> arr,int position)
    {
        for(Ladder s:arr)
        {
            if(s.bottom==position)
            {
                return s;
            }
        }
        return new Ladder();
    }
}
