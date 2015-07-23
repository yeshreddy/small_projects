/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elements;

import java.io.*;
import ui.Master_ui;

/**
 *
 * @author yeswanth
 * 
 */


public class Gamesheet implements java.io.Serializable{
    
    private Gadi board[][];
    private int rows,coloums;
    Helper h=new Helper();
    public Gamesheet()
    {
        
    }
    public Gamesheet(int rows,int coloums)
    {
        
        this.rows=rows;
        this.coloums=coloums;
        board=new Gadi[rows][coloums];
        
        int k=1;
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                board[i][j]=new Gadi(k);
                k++;
            }
        }
    }
    public int getGadinumber()
    {
        return rows*coloums;
    }
    public Gadi[][] getboard()
    {
        return board;
    }
    public Gadi getgadi(int number)
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                
                if(board[i][j].getNumber()==number)
                {
                    return board[i][j];
                }
            }
        }
        return new Gadi(-1);
    }
    
    public void viewGamesheet()
    {
        for(int i=board.length-1;i>=0;i--)
        {
            if(i%2==0)
            {
                for(int j=0;j<board[i].length;j++)
                {
                System.out.print(board[i][j].getNumber()+" ");
                }
            }
            else
            {
              for(int j=board[i].length-1;j>=0;j--)
              {
                System.out.print(board[i][j].getNumber()+" ");
              }
            }
            System.out.println();
        }
    }
    public Gamesheet setGamesheet() throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
       Master_ui master_ui=new Master_ui();
       master_ui.display();
       String rows="",cols="";
       int r,c;
       
          
               System.out.println("Please set the board");
               while(true)
               {
                   try
                   {
                    System.out.println("Rows=");
                    rows=in.readLine();
                    if(h.validate(rows)) 
                    {
                        r=Integer.parseInt(rows);
                        break;
                    }
                    System.out.println("game should have atleast 5 rows");
                   }
                   catch(Exception e)
                   {
                      System.out.println("Not a correct input,please give a integer input eg:100 ");
                   }
               }
               while(true)
               {
                  try
                  {
                   System.out.println("coloumns=");
                   cols=in.readLine();
                   if(h.validate(cols)) 
                    {
                        c=Integer.parseInt(cols);
                        break;
                        
                    }
                   System.out.println("game should have atleast 5 coloumns");
                  }
                  catch(Exception e)
                  {
                      System.out.println("Not a correct input,please give a integer input eg:100;");
                  }
               }
        
        return new Gamesheet(r,c); 
    }
}

