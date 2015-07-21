/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc25032015.problem1;

/**
 *
 * @author yeswanth
 */
public class Solution {
    
    public void solve(int n) {
       if (n == 1) {
            System.out.println("1");
           //System.out.println(start + " -> " + end);
       } else {
           solve(n - 1);
           //System.out.println(start + " -> " + end);
           //solve(n - 1, auxiliary, start, end);
       }
   }
    
}
