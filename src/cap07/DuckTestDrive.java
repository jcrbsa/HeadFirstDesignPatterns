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
public class DuckTestDrive {
    static void testDuck(Duck duck){
        
        duck.quack();
        duck.fly();
    }
        
    public static void main(String[] args) {
        MallardDuck duck =  new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck duckAdapter = new TurkeyAdapter(turkey);
        System.out.println("The Turkey says...");
        turkey.gooble();
        turkey.fly();
        
        
        System.out.println("\nThe Duck says...");
        testDuck(duck);
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(duckAdapter);
    }
    
}
