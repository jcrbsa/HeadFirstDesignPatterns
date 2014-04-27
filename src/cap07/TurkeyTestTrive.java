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
public class TurkeyTestTrive {
    public static void main(String[] args) {
        
        MallardDuck duck =  new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Turkey duckyAdapter = new DuckAdapter(duck);
        System.out.println("The Duck says...");
        duck.quack();
        duck.fly();
        
        
        System.out.println("\nThe Turkey says...");
        testDuck(turkey);
        System.out.println("\nThe DuckAdapter says...");
        testDuck(duckyAdapter);
        }
    
      static void testDuck(Turkey turkey){
        
        turkey.gooble();
        turkey.fly();
    }
}
