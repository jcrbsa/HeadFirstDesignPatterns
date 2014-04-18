/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cap02;

/**
 *
 * @author bruno.andrade
 */
public class CurrentConditions implements DisplayElement, Observer{
    
   private  float humidity ;
     private    float temperature ;
   
    private  Subject weatherData ;

    public CurrentConditions(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    @Override
    public void display() {
        
        System.out.println("Current Conditions: " + temperature + "F degrees and " + humidity + "% humidity") ;
    }

    @Override
    public void update(float temp, float humi, float pres) {
        temperature = temp;
        humidity = humi;
        display();
    }
}
