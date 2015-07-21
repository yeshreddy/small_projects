/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc23032015;

import java.io.*;
import java.util.*;

/**
 *
 * @author yeswanth
 */
public class Hash {
    
    public static void main(String args[]) throws Exception
    {
        BufferedReader  in=new BufferedReader(new InputStreamReader(System.in));
       ArrayList< Hashtable<String, String> > temp=new ArrayList<>();
       String input=in.readLine();
       String tempo[]=input.split(",");
       while(!(input=in.readLine()).equals("End"))
       {
           String tempor[]=input.split(",");
           for(int i=0;i<tempo.length;i++)
           {
              Hashtable<String,String> ht=new Hashtable<>();
              ht.put(tempo[i], tempor[i]);
              temp.add(ht);
           }
       }
       while(!(input=in.readLine()).equals("End"))
       {
           String t[]=input.split(";");
           
           String humma=t[0];
           String heyhumma=t[1];
           for(int i=0;i<temp.size()-1;i++)
           {
               String value=temp.get(i).get(humma);
               System.out.println(heyhumma);
               if(value.equals(heyhumma))
               {
                   //System.out.println(temp.get(i).get("income"));
               }
           }
       }
        
        
    }
}
