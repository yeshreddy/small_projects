/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elements;

import java.io.*;

/**
 *
 * @author yeswanth
 */
public class Player implements java.io.Serializable{
    
    private int health;
    private int money;
    Helper helper=new Helper();
    
    public Player()
    {
        
    }
    public Player(int health,int money)
    {
        this.health=health;
        this.money=money;
        
    }
    public void healthboost(int boost)
    {
         this.health=this.health+boost;
    }
    public void moneyboost(int boost)
    {
        this.money=this.money+boost;
    }
    public void reducemoney(int cut)
    {
        this.money=money-cut;
    }
    public int getHealth()
    {
        return health;
    }
    public int getMoney()
    {
        return money;
    }
    public Player setplayer()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Now,you can set your player settings");
        int health;
        int money;
     while(true)
     {
       try
       {
           System.out.println("Enter player points");
          System.out.println("NOTE:Enter Health in points; Eg-100;atleast 5 points");
          String input=in.readLine();
          if(helper.validate(input))
          {
            health=Integer.parseInt(input);
            break;
          }
          System.out.println("please give atleast 5 points");
        }
        catch(Exception e)
        {
           System.out.println("Not a correct input,please give a integer input eg:100;");
        }
      }
     while(true)
     {
       try
       {
           System.out.println("Enter player money");
          System.out.println("NOTE: Enter Money in Rupees; Eg- 100;atleast 5 rupees");
          String input=in.readLine();
          if(helper.validate(input))
          {
            money=Integer.parseInt(input);
            break;
          }
           System.out.println("please give atleast 5 rupees");
        }
        catch(Exception e)
        {
           System.out.println("Not a correct input,please give a integer input eg:100;");
        }
      }
        return new Player(health,money);
       
    }
    
}
