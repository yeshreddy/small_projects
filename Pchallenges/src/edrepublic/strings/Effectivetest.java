/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edrepublic.strings;
/**
 *
 * @author yeswanth
 */
import java.io.*; 
import java.util.*; 
class Effectivetest { 
    public static void main(String [] args) throws Exception{ 
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
        String str = in.readLine();
        int input=Integer.parseInt(in.readLine());
        System.out.println(getLastitem(str,input));
        
    } 
    public static String getLastitem(String inputstring,int input)
    {
        String tokens[]=inputstring.split(",");
        Linkedlist1 ll=new Linkedlist1();
        for(int i=0;i<tokens.length;i++){
            ll.insert(tokens[i], i+1);
        }
        Node result=ll.remove(ll.head,ll.last,input);
        System.out.println(result.value);
        //System.out.println("list is "+ll.toString());
        return "";    
    }
}

class Linkedlist1{
    Node head;
    Node last;
    int size=0;
    public Linkedlist1(){
        head=new Node(null,0,null,null);
        last=head;
    }
    public void insert(String value,int pos){
        
        if(size==0)
        {
            head.value=value;
            head.pos=pos;
            size++;
        }
        else{
            Node temp=new Node(value,pos,null,null);
            
            last.next=temp;
            temp.previous=last;
            //System.out.println("head debug is "+temp.previous.value);
            temp.next=head;
            head.previous=temp;
            last=temp;
            size++;
            
        }
        
    }
    public Node remove(Node start,Node lastnode,int pointer){
        if(start.pos==start.next.pos) return start;
        Node temp;
        int count;
        int terminal=pointer%size;
        if(terminal==0) terminal=size;
        
        if(terminal>size/2){
            temp=lastnode;
            count=size;
            while(count!=terminal){
                temp=temp.previous;
                count--;
            }
        }
        else{
            temp=start;
            count=1;
            while(count!=terminal){
                temp=temp.next;
                count++;
            }
        }
            
        Node templastnode=temp.previous;
        Node nexthead=temp.next;
        temp.previous.next=temp.next;
        temp.next.previous=temp.previous;
        size=size-1;
        return remove(nexthead,templastnode,pointer);
        
    }
    @Override
    public String toString()
    {
        String res="";
        Node temp=head.next;
        res=res+head.value+",";
        //System.out.println(head.next.value);
        
        while(temp.pos!=1){
            //System.out.println(temp.value);
            res=res+temp.value+",";
            temp=temp.next;
        }
        return res;
    }
}
