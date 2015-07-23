/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elements;

import java.util.LinkedList;

/**
 *
 * @author yeswanth
 */
public class Own implements java.io.Serializable
{
    private Gamesheet g;
    private Player p;
    private LinkedList<Snake> ls;
    private LinkedList<Ladder> ll;
    
    public Own(Gamesheet g,Player p,LinkedList<Snake> ls,LinkedList<Ladder> ll)
    {
        this.g=g;
        this.p=p;
        this.ls=ls;
        this.ll=ll;
    }

    /**
     * @return the g
     */
    public Gamesheet getG() {
        return g;
    }

    /**
     * @return the p
     */
    public Player getP() {
        return p;
    }

    /**
     * @return the ls
     */
    public LinkedList<Snake> getLs() {
        return ls;
    }

    /**
     * @return the ll
     */
    public LinkedList<Ladder> getLl() {
        return ll;
    }
}
