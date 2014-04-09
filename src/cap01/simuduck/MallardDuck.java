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
public class MallardDuck extends Duck{
    
    public MallardDuck(){
        quackBeharvior = new Quack();
        flyBehavior = new FlyWithWings();
        
    }
    
    public void display(){
        System.out.println("I'm really Mallard Duck");
        
    }
            
    
}
