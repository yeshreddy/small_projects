/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consoles;
import ui.Master_ui;
import java.io.*;
import java.util.*;
import elements.*;
import playgame.*;

/**
 *
 * @author yeswanth
 */
public class Master_console {
    
    
    Gamesheet gamesheet=new Gamesheet();
    Player player=new Player();
    Snake snake=new Snake();
    Ladder ladder=new Ladder();
    Master_ui masterui=new Master_ui();
    LinkedList<Snake> snakelist=new LinkedList<>();
    LinkedList<Ladder> ladderlist=new LinkedList<>();
    ArrayList<Integer> snakeheads=new ArrayList<Integer>();
    ArrayList<Integer> ladderbottoms=new ArrayList<Integer>();
    Helper help=new Helper();
    Dice dice=new Dice();
    Play play=new Play();
    
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    
    
    public void runConsole() throws IOException
    {
       masterui.display();                     /// user interface display
       gamesheet=gamesheet.setGamesheet();     /// setting game sheet
       player=player.setplayer();              /// setting player
       String input="";
       
       /// setting snake postion ///
       do
       {
           
          snake=snake.setSnake(gamesheet.getGadinumber(),gamesheet);
          if(!snakeheads.contains(snake.gethead()))
          {
              snakelist.add(snake);
              snakeheads.add(snake.gethead());
                
          }
           System.out.println("Do you want to add another snake?if yes press y or press any other to continue");
          input=in.readLine();
          
       }while(input.equals("y"));
       
       /// setting up ladder ///
       
        do
       {
           
          ladder=ladder.setLadder(gamesheet.getGadinumber(),gamesheet);
          
          if(!ladderbottoms.contains(ladder.getBottom()))
          {
              ladderlist.add(ladder);
              ladderbottoms.add(ladder.getBottom());
          }
           System.out.println("Do you want to add another ladder?if yes press y or press any other to continue");
          input=in.readLine();
          
       }while(input.equals("y"));
        
        
        
        for(int i=0;i<snakelist.size();i++)
        {
            gamesheet.getgadi(snakelist.get(i).gethead()).setSnakeheadpos(true);
            gamesheet.getgadi(snakelist.get(i).gettail()).setSnaketailpos(true);
                    
        }
        for(int i=0;i<ladderlist.size();i++)
        {
            gamesheet.getgadi(ladderlist.get(i).getBottom()).setladderbotpos(true);
            gamesheet.getgadi(ladderlist.get(i).getTop()).setLaddertoppos(true);
        }
        
        elements.Own o=new elements.Own(gamesheet, player, snakelist, ladderlist);
        
        //help.ser(o);   // serialising object which contains gamesheet,player,snakelist,ladderlist //
        
        /// start playing game by sending all the elements required ///
        play.play(gamesheet, player, snakelist, ladderlist);
       
       
       
    }
    /// completed setting up parameters
    
}
