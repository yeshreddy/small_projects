/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackinterview;

/**
 *
 * @author yeswanth
 */
import problems.Problem1_6;
import helper.twodmatrix;
public class Crackinterview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Problem1_6 p=new Problem1_6();
        int mat[][]={{1}};
        twodmatrix two=new twodmatrix();
        p.transform(mat);
        two.print(mat);
    }
    
}
