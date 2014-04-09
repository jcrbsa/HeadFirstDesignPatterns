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
public abstract class Duck {
    
    FlyBehavior flyBehavior;
    QuackBeharvior quackBeharvior;
    
    
 public  void performQuack(){
    quackBeharvior.quack();
}
    void swim(){
        
        System.out.println("All ducks float , even decoys!");
    }
    abstract void display();
    void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBeharvior(QuackBeharvior quackBeharvior) {
        this.quackBeharvior = quackBeharvior;
    }
    
    
    
    
}
