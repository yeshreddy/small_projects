/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elements;

/**
 *
 * @author yeswanth
 */
public class Dice implements java.io.Serializable{
    
    public int roll()
    {
        int val1= (int)(1+Math.random()*6);
        int val2= 0;//(int)(1+Math.random()*6);
        return val1+val2;
    }
}
