/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playgame;
import elements.*;
import java.io.*;
import java.util.LinkedList;
/**
 *
 * @author yeswanth
 */
public class Play {
    
    Gamesheet sheet;
    Player player;
    LinkedList<Snake> snakelist;
    LinkedList<Ladder> ladderlist;
    Dice dice=new Dice();
    
    
    
    public void play(Gamesheet sheet,Player player,LinkedList<Snake> snakelist,LinkedList<Ladder> ladderlist)
    {
        
        this.sheet=sheet;
        this.ladderlist=ladderlist;
        this.player=player;
        this.snakelist=snakelist;
        
        printgamesheetwithelements(); // printing the board //
        try
        {
        startGame();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    /// intiating start game  to start game /// 
    
    public void startGame() throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("The stage is all set,lets play the game!!!");
        int position=1;
        while(true)
        {
            if(position>=100)
            {
                System.out.println("Congos!!! you Won the game !!!");
                break;
            }
            System.out.println("-----------------------------------------");
            System.out.println("Your position is : "+position);
            System.out.println("Your money is :"+player.getMoney());
            System.out.println("-----------------------------------------");
            System.out.println("*****************************************");
            System.out.println("*  Please enter roll to roll a dice *****");
              System.out.println("*****************************************");
            String input=in.readLine();
            if(input.equalsIgnoreCase("roll"))
            {
            int roll=dice.roll();
            System.out.println("You have rolled: "+roll);
          
            position=position+roll;
            // build the game logic from here //
            //System.out.println("Your position after roll is : "+position);
            if(sheet.getgadi(position).isSnakeheadpos())
            {
                Snake tempsnake=new Snake();
                tempsnake=tempsnake.containsSnake(snakelist,position);
                System.out.println("Danger:snake head!!!");
                int amounttopay=(tempsnake.gethead()-tempsnake.gettail());
                System.out.println("you need to pay "+amounttopay+" from your amount"+"\n"+
                                      "if yes,press y or press n");
                input=in.readLine();
                if(input.equalsIgnoreCase("y"))
                {
                    if(player.getMoney()<amounttopay)
                    {
                        position=tempsnake.gettail();
                        System.out.println("No sufficient money to pay, your are caught up by snake");
                        System.out.println("Your position is "+position);
                    }
                    else
                    {
                        player.reducemoney(amounttopay);
                        System.out.println("you account balance after deduction is "+player.getMoney());
                    }
                }
                else
                {
                     position=tempsnake.gettail();
                     System.out.println("ok,then!!! your are caught up by snake");
                        System.out.println("Your position is "+position);
                }
                
            }
            else if(sheet.getgadi(position).isladderbotpos())
            {
                Ladder templadder=new Ladder();
                templadder=templadder.containsLadder(ladderlist,position);
                System.out.println("Congos:ladder to climb!!!");
                int amounttopay=(templadder.getTop()-templadder.getBottom());
                System.out.println("you need to pay "+amounttopay+" from your amount to climb"+"\n"+
                                      "if yes,press y or press n");
                input=in.readLine();
                if(input.equalsIgnoreCase("y"))
                {
                    if(player.getMoney()<amounttopay)
                    {
                       
                        System.out.println("you cannot climb a ladder with the amount you have ");
                        System.out.println("Your position is "+position);
                    }
                    else
                    {
                        player.reducemoney(amounttopay);
                        position=templadder.getTop();
                        System.out.println("you account balance after deduction is "+player.getMoney());
                    }
                }
                else
                {
                     
                     System.out.println("No problem ,keep going");
                       player.moneyboost(roll);
                       player.healthboost(roll); 
                }
            }
            else
            {
                player.moneyboost(roll);
                player.healthboost(roll);
                
            }
            
            // refactor snake and ladder positions //
            
            }
            
            
        }
    }
    public void printgamesheetwithelements()
    {
        System.out.println("Printing the game sheet; * indicates ladder,-- indiactes snake");
        System.out.println();
        
        Gadi board[][]=sheet.getboard();
        for(int i=board.length-1;i>=0;i--)
        {
            if(i%2==0)
            {
                for(int j=0;j<board[i].length;j++)
                {
                    if(board[i][j].isLaddertoppos())
                  System.out.print(board[i][j].getNumber()+"**"+" ");
                    else if(board[i][j].isladderbotpos())
                    {
                        System.out.print(board[i][j].getNumber()+"*"+" ");
                    }
                    else if(board[i][j].isSnakeheadpos())
                    {
                        System.out.print(board[i][j].getNumber()+"--"+" ");
                    }
                    else if(board[i][j].isSnaketailpos())
                    {
                        System.out.print(board[i][j].getNumber()+"-"+" ");
                    }
                    else
                    {
                    System.out.print(board[i][j].getNumber()+" ");
                    }
                }
            }
            else
            {
              for(int j=board[i].length-1;j>=0;j--)
              {
               if(board[i][j].isLaddertoppos())
                  System.out.print(board[i][j].getNumber()+"**"+" ");
                    else if(board[i][j].isladderbotpos())
                    {
                        System.out.print(board[i][j].getNumber()+"*"+" ");
                    }
                    else if(board[i][j].isSnakeheadpos())
                    {
                        System.out.print(board[i][j].getNumber()+"--"+" ");
                    }
                    else if(board[i][j].isSnaketailpos())
                    {
                        System.out.print(board[i][j].getNumber()+"-"+" ");
                    }
                    else
                    {
                    System.out.print(board[i][j].getNumber()+" ");
                    }
              }
            }
            System.out.println();
        }
    }
}
