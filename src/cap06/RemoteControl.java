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
public class RemoteControl {
    
    Command[]  onCommands;
    Command[]  offCommands;

    public RemoteControl(Command[] onCommands, Command[] offCommands) {
        this.onCommands = onCommands;
        this.offCommands = offCommands;
        
        
        Command noCommand = new NoCommand();
        
    }
    
    
    
    
}
