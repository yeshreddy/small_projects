/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author yeswanth
 */
public class Master_ui {
    
    public void display()
    {
        System.out.println("You chose to build the game and then play!!!");
        
                           
    }
    public void instructions()
    {
        System.out.println("Hai, welcome to snakes and ladders game !!!" +"\n"+
                           "Intsructions:"+"\n"+
                           "* This is a game which runs on a IDE Console "+"\n"+
                           "* you can directly play the game or you can set your own snakes and ladders"+"\n"+
                           "* To setup your own snakes and ladders,select 1 from the menu"+"\n"+
                           "* To play the game with default snakes and ladders,select 2 from the menu"+"\n"+
                           "* To quit the game ,select 4");
        
    }
    public void howtoplay()
    {
        System.out.println("How to play"+"\n"+
                           "* You will be given a Rs.5 in your account "+"\n"+
                           "* you hava to roll a dice and the dice count moves your postion forward"+"\n"+
                           "* If you hit a snake,you can stop the snake eating you by spending some amount in your account"+"\n"+
                           "* If you hit a ladder, you can climb the ladder just by spending some money"+"/n"+
                           "* If you reach end of the board,you are a winner");
    }
}
