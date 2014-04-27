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
public class MallardDuck implements Duck {

    @Override
    public void fly() {
        
            System.out.println("I'm Fying");
    }

    @Override
    public void quack() {
        System.out.println("Duck");
    
    }
    
    
}
