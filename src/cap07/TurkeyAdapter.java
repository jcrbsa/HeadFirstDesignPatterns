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
public class TurkeyAdapter implements Duck{
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey1) {
        turkey = turkey1;
    }
    @Override
    public void fly() {
        turkey.gooble();
    }

    @Override
    public void quack() {
        for (int i = 0; i < 5; i++) {
               turkey.fly();
        }
     
    }

    
}
