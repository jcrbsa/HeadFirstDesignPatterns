/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cap01.simuduck;

/**
 *
 * @author bruno.andrade
 */
public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBeharvior = new Quack();
    }

    
    
    
    @Override
    void display() {
        
        System.out.println("I'm a model duck");
    }
    
    
    
}
