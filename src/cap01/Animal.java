/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cap01;

/**
 *
 * @author bruno.andrade
 */
public abstract class Animal {
    
    public static void main(String[] args) {
        
        //Case 1: Implementação Concreta
        
        Dog d = new Dog();
        d.bark();
        
        //Case2: interface
        Animal animal = new Dog();
        animal.makesound();
       
        /*Case3: implementacao concreta em tempo de execucao
        
       Animal
       
                */
        
        Animal a;
         a = getAnimal();
        animal.makesound();
        
    }

   static Animal animal;
   abstract void  makesound();
   
   
   public static Animal getAnimal(){    
       
       if(animal instanceof Dog){
       
       return new Dog();
       }else if (animal instanceof Cat){
           return new Cat();
       }else
           return null;
    }
   
}
    
