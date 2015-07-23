/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elements;

import java.io.*;
import java.util.*;

/**
 *
 * @author yeswanth
 */
public class Helper implements java.io.Serializable{
    
    public boolean validate(String input)
    {
        int temp=Integer.parseInt(input);
       
        if(temp>=5)
        {
            return temp/1==temp;
        }
        return false;
    }
    public boolean ser(Own object)
    {
        try
      {
         FileOutputStream fileOut =
         new FileOutputStream("game.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(object);
         out.close();
         fileOut.close();
         //System.out.printf("Serialized data is saved in game.ser");
      }catch(IOException i)
      {
          i.printStackTrace();
      }
        return true;
    }
    
    
}

