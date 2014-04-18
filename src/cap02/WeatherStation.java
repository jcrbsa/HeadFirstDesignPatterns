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
public class WeatherStation {
    
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        
        CurrentConditions currentConditions =  new CurrentConditions(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay  forecastDisplay =  new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurementsChanged(80,65, 30.4f);
        weatherData.setMeasurementsChanged(82, 70, 29.2f);
        weatherData.setMeasurementsChanged(78, 90, 29.2f);
        
        
    }
}
