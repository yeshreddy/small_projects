/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc29042015;

/**
 *
 * @author venky
 */
import java.util.*;
public class Solution2 {
    public static int count=0;
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String in1=scan.nextLine();
        int n=Integer.parseInt(in1);
        int c=0;
        int matrix[][]=new int[4][4];
        while(c<n)
        {
            int co=4;
            for(int i=0;i<co;i++)
            {
                String in2=scan.nextLine();
                String temp[]=in2.split(" ");
                for(int j=0;j<temp.length;j++)
                {
                    matrix[i][j]=Integer.parseInt(temp[j]);
                }
            }
            answer(matrix);
            c++;
        } 
    }//main 
    public static void answer(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j] +",");
            }
            System.out.println();
        }
    }
}//class
