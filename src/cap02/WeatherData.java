/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cap02;

import java.util.ArrayList;

/**
 *
 * @author bruno.andrade
 */
public class WeatherData implements Subject {
    
    
  
    

    public WeatherData() {
        observers =  new ArrayList();
    }

    public WeatherData(CurrentConditions currentConditionsDisplay, Statistics statisticsDisplay, Forecast forecastDisplay ) {
        
    }
    
     private ArrayList observers;
     private  float humidity ;
     private    float pressure ;
      private   float temperature;
    
    /*public void measurementsChanged(){
        
        float humidity = getHumidity();
        float pressure = getPressure();
        float temperature = getTemperature();
        
        
        currentConditionsDisplay.uptdate(temperature, humidity, pressure);
        statisticsDisplay.uptdate(temperature, humidity, pressure);
        forecastDisplay.uptdate(temperature, humidity, pressure);
        
        
    }*/
    
    public void measurementsChanged(){
        
        notifyObsevers();
        
        
    }
    
    public void setMeasurementsChanged(float temp, float humi, float pres){
        humidity = humi;
        pressure = pres;
        temperature = temp;
       
        measurementsChanged();
        
    }

       
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(o);
                    
        }
    }

    @Override
    public void notifyObsevers() {
        for (int i = 0 ; i < observers.size(); i++) {
            Observer o = (Observer) observers.get(i);
            o.update(temperature, humidity, pressure);
        }
    }
    
}
