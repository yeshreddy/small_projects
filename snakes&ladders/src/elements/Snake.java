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
import java.util.*;
public class Snake implements java.io.Serializable{
    
    private int head;
    private int tail;
    Helper h=new Helper();
    public Snake(int head,int tail)
    {
        this.head=head;
        this.tail=tail;
    }
    public Snake()
    {
        
    }
    public int gethead()
    {
        return head;
    }
    public int gettail()
    {
       return tail;
    }
    public void getSnakeproprties()
    {
        System.out.println();
         System.out.println("The head is at position "+head);
         System.out.println("The tail is at position "+tail);
        System.out.println();
    }
    public Snake setSnake(int number,Gamesheet g) throws IOException
    {
        int head;
        int tail;
        System.out.println("Please Enter the Snake Properties ");
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            try
            {
              System.out.println("Please enter the snake head : ");
              String input=in.readLine();
               head=Integer.parseInt(input);
              if(head>=20&&head<=number )
              {
                  g.getgadi(head).setSnakeheadpos(true);
                  break;
              }
                System.out.println("Head is not valid");
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
              System.out.println("Please enter the snake tail : ");
              String input=in.readLine();
               tail=Integer.parseInt(input);
              if(tail>=1 && tail<=number && head-tail>=10)
              {
                  
                  break;
              }
                System.out.println("Tail is not valid");
            }
            catch(Exception e)
            {
                System.out.println("Please enter a valid input!!!Eg:25");
            }
            
        }
        return new Snake(head,tail);
    }
    public Snake containsSnake(LinkedList<Snake> arr,int position)
    {
        for(Snake s:arr)
        {
            if(s.head==position)
            {
                return s;
            }
        }
        return new Snake();
    }
            
}
