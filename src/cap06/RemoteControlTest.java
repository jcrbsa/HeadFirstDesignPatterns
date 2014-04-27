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
public class RemoteControlTest {
    
    
    public static void main(String[] args) {
        SimpleRemotoControl controlTest = new  SimpleRemotoControl();
        
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        controlTest.setSlot(lightOnCommand);
        controlTest.buttonWasPressed();
        
        GarageDoor garageDoor  = new GarageDoor();
        
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        
        
        controlTest.setSlot(garageDoorOpenCommand);
        controlTest.buttonWasPressed();
    }
}
