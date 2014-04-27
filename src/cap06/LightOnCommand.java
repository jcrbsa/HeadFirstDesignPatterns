/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cap06;

/**
 *
 * @author bruno.andrade
 */
public class LightOnCommand implements Command{

    Light light;

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public LightOnCommand(Light light) {
        this.light = light;
    }
    
    
    
    @Override
    public void execute() {
        light.on();
        
    }

    @Override
    public void undo() {
        light.off();
    }
    
}
