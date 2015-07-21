/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc25022015;

/**
 *
 * @author yeswanth
 */
import java.io.*;
import java.util.*;
public class Solution {
    static int rot=0;
public static void main(String args[] ) throws Exception {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    int firstline=Integer.parseInt(in.readLine());
    
    
    for(int k=0;k<firstline;k++)
    {
        in.readLine();
         int elements=Integer.parseInt(in.readLine());
         int rotateon=Integer.parseInt(in.readLine());
         rot=rotateon;
         String input=in.readLine();
          String str[]=input.split(",");
        int j=0;
        LinkedList<Node> ele=new LinkedList<Node>();
        for(String i: str)
        {
            
            ele.add(new Node(Integer.parseInt(i),j));
            
            j++;
        }
         int tosearch=Integer.parseInt(in.readLine());
        play(ele,rotateon,tosearch);
        
    }
}
    public static void play(LinkedList<Node> e,int rot,int search)
    {
        
        
        for(int i=0;i<rot;i++)
            {
               e=rotate(e);
            }
        
      int i=0;
      for(Node n:e)
      {
          n.value=i;
          i++;
      }
        
        //System.out.println();
        tree t=new tree();
        t.search(e,search);
        
    }
    public static LinkedList<Node> rotate(LinkedList<Node> e)
        {
            Node temp=e.pollLast();
            e.addFirst(temp);
            
            //System.out.println(e.getFirst().key+" "+ temp.key);
            
        return e;
    }
}
class tree
    {
    Node root;
    LinkedList<Node> left=new LinkedList<>(); // small values
    LinkedList<Node> right=new LinkedList<>(); //large values
    
    public void search(LinkedList<Node> arr,int s)
      {
        left=new LinkedList<Node>();
        right=new LinkedList<Node>();
        if(arr.size()==0)
            {
            System.out.println(-1);
            return;
        }
        root=arr.get(0);
        if(s==root.key)
            {
            System.out.println(root.value+1);
            return;
        }
        for(int i=1;i<arr.size();i++)
            {
            if(root.key>arr.get(i).key)
                {
                left.add(arr.get(i));
                    
            }
            else
                {
                right.add(arr.get(i));
            }
        }
     
        if(s<root.key)
           {
            search(left,s);
        }
        else
            {
            search(right,s);
        }
            
                
      }
         
          
}// class tree
   
        
        
    
    
    

class Node
    {
    int key;
    int value;
    Node left=null;
    Node right=null;
    public Node(int key,int value)
        {
        this.key=key;
        this.value=value;
    }
}
