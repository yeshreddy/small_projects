/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc06052015;
import java.io.*;
import java.util.LinkedList;
/**
 *
 * @author yeswanth
 * Sample Input #1:
5
1,0,1,1,1
1,1,1,1,1
0,0,0,1,1
0,1,0,1,0
1,0,0,1,1
 * 
 */
public class Solution {
    public static void printmat(int[][] mat)
    {
      mat[1][1]=2;
        for(int i=1;i<mat.length-1;i++)
        {
            for(int j=1;j<mat[i].length-1;j++)
            {
                if(mat[i][j]==2)
                {
                    System.out.print(1+" ");
                }
                else
                {
                    System.out.print(0+" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void main(String args[]) throws IOException
    {
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        int rows=Integer.parseInt(in.readLine());
        int[][] mat=new int[rows+2][rows+2];
        for(int i=0;i<rows;i++)
        {
            String temp[]=in.readLine().split(",");
            for(int j=0;j<rows;j++)
            {
                mat[i+1][j+1]=Integer.parseInt(temp[j]);
            }
            
        }
        if(play(mat,1,1,rows))
        {
            printmat(mat);
        }
        else
        {
            System.out.println("No path Found");
        }
        
    }
    public static boolean play(int[][] mat,int row, int col,int destiny)
    {
        if(mat[row][col]==0)
        {
            System.out.println("No Path found!!!"); 
            System.exit(1);
        }
        else if(row==destiny&&col==destiny)
        {
            return true;
        }
        else
        {
           
            helper down=new helper(row+1,col);
            helper right=new helper(row,col+1);
            
            LinkedList<helper> queue=new LinkedList<>();
            if(mat[down.a][down.b]==1) queue.add(down);
            if(mat[right.a][right.b]==1) queue.add(right);
            
            while(!queue.isEmpty())
            {
                helper temp=queue.removeFirst();
                if(play(mat,temp.a,temp.b,destiny))
                {
                    mat[temp.a][temp.b]=2;
                    return true;
                }
            }
        }
        
          return false;
    }
    
}//class ends
class helper
{
    int a=0;
    int b=0;
    public helper(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    
}
