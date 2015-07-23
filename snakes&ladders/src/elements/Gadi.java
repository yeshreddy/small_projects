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
public class Gadi implements java.io.Serializable{
    
    private int number;
    private boolean snakeheadpos=false;
    private boolean snaketailpos=false;
    private boolean laddertoppos=false;
    private boolean ladderbotpos=false;
    
    
    public Gadi(int num)
    {
        this.number=num;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param snakeheadpos the snakeheadpos to set
     */
    public void setSnakeheadpos(boolean snakeheadpos) {
        this.snakeheadpos = snakeheadpos;
    }

    /**
     * @param snaketailpos the snaketailpos to set
     */
    public void setSnaketailpos(boolean snaketailpos) {
        this.snaketailpos = snaketailpos;
    }

    /**
     * @param laddertoppos the laddertoppos to set
     */
    public void setLaddertoppos(boolean laddertoppos) {
        this.laddertoppos = laddertoppos;
    }

    /**
     * @param snakebotpos the snakebotpos to set
     */
    public void setladderbotpos(boolean ladderbotpos) {
        this.ladderbotpos = ladderbotpos;
    }

    /**
     * @return the snakeheadpos
     */
    public boolean isSnakeheadpos() {
        return snakeheadpos;
    }

    /**
     * @return the snaketailpos
     */
    public boolean isSnaketailpos() {
        return snaketailpos;
    }

    /**
     * @return the laddertoppos
     */
    public boolean isLaddertoppos() {
        return laddertoppos;
    }

    /**
     * @return the snakebotpos
     */
    public boolean isladderbotpos() {
        return ladderbotpos;
    }
    
    
    
}
