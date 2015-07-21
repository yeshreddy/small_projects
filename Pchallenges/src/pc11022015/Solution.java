/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc11022015;

/**
 *
 * @author yeswanth
 */
import java.io.*;
import java.util.*;
public class Solution {
    
    public static Hashtable<String,String> htab=new Hashtable<String,String>();
public static void main(String args[] ) throws Exception {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    String input=in.readLine();
    if(input.length()==1)
        {
        System.out.println("No reverse palindromic substrings available");
        System.exit(0);
    }
    String inputrev=compandrev(input);
    compare(inputrev,input);
    //System.out.println(htab);
     if(htab.isEmpty())
        {
        System.out.println("No reverse palindromic substrings available");
        System.exit(0);
    }
    
   
    Set st=htab.keySet();
      String h[]=new String[htab.size()];
      Object a[]=new Object[htab.size()];
      a=st.toArray();
      //System.out.println("Display result: "+st);
    for(int i=0;i<a.length;i++)
    {
        h[i]=(String)a[i];
        
        //System.out.println(h[i]);
    }
     ArrayList<String> ourlist=new ArrayList<String>();
    int g[]=new int[h.length];
     
    for(int j=0;j<h.length;j++)
    {
        //System.out.println(h[j]);
        g[j]=h[j].length();
    }
  int max=g[0];
    for(int k=0;k<g.length-1;k++)
    {
       if(g[k]>g[k+1])
       {
           if(g[k]>max)
           {
               max=g[k];
           }
       }
    }
    if(max<=1)
        {
        System.out.println("No reverse palindromic substrings available");
        System.exit(0);
    }
    for(int l=0;l<h.length;l++)
    {
        if(h[l].length()==max)
        {
           // System.out.println(h[l]);
            ourlist.add(h[l]);
        }
    }
    h=new String[ourlist.size()];
    for(int f=0;f<ourlist.size();f++)
    {
        h[f]=ourlist.get(f);
    }
    Arrays.sort(h);
    for(int q=0;q<h.length;q++)
    {
        System.out.println(h[q]);
    }
    //System.out.println(max);
}
    
    
    public static void compare(String first,String second)
    {
        
        for(int i=0;i<first.length();i++)
        {
            char tempchar=first.charAt(i);
            //System.out.println("tc is "+tempchar);
            ArrayList<String> templist=new ArrayList<String>();
            for(int j=0;j<second.length();j++)
            {
                if(tempchar==second.charAt(j))
                {
                    //System.out.println("found");
                   templist.add(second.substring(j,second.length()));
                    //System.out.println("templistadditem is "+second.substring(j,second.length()));
                }
            }
            newmethod(i,first,templist);
        }
        
    }
    
    public static void newmethod(int n,String input,ArrayList<String> arr)
    {
        //System.out.println(input.substring(0,2));
        
            arr.add("*");
            int m=1;
        while(arr.size()!=1)
        {
            if(n+m==input.length()+1)
               {
                      break;
               }
           String buf=input.substring(n,n+m);
            //System.out.println("buf is "+buf);
             for(int i=0;i<arr.size()-1;i++)
             {
               if(arr.get(i).contains(buf))
                {
                  
                  htab.put(buf,buf);
                  
                    
                 }
                else
                 {
                  arr.remove(i);    
                 }
               
           }
             m++;
            
        }//while
        
    }
    public static String compandrev(String input)
    {
        String h="";
        for(int i=input.length()-1;i>=0;i--)
        {
            char temp=' ';
            if(input.charAt(i)=='A')
            {
                  temp='T';
            }
            else if(input.charAt(i)=='T')
            {
                  temp='A';
            }
            else if(input.charAt(i)=='C')
            {
                  temp='G';
            }
            else if(input.charAt(i)=='G')
            {
                  temp='C';
            }
           h=h+temp;    
        }
        //System.out.println("candrev is "+h);
        return h;
    }
}