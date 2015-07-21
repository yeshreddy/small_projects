/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc18022015;

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
    int input=Integer.parseInt(in.readLine());
    output(input);
}
    static void output(int input)
    {
        int arr[]=new int[input];
        for(int i=0;i<arr.length;i++)
            {
            arr[i]=i;
        }
        printAllSubsets(arr);
    }
    static void subsetandcompliment(int[] arr,int degree)
    {
         for(int i=0;i<arr.length;i++)
         {
                           
         }
    }
      public static void printAllSubsets(int[] arr) 
      {
          byte[] counter = new byte[arr.length];
          //ArrayList alist=new ArrayList();
          

        while (true) {
      // Print combination
            //int temp[]=new int[counter.length];
      for (int i = 0; i < counter.length; i++) {
        if (counter[i] != 0)
          
          System.out.print(arr[i]);
            
            //temp[i]=arr[i];
      }
            //alist.add(temp);
      System.out.println();

      // Increment counter
      int i = 0;
      while (i < counter.length && counter[i] == 1)
        counter[i++] = 0;
      
      if (i == counter.length)
        break;
      
      counter[i] = 1;
    }
          
          
  }
}
