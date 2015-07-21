/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc25032015;

/**
 *
 * @author yeswanth
 */
import java.io.*;
import java.util.*;
public class Solution {
public static void main(String args[] ) throws Exception {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    
    String input="";
    
    while(!(input=in.readLine()).equals("0"))
    {
        try
        {
          callmethod(Integer.parseInt(input));
        }
        catch(Exception e)
        {
          System.out.println("Can't be determined");
        }
    }
    
    
}
public static void callmethod(int in)
{
    
    int arr[]=new int[in];
    
    for(int l:arr) l=0;
    
    int k=0,times=0,i=0;
   
    while(i<arr.length)
    {
        k=k+1;
        if(arr[k-1]==0) times=k;
       
        else times=arr[k-1];
        for(int j=0;j<arr.length;j++)
        {
            if(j!=times&& i!=arr.length)
            {
                
                arr[i]=k;
                i++;
            }
            else break;
            
        }
        
    }
    System.out.println(arr[in-1]);
}
}// class