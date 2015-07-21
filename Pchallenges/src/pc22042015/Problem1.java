/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc22042015;

import java.io.*;
import java.util.Hashtable;

/**
 *
 * @author yeswanth
 */
public class Problem1 {
    
    
    public static void main(String args[]) throws Exception
    {
       BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
       String input="1,4,7,3";
       String h[]=input.split(",");
       
       Node root=new Node();
       
       Node temp=root;
       for(int i=0;i<h.length;i++)
       {
           int place=i+1;
           int face=Integer.parseInt(h[i]);
           Node t=new Node();
           t.value=face;
           t.postion=place;
           t.previous=temp;
           temp.next=t;
           
           temp=t;
           
       }
       int min=1;//Integer.parseInt(in.readLine());
       int max=4;//Integer.parseInt(in.readLine());
       
         temp=splice(root,min,max);
         //display(temp);
         temp=sort(temp);
         System.out.println(temp.value);
    }
    public static Node splice(Node root,int min,int max)
    {
        int count=0;
        Node first=new Node();
        while(root.next!=null)
        {
               count++;
            if(root.postion==max)
            {
                //System.out.println("last"+root.value);
                root.next=null;
                
                break;
            }
         
            root=root.next;
            if(root.postion==min)
            {
                //System.out.println("first"+root.value);
                first=root;
                first.previous=null;
                root=first;
            }
            
        }
        return first;
    }
    public static Node sort(Node root)
    {
        if(root.next==null)
        {
            return root;
        }
        int length=0;
        Node temp=root;
        while(temp!=null)
        {
            length++;
            temp=temp.next;
        }
        
        int count=0;
        Node first=root;
        Node sec=new Node();
        while(true)
        {         
            
            count++;
            if(count==length/2)
            {
                        sec=root.next;
                        sec.previous=null;
                        root.next=null;
                        break;
            }
            root=root.next;
        }
        System.out.println("first"+first.value);
        System.out.println("sec"+sec.value);
        first=merge(sort(first),sort(sec));
        
        
        
       // System.out.println("returned is"+first.value);
        return first;
    }
    public static Node merge(Node first,Node sec)
    {
       
           while(true)
           {
              
              if(first.value<sec.value)
              {
                 if(first.next==null)
                 {
                     first.next=sec;
                     break;
                 }
                 first=first.next;
              }
              else if(first.value>sec.value)
              {
                  System.out.println("hi");
                  Node t=sec;
                  Node g=first.previous;
                  first.previous=t;
                  t.next=first;
                  t.previous=g;
                  sec.previous=null;
                  System.out.println("sec next"+sec.next);
                  if(sec.next==null)
                  {
                      System.out.println("yessiis "+t.value);
                      return t;
                  }
                  sec=sec.next;
                  
                  
              }
           }
           System.out.println("returned is "+first.value);
           return first;
           
    }
    public static void display(Node root)
        {
            
            while(root!=null)
            {
                System.out.println(root.value);
                System.out.println();
                root=root.next;
            }
        }
    
}
class Node
{
    Node next;
    Node previous;
    int value;
    int postion;
}

