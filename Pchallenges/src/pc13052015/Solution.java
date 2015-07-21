/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc13052015;

/**
 *
 * @author yeswanth
 */
import java.util.*;
public class Solution {

   public static void main(String[] args) {
   
       Scanner sc=new Scanner(System.in);
       int vertexs=Integer.parseInt(sc.nextLine());
       int[] result=new int[vertexs];
       int[][] matrix=new int[vertexs][vertexs];
       int c=0;
       while(sc.hasNextLine() && c<vertexs)
       {
           String temp=sc.nextLine();
           String temp1[]=temp.split(" ");
           for(int i=0;i<vertexs;i++)
           {
               matrix[c][i]=Integer.parseInt(temp1[i]);
           }
           c++;
       }
       int temp=1;
       for(int i=0;i<vertexs;i++)
       {
           if(i==0)
           {
               result[i]=temp;
               temp++;
           }
           else if(matrix[0][i]==1)
           {
               result[i]=temp;
               temp++;
           }
           else 
           {
               result[i]=result[0];
           }
       }
       
       for(int i=1;i<vertexs;i++)
       {
           for(int j=0;j<vertexs;j++)
           {
               if(matrix[i][j]==0 && i!=j)
               {
                   result[j]=result[i];
               }
           }
       }
       
       for(int i=0;i<result.length;i++)
       {
           System.out.print(result[i]+" ");
       }
       System.out.println();
       
       int max=result[0];
       
        for(int i=1; i< result.length; i++)
        {
                if(result[i] > max)
                        max = result[i];
      
        }
       
       System.out.println(max);
   }

}