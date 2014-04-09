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
public class FlyRocketPowered implements FlyBehavior{
   

    @Override
    public void fly() {
        
        System.out.println("I'm flying with a rocket!");
    }
}
