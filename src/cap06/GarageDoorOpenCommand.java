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
public class GarageDoorOpenCommand 
        implements Command {
    
    GarageDoor garagedoor;

    public GarageDoorOpenCommand(GarageDoor garagedoor) {
        this.garagedoor = garagedoor;
    }

    @Override
    public void execute() {
        
        garagedoor.up();
        garagedoor.lightOn();
        garagedoor.stop();
        garagedoor.lightOff();
        garagedoor.down();

        
    }

    @Override
    public void undo() {
        garagedoor.lightOff();
    }
    
    
    
}
