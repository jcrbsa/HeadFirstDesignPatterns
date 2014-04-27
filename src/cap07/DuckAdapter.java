/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cap07;

import java.util.Random;

/**
 *
 * @author bruno.andrade
 */
public class DuckAdapter implements Turkey{

    Duck duck;
    Random rand;
    public DuckAdapter(Duck duck) {
        this.duck = duck;
        rand = new Random();
    }
    
    
    
    @Override
    public void gooble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if(rand.nextInt(5) == 0){
        duck.fly();
        }
    }
    
}
