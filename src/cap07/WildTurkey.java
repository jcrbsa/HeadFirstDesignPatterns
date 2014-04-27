/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cap07;

/**
 *
 * @author bruno.andrade
 */
public class WildTurkey implements Turkey {

    @Override
    public void gooble() {
        System.out.println("Goobble gooble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
    
}
