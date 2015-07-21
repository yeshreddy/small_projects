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
class Test { 
    public static void main(String [] args) throws Exception{ 
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
        String str = in.readLine();
        int input=Integer.parseInt(in.readLine());
        System.out.println(getLastitem(str,input));
        
    } 
    public static String getLastitem(String inputstring,int input)
    {
        String tokens[]=inputstring.split(",");
        Linkedlist ll=new Linkedlist();
        for(int i=0;i<tokens.length;i++){
            ll.insert(tokens[i], i+1);
        }
        Node result=ll.remove(ll.head, input);
        System.out.println(result.value);
        //System.out.println("list is "+ll.toString());
        return "";    
    }
}
class Node{
    String value;
    int pos;
    Node next;
    Node previous;
    public Node(String value,int pos,Node next,Node previous){
        this.value=value;
        this.pos=pos;
        this.next=next;
        this.previous=previous;
    }
}
class Linkedlist{
    Node head;
    Node last;
    int size=0;
    public Linkedlist(){
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
            
        }
        
    }
    public Node remove(Node tomb,int pointer){
        
        if(tomb.pos==tomb.next.pos) return tomb;
        Node temp=tomb;
        Node hum;
        int count=1;
        while(count++!=pointer){
            temp=temp.next;
        }
        hum=temp;
        
        Node tempo=hum.next;
        hum.previous.next=hum.next;
        hum.next.previous=hum.previous;  
        return remove(tempo,pointer);
        
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