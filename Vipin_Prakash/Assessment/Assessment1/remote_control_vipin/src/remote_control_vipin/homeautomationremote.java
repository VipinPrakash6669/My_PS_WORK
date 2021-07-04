
package remote_control_vipin;

public class homeautomationremote {
	Icommand command;
	 
    //Set the command in runtime to trigger.
    public void setCommand(Icommand command) {
        this.command = command;
    }
 
    //Will call the command interface method so that particular command can be invoked.
    public void buttonPressed() {
        command.execute();
    }
    public void change_ac_temp(int val) {
        AC ac=new AC(25);
        ac.changetemp(val);
        ac.getTemp();
    }
}
